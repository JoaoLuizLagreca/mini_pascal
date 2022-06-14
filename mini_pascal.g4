grammar mini_pascal;

options {
	caseInsensitive = true;
}

@header{
	import br.senac.minipascal.structure.*;
	import java.util.Hashtable;
	import org.antlr.v4.runtime.Token;
	import java.util.Stack;
}

@parser::members{
	byte ultimoTipo;
	MiniPascalVariable ultimaVar;
	Hashtable<String, MiniPascalFactor> vars = new Hashtable<String, MiniPascalFactor>();
	Stack exprs = new Stack();
	void adicionarVariavel(Token tk){
		MiniPascalVariable var = new MiniPascalVariable(
			ultimoTipo,
			tk.getText()
		);
		vars.put(var.getName(), var);
		System.out.println("Variável "+var.getName()+" tipo "+MiniPascalType.toString(var.getType()));
	}

	MiniPascalVariable obterVariavel(Token tk){
		return (MiniPascalVariable)vars.get(tk.getText());
	}
}

//Regras sintáticas
programa: PROGRAM identificador ';' bloco '.' ;
bloco: parDeclVar? parDeclSubRot comComp ;

parDeclVar: declVar (';' declVar)* ';' ;
parDeclSubRot: (declProc ';')* ;
declVar: tipo listaIdent;

comando: atribuicao | chamProc | comComp | comCond | comRep ;
chamProc: identificador ('(' listaExpress ')' )? ;
comComp: BEGIN comando (';' comando)* END ;
comCond: IF expressao THEN comando (ELSE comando)? ;
comRep: WHILE expressao DO comando ;


identificador: Identificador ;
tipo:
	  INT {ultimoTipo=MiniPascalType.INT;}
	| BOOLEAN {ultimoTipo=MiniPascalType.BOOLEAN;};
listaIdent: identificador {adicionarVariavel(_input.LT(-1));}
	 (',' identificador {adicionarVariavel(_input.LT(-1));})* ;
listaExpress: expressao (',' expressao)* ;
declProc: PROCEDURE identificador paramForm? ';' bloco ;
paramForm: '(' secParamForm (';' secParamForm)* ')' ;
secParamForm: VAR listaIdent ':' identificador ;
atribuicao: variavel {
	ultimaVar=obterVariavel(_input.LT(-1));
} ':=' {exprs.clear();} expressao ;
variavel: identificador;
expressao: expressaoSimp (relacao {

			//TODO: Adicionar operador

		} expressaoSimp)?
	;
expressaoSimp:
	('+' | '-' {verExpressao().negative();} )? termo
	{
		verExpressao().setFactor1(ultFator);
		int pilhas = 0;
	}
	(('+' | '-' | OR | '*' | DIV | AND) termo )*



	;
termo: fator;
fator:
	variavel {System.out.println("variavel");;ultFator = obterVariavel(_input.LT(-1));}
	| Frase {
		MiniPascalAttribute att = new MiniPascalAttribute(MiniPascalType.STRING);
		att.setValue(_input.LT(-1).getText());
		ultFator = att;
	}
	| numero {
		MiniPascalAttribute att = new MiniPascalAttribute(MiniPascalType.INT);
		att.setValue(_input.LT(-1).getText());
		ultFator = att;
	}
	| '(' expressao ')' //ultFator na expressao
	| truefalse {
		MiniPascalAttribute att = new MiniPascalAttribute(MiniPascalType.BOOLEAN);
		att.setValue(_input.LT(-1).getText());
		ultFator = att;
	}
	| NOT fator {
		MiniPascalExpression e = new MiniPascalExpression();
		e.setFactor1(ultFator);
		e.setOperator(new MiniPascalOperator(MiniPascalOperator.EQUAL));
		MiniPascalAttribute att = new MiniPascalAttribute(MiniPascalType.BOOLEAN);
		att.setValue("FALSE");
		e.setFactor2(att);
		ultFator=e;
	};

numero: Numero ;
relacao:
	'='
	| '<>'
	| '<'
	| '<='
	| '>='
	| '>' ;
truefalse: TRUE | FALSE ;

//Gramáticas

PROGRAM: 'program' ;
PROCEDURE: 'procedure' ;
BEGIN: 'begin' ;
END: 'end' ;
IF: 'if' ;
THEN: 'then' ;
TRUE: 'true' ;
FALSE: 'false' ;
ELSE: 'else' ;
WHILE: 'while' ;
DO: 'do' ;
DIV: 'div' ;
AND: 'and' ;
OR: 'or' ;
NOT: 'not' ;
VAR: 'var' ;
INT: 'int' ;
BOOLEAN: 'boolean';

fragment Letra:
	'_'
	| [a-z] ;

fragment Digito:
	[0-9] ;

fragment Operador:
	'*' | '+' | '-' | '/';

WS:
	[ \t\r\n] -> skip;

Numero: Digito (Digito | '.')*;

Identificador: Letra (Letra | Digito)*;

Frase: '\'' ~[<']* '\'';

Comentario: '//' ~('\r' | '\n')*; //TODO: Comentário multi-linha

fragment Simbolos: '(' | ')' | '[' | ']';

fragment Pontuacao: ';' | '.';
