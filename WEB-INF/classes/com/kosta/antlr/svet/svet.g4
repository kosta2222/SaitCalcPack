grammar svet;
options{
language=Java;
}
input:svet;
svet: 'svet' ':' ((lamp)? (comp)? (refrig)? (telic)? ) rub n;

lamp: 'lamp' '('kolvoVat ',' amount ')''['rab']' #ToLamp
;

comp: 'comp' '('kolvoVat ',' amount ')''['rab']' #ToComp
;

refrig: 'refrig' '('kolvoVat ',' amount ')''['rab']' #ToRefrig
;

telic: 'telic' '('kolvoVat ',' amount ')''['rab']' #ToTel
;

rub: 'rub' '=' atom #ToRub
;

n: 'N''=' atom #ToN
;
kolvoVat: atom #ToKolVat
;
amount  : atom #ToAmount
;
rab:     atom #ToRab
;

atom:
INT      #ToInt
| DOUBLE  #ToDouble
;
//Lexer Rules
INT:[0-9]+
;
 DOUBLE:[0-9] + '.' [0-9]+
 ;
COMMENT: '//' .+?('\n' | EOF) ->skip;
WS :[ \t\r\u000C\n]+ ->skip;
