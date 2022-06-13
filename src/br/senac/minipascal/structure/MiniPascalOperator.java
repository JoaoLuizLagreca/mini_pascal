package br.senac.minipascal.structure;

import java.util.Hashtable;

public class MiniPascalOperator{

    public static final byte ADD=0;
    public static final byte SUB=1;
    public static final byte MULTIPLY=2;
    public static final byte DIVIDE=3;
    public static final byte AND=4;
    public static final byte OR = 5;

    private static Hashtable operators = new Hashtable();
    static{
        operators.put("+", ADD);
        operators.put("-", SUB);
        operators.put("*", MULTIPLY);
        operators.put("DIV", DIVIDE);
        operators.put("AND", AND);
        operators.put("OR", OR);
    }

    private byte operator;

    public MiniPascalOperator(String operator){
        this.operator = operators.get(operator.toLoweCase());
    }

    public MiniPascalOperator(byte operator){
        this.operator = operator;
    }

    public byte getOperator(){
        return operator;
    }

}
