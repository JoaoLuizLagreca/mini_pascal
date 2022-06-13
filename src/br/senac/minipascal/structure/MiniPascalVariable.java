package br.senac.minipascal.structure;

import java.lang.Integer;
import java.lang.Boolean;

public class MiniPascalVariable extends MiniPascalSymbol{

    public static final byte TYPE_UNDEFINED=0;
    public static final byte TYPE_INT = 1;
    public static final byte TYPE_BOOLEAN = 2;

    private byte type;
    private Object value;

    public MiniPascalVariable(String name, byte type){
        super(name);
        this.type = type;
    }

    public byte getType(){
        return type;
    }

    public void setValue(String value){

        switch(type){

            case TYPE_INT:
                this.value = Integer.getInteger(value);
            break;
            case TYPE_BOOLEAN:
                this.value = Boolean.valueOf(value);
            break;

        }

    }

    public Object getValue(){
        return value;
    }

}
