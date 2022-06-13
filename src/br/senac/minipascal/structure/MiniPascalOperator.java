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

    private static Hashtable<String, Byte> operators = new Hashtable();
    static{
        operators.put("+", Byte.valueOf(ADD));
        operators.put("-", Byte.valueOf(SUB));
        operators.put("*", Byte.valueOf(MULTIPLY));
        operators.put("DIV", Byte.valueOf(DIVIDE));
        operators.put("AND", Byte.valueOf(AND));
        operators.put("OR", Byte.valueOf(OR));
        operators.put("=", Byte.valueOf(EQUAL));
        operators.put("<>", Byte.valueOf(DIFFER));
        operators.put("<", Byte.valueOf(LOWER));
        operators.put("<=", Byte.valueOf(LOWEREQUAL));
        operators.put(">=", Byte.valueOf(GREATEREQUAL));
        operators.put(">", Byte.valueOf(GREATER));
    }

    private byte operator;

    public MiniPascalOperator(String operator){
        this.operator = operators.get(operator.toUpperCase()).byteValue();
    }

    public MiniPascalOperator(byte operator){
        this.operator = operator;
    }

    public byte getOperator(){
        return operator;
    }

}
