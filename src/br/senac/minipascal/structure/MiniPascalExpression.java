package br.senac.minipascal.structure;

public class MiniPascalExpression extends MiniPascalFactor{

    private MiniPascalFactor fac1, fac2;
    private MiniPascalOperator op;

    public MiniPascalExpression(){
        super(0);
    }

    public void setFactor1(MiniPascalFactor fac1){
        this.fac1 = fac1;
    }

    public MiniPascalFactor getFactor1(){
        return f1;
    }

    public void setFactor2(MiniPascalFactor fac2){
        this.fac2 = fac2;
    }

    public MiniPascalFactor getFactor2(){
        return f2;
    }

    public void setOperator(MiniPascalOperator op){
        this.op = op;
    }

    public MiniPascalOperator getOperator(){
        return op;
    }

}
