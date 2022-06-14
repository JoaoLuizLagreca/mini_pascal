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
	Token tknn;
	MiniPascalOperator op;
	Stack exprs = new Stack();
	void adicionarVariavel(Token tknn){
		MiniPascalVariable var = new MiniPascalVariable(
			ultimoTipo,
			tknn.getText()
		);
		vars.put(var.getName(), var);
		System.out.println("Variável "+var.getName()+" tipo "+MiniPascalType.toString(var.getType()));
	}

	MiniPascalVariable obterVariavel(Token tknn){
		return (MiniPascalVariable)vars.get(tknn.getText());
	}

	void adicionaFator(MiniPascalFactor fator, Token tknn){

		if (fator.getType()!=MiniPascalType.IGNORE)
			ultimoTipo = fator.getType();

		//TODO: Compare com a variável

		fator.setToken(tknn);
		exprs.push(fator);

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
comCond: IF {

	ultimaVar = new MiniPascalVariable(MiniPascalType.BOOLEAN, "");

} expressao THEN comando (ELSE comando)? ;
comRep: WHILE {

	ultimaVar = new MiniPascalVariable(MiniPascalType.BOOLEAN, "");

} expressao DO comando ;


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

		if(ultimaVar.getType()!=MiniPascalType.BOOLEAN){
			throw new MiniPascalSemanticException("Não se pode atribuir relação em uma variável tipo "+MiniPascalType.toString(ultimaVar.getType()));
		}

		tknn = _input.LT(-1);
		op = new MiniPascalOperator(tknn.getText());
		adicionaFator(op, tknn);

		} expressaoSimp)?
	;
expressaoSimp:
	(('+' | '-') {

		tknn = _input.LT(-1);
		op = new MiniPascalOperator(tknn.getText());
		adicionaFator(op, tknn);

	})? termo
	(('+' | '-' | OR | '*' | DIV | AND) {

		tknn = _input.LT(-1);
		op = new MiniPascalOperator(tknn.getText());
		adicionaFator(op, tknn);

	} termo )*



	;
termo: fator;
fator:
	variavel {
		tknn = _input.LT(-1);
		adicionaFator(obterVariavel(tknn), tknn);
	}
	| Frase {
	tknn = _input.LT(-1);
		MiniPascalAttribute att = new MiniPascalAttribute(MiniPascalType.STRING);
		att.setValue(tknn.getText());
		adicionaFator(att, tknn);
	}
	| numero {
	tknn = _input.LT(-1);
		MiniPascalAttribute att = new MiniPascalAttribute(MiniPascalType.INT);
		att.setValue(tknn.getText());
		adicionaFator(att, tknn);
	}
	| '('{

		tknn = _input.LT(-1);
		op = new MiniPascalOperator(MiniPascalOperator.OPENPARENT);
		adicionaFator(op, tknn);

	}


	expressao ')' {

		tknn = _input.LT(-1);
		op = new MiniPascalOperator(MiniPascalOperator.CLOSEPARENT);
		adicionaFator(op, tknn);

	}
	| truefalse {
		MiniPascalAttribute att = new MiniPascalAttribute(MiniPascalType.BOOLEAN);
		tknn = _input.LT(-1);
		att.setValue(tknn.getText());
		adicionaFator(att, tknn);
	}
	| NOT {

		op = new MiniPascalOperator(MiniPascalOperator.NOT);
		tknn = _input.LT(-1);
		adicionaFator(op, tknn);

	} fator;

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
