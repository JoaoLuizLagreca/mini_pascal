package br.senac.minipascal.structure;

import java.util.Hashtable;

public class MiniPascalOperator{

    public static final byte ADD=0;
    public static final byte SUB=1;
    public static final byte MULTIPLY=2;
    public static final byte DIVIDE=3;
    public static final byte AND=4;
    public static final byte OR = 5;
    public static final byte EQUAL = 6;
    public static final byte DIFFER = 7;
    public static final byte LOWER = 8;
    public static final byte LOWEREQUAL = 9;
    public static final byte GREATEREQUAL = 10;
    public static final byte GREATER = 11;

    private static Hashtable operators = new Hashtable();
    static{
        operators.put("+", ADD);
        operators.put("-", SUB);
        operators.put("*", MULTIPLY);
        operators.put("DIV", DIVIDE);
        operators.put("AND", AND);
        operators.put("OR", OR);
        operators.put("=", EQUAL);
        operators.put("<>", DIFFER);
        operators.put("<", LOWER);
        operators.put("<=", LOWEREQUAL);
        operators.put(">=", GREATEREQUAL);
        operators.put(">", GREATER);
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
