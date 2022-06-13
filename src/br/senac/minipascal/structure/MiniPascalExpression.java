package br.senac.minipascal.structure;

import java.util.Vector;

public class MiniPascalExpression{

    private MiniPascalOperator op;
    private MiniPascalAttribute at1, at2;

    public MiniPascalExpression(MiniPascalAttribute at1, MiniPascalOperator op, MiniPascalAttribute at2){

        if(at2.getType() != at1.getType()){
            throw new Exception("Cannot convert "+MiniPascalType.toString(at2.getType())+" to "+MiniPascalType.toString(at1.getType()));
        }

        this.at1 = at1;
        this.op = op;
        this.at2 = at2;
    }

}
