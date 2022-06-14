package br.senac.minipascal.structure;

import java.util.Hashtable;

public class MiniPascalOperator extends MiniPascalFactor{

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
    public static final byte OPENPARENT = 12;
    public static final byte CLOSEPARENT = 13;
    public static final byte NOT = 14;

    private static Hashtable<String, Byte> operators = new Hashtable<String, Byte>();
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
        operators.put("(", Byte.valueOf(OPENPARENT));
        operators.put(")", Byte.valueOf(CLOSEPARENT));
        operators.put("not", Byte.valueOf(NOT));
    }

    private byte operator;

    public MiniPascalOperator(String operator){
        super(MiniPascalType.UNDEFINED);
        setOperator(operators.get(operator.toUpperCase()).byteValue());
    }

    public MiniPascalOperator(byte operator){
        super(MiniPascalType.UNDEFINED);
        setOperator(operator);
    }

    public byte getOperator(){
        return operator;
    }

    private void setOperator(byte ope){
        switch (getOperator()){
            case ADD:
                setType(MiniPascalType.INT);
                break;
            case SUB:
                setType(MiniPascalType.INT);
                break;
            case MULTIPLY:
                setType(MiniPascalType.INT);
                break;
            case DIVIDE:
                setType(MiniPascalType.INT);
                break;
            case AND:
                setType(MiniPascalType.BOOLEAN);
                break;
            case OR:
                setType(MiniPascalType.BOOLEAN);
                break;
            case EQUAL:
                setType(MiniPascalType.BOOLEAN);
                break;
            case DIFFER:
                setType(MiniPascalType.BOOLEAN);
                break;
            case LOWER:
                setType(MiniPascalType.BOOLEAN);
                break;
            case LOWEREQUAL:
                setType(MiniPascalType.BOOLEAN);
                break;
            case GREATEREQUAL:
                setType(MiniPascalType.BOOLEAN);
                break;
            case GREATER:
                setType(MiniPascalType.BOOLEAN);
                break;
            case NOT:
                setType(MiniPascalType.BOOLEAN);
                break;

            case OPENPARENT:
                setType(MiniPascalType.IGNORE);
                break;
            case CLOSEPARENT:
                setType(MiniPascalType.IGNORE);
                break;

        }

    }

}
