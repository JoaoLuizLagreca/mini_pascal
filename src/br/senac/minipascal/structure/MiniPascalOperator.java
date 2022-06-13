package br.senac.minipascal.structure;

public class MiniPascalOperator{

    public static final byte ADD=0;
    public static final byte SUB=1;
    public static final byte MULTIPLY=2;
    public static final byte DIVIDE=3;
    public static final byte AND=4;
    public static final byte OR = 5;

    private byte operator;

    public MiniPascalOperator(byte operator){
        this.operator = operator;
    }

    public byte getOperator(){
        return operator;
    }

}
