grammar CodexLatinus;

/* ============================================================
   PROGRAMA
   ============================================================ */

program
    : globalSection? funcSection? mainSection FIN_PROGRAMA SEMI EOF
    ;

globalSection
    : SEC_VARIABILES GT globalDeclaration*
    ;

globalDeclaration
    : varDeclaration
    | arrayDeclaration
    | structDefinition
    | structVarDeclaration
    ;

funcSection
    : SEC_MUNERA GT functionDefinition*
    ;

mainSection
    : SEC_MAIOR GT statement*
    ;

/* ============================================================
   FUNCIONES
   ============================================================ */

functionDefinition
    : ratioFunction
    | actioFunction
    ;

ratioFunction
    : KW_RATIO type IDENT LPAREN paramList? RPAREN
      LBRACE localVarSection? statement* RBRACE FIN_BLOQUE SEMI
    ;

actioFunction
    : KW_ACTIO IDENT LPAREN paramList? RPAREN
      LBRACE localVarSection? statement* RBRACE FIN_BLOQUE SEMI
    ;

paramList
    : param (COMMA param)*
    ;

param
    : KW_ESTO IDENT COLON type
    ;

localVarSection
    : SEC_VARIABILES LBRACK localDeclaration* RBRACK
    ;

localDeclaration
    : varDeclaration
    | arrayDeclaration
    | structDefinition
    | structVarDeclaration
    ;

/* ============================================================
   TIPOS
   ============================================================ */

type
    : primitiveType
    | IDENT                      // tipo de estructura definida por el usuario
    ;

primitiveType
    : KW_NUMERUS
    | KW_TEXTUM
    | KW_DECIMALIS
    | KW_LITTERA
    | KW_BOOL
    ;

/* ============================================================
   DECLARACION DE VARIABLES
   ============================================================ */

varDeclaration
    : KW_ESTO IDENT COLON (VERUM | FALSUS) SEMI                # boolShorthandDecl
    | KW_ESTO IDENT COLON type expr? SEMI                      # typedVarDecl
    ;

/* ============================================================
   ARREGLOS (series)
   ============================================================ */

// forma tipada normal: series id[tam] : tipo {...}? ;
// forma especial booleana (sin tipo, se infiere por verum/falsus): series id[tam] : {verum, falsus} ;
arrayDeclaration
    : KW_SERIES IDENT LBRACK expr RBRACK COLON arrayType arrayInit? SEMI   # typedArrayDecl
    | KW_SERIES IDENT LBRACK expr RBRACK COLON arrayInit SEMI              # boolArrayDecl
    ;

arrayType
    : primitiveType
    | IDENT
    ;

arrayInit
    : LBRACE exprList? RBRACE
    ;

exprList
    : expr (COMMA expr)*
    ;

/* ============================================================
   ESTRUCTURAS (structura)
   ============================================================ */

structDefinition
    : KW_STRUCTURA IDENT LBRACE structMember* RBRACE FIN_BLOQUE SEMI
    ;

// los atributos se separan con ';' o ',' (según el enunciado ambas son válidas)
structMember
    : KW_ESTO IDENT COLON memberType structMemberSep
    | KW_SERIES IDENT COLON memberType structMemberSep    // arreglo dentro de struct: sin tamaño
    ;

structMemberSep
    : SEMI
    | COMMA
    ;

memberType
    : primitiveType
    | VERUM
    | FALSUS
    | IDENT
    ;

// declaración de variable de tipo estructura: esto x : Tipo { campo: valor, ... }  (SIN ';')
structVarDeclaration
    : KW_ESTO IDENT COLON IDENT structLiteral
    ;

structLiteral
    : LBRACE structFieldInit (COMMA structFieldInit)* RBRACE
    ;

structFieldInit
    : IDENT COLON expr
    ;

/* ============================================================
   SENTENCIAS (solo dentro de MAIOR, si/dum/per/facere, cuerpos de función)
   NOTA: las declaraciones de variables/arreglos/estructuras NO son
   sentencias válidas aquí: solo pueden aparecer en VARIABILES> o VARIABILES[].
   ============================================================ */

statement
    : assignment
    | printStmt
    | readStmt
    | ifStmt
    | whileStmt
    | doWhileStmt
    | forStmt
    | incDecStmt
    | functionCallStmt
    | returnStmt
    | breakStmt
    | continueStmt
    ;

// asignación normal: termina en ';'
// asignación con literal de estructura: termina en '}', SIN ';' (confirmado por el auxiliar)
assignment
    : lvalue ASSIGN expr SEMI          # exprAssignment
    | lvalue ASSIGN structLiteral      # structLiteralAssignment
    ;

lvalue
    : IDENT (DOT IDENT | LBRACK expr RBRACK)*
    ;

printStmt
    : PRINT expr (PRINT expr)* SEMI
    ;

// la lectura NUNCA lleva ';'
readStmt
    : READ
    | IDENT READ
    ;

ifStmt
    : KW_SI LPAREN expr RPAREN LBRACE statement* RBRACE
      elseIfClause*
      elseClause?
      FIN_BLOQUE SEMI
    ;

elseIfClause
    : KW_ALITER LPAREN expr RPAREN LBRACE statement* RBRACE
    ;

elseClause
    : KW_ALITER LBRACE statement* RBRACE
    ;

whileStmt
    : KW_DUM LPAREN expr RPAREN LBRACE statement* RBRACE FIN_BLOQUE SEMI
    ;

doWhileStmt
    : KW_FACERE LBRACE statement* RBRACE KW_DUM LPAREN expr RPAREN SEMI
    ;

// OJO: en el ejemplo del enunciado 'per' cierra solo con '}', sin 'finis;'.
// Verificar con el profesor; si confirma que sí lleva, agregar 'FIN_BLOQUE SEMI' al final.
forStmt
    : KW_PER LPAREN forInit SEMI expr SEMI forUpdate RPAREN LBRACE statement* RBRACE
    ;

forInit
    : KW_ESTO IDENT COLON type expr?
    ;

forUpdate
    : lvalue (INC | DEC)
    | lvalue ASSIGN expr
    ;

incDecStmt
    : lvalue (INC | DEC) SEMI
    ;

functionCallStmt
    : functionCall SEMI
    ;

functionCall
    : IDENT LPAREN argList? RPAREN
    ;

argList
    : expr (COMMA expr)*
    ;

returnStmt
    : KW_REDDERE expr SEMI
    ;

breakStmt
    : KW_INTERRUMPE SEMI
    ;

continueStmt
    : KW_PERGE SEMI
    ;

/* ============================================================
   EXPRESIONES (recursión izquierda permitida solo aquí)
   ============================================================ */

expr
    : logicalOrExpr
    ;

logicalOrExpr
    : logicalOrExpr OR logicalAndExpr
    | logicalAndExpr
    ;

logicalAndExpr
    : logicalAndExpr AND equalityExpr
    | equalityExpr
    ;

equalityExpr
    : equalityExpr (EQ | NEQ) relationalExpr
    | relationalExpr
    ;

relationalExpr
    : relationalExpr (LT | GT | LE | GE) additiveExpr
    | additiveExpr
    ;

additiveExpr
    : additiveExpr (PLUS | MINUS) multiplicativeExpr
    | multiplicativeExpr
    ;

multiplicativeExpr
    : multiplicativeExpr (STAR | SLASH) unaryExpr
    | unaryExpr
    ;

unaryExpr
    : (NOT | MINUS) unaryExpr
    | postfixExpr
    ;

// encadenamiento: variable.propiedad, variable[i], variable.array[i].sub.propiedad, ++/--
postfixExpr
    : atom (DOT IDENT | LBRACK expr RBRACK)* (INC | DEC)?
    ;

atom
    : NUMERUS_LIT
    | DECIMAL_LIT
    | TEXTUM_LIT
    | LITTERA_LIT
    | VERUM
    | FALSUS
    | functionCall
    | IDENT
    | LPAREN expr RPAREN
    ;

/* ============================================================
   LEXER
   ============================================================ */

// --- marcadores de sección / fin de programa ---
SEC_VARIABILES : 'VARIABILES' ;
SEC_MUNERA     : 'MUNERA' ;
SEC_MAIOR      : 'MAIOR' ;
FIN_PROGRAMA   : 'FINIS' ;   // mayúscula: cierra todo el programa
FIN_BLOQUE     : 'finis' ;   // minúscula: cierra structura/funcion/si/dum

// --- palabras reservadas ---
KW_ESTO        : 'esto' ;
KW_SERIES      : 'series' ;
KW_STRUCTURA   : 'structura' ;
KW_RATIO       : 'ratio' ;
KW_ACTIO       : 'actio' ;
KW_REDDERE     : 'reddere' ;
KW_SI          : 'si' ;
KW_ALITER      : 'aliter' ;
KW_DUM         : 'dum' ;
KW_FACERE      : 'facere' ;
KW_PER         : 'per' ;
KW_PERGE       : 'perge' ;
KW_INTERRUMPE  : 'interrumpe' ;
NOT            : 'non' ;

// --- tipos primitivos ---
KW_NUMERUS     : 'numerus' ;
KW_TEXTUM      : 'textum' ;
KW_DECIMALIS   : 'decimalis' ;
KW_LITTERA     : 'littera' ;
KW_BOOL        : 'bool' ;

// --- literales booleanos ---
VERUM          : 'verum' ;
FALSUS         : 'falsus' ;

// --- operadores de dos caracteres (deben ir antes que los de uno) ---
EQ             : '==' ;
NEQ            : '!=' ;
LE             : '<=' ;
GE             : '>=' ;
AND            : '&&' ;
OR             : '||' ;
INC            : '++' ;
DEC            : '--' ;
READ           : '<<' ;
PRINT          : '>>' ;

// --- operadores de un caracter ---
PLUS           : '+' ;
MINUS          : '-' ;
STAR           : '*' ;
SLASH          : '/' ;
LT             : '<' ;
GT             : '>' ;
ASSIGN         : '=' ;

// --- puntuación ---
LPAREN         : '(' ;
RPAREN         : ')' ;
LBRACE         : '{' ;
RBRACE         : '}' ;
LBRACK         : '[' ;
RBRACK         : ']' ;
COLON          : ':' ;
SEMI           : ';' ;
COMMA          : ',' ;
DOT            : '.' ;

// --- literales ---
DECIMAL_LIT
    : [0-9]+ '.' [0-9]+
    ;

NUMERUS_LIT
    : [0-9]+
    ;

TEXTUM_LIT
    : '"' (~["\\\r\n] | '\\' .)* '"'
    ;

LITTERA_LIT
    : '\'' (~['\\\r\n] | '\\' .) '\''
    ;

// --- identificadores (van después de todas las palabras reservadas) ---
IDENT
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

// --- comentarios y espacios en blanco ---
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '##' .*? '##' -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
