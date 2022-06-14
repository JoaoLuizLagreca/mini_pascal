package br.senac.minipascal.structure;

public class MiniPascalType{

    public static final byte IGNORE=-1;
    public static final byte UNDEFINED=0;
    public static final byte INT = 1;
    public static final byte BOOLEAN = 2;
    public static final byte STRING = 3;

    public static String toString(byte type){
        switch(type){
            case UNDEFINED:
                return "UNDEFINED";
            case INT:
                return "INT";
            case BOOLEAN:
                return "BOOLEAN";
            case STRING:
                return "STRING";
            case IGNORE:
                return "IGNORE";

        }
        return "UNKNOWN";
    }

}
