package br.senac.minipascal.structure;

public class MiniPascalExpression extends MiniPascalFactor{

    private MiniPascalFactor fac1, fac2;
    private MiniPascalOperator op;

    public MiniPascalExpression(byte type){
        super(type);
    }

}
