package br.senac.minipascal.structure;

public class MiniPascalExpression extends MiniPascalFactor{

    private byte mul=1; // fac1 * mul
    private MiniPascalFactor fac1, fac2;
    private MiniPascalOperator op;

    public MiniPascalExpression(){
        super(MiniPascalType.UNDEFINED);
    }

    public void setFactor1(MiniPascalFactor fac1){
        this.fac1 = fac1;
    }

    public MiniPascalFactor getFactor1(){
        return fac1;
    }

    public void setFactor2(MiniPascalFactor fac2){

        if(fac2.getType()!=fac1.getType())
            throw new MiniPascalSemanticException("Attributes are not of the same type");

        this.fac2 = fac2;
    }

    public MiniPascalFactor getFactor2(){
        return fac2;
    }

    public void setOperator(MiniPascalOperator op){
        this.op = op;
        switch (op.getOperator()){
            case MiniPascalOperator.ADD
                |MiniPascalOperator.SUB
                |MiniPascalOperator.MULTIPLY
                |MiniPascalOperator.DIVIDE:
                    setType(MiniPascalType.INT);
                    break;
            case MiniPascalOperator.AND
                | MiniPascalOperator.OR
                | MiniPascalOperator.EQUAL
                | MiniPascalOperator.DIFFER
                | MiniPascalOperator.LOWER
                | MiniPascalOperator.LOWEREQUAL
                | MiniPascalOperator.GREATEREQUAL
                | MiniPascalOperator.GREATER:
                    setType(MiniPascalType.BOOLEAN);
                    break;

        }
    }

    public MiniPascalOperator getOperator(){
        return op;
    }

    public void negative(){
        mul=-1;
    }

}
