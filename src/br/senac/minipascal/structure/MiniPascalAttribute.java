package br.senac.minipascal.structure;

import java.lang.Integer;
import java.lang.Boolean;

public class MiniPascalAttribute extends MiniPascalFactor{

    private Object value;

    public MiniPascalAttribute(byte type){
        super(type);
    }
    public Object getValue(){
        switch(getType()){
            case MiniPascalType.INT:
                return (Integer)value;
            case MiniPascalType.BOOLEAN:
                return (Boolean)value;
            case MiniPascalType.STRING:
                return (String)value;

        }

        return value;
    }

    public void setValue(String value){
        switch(getType()){
            case MiniPascalType.INT:
               this.value = Integer.getInteger(value);
               break;
            case MiniPascalType.BOOLEAN:
                this.value = Boolean.getBoolean(value);
                break;
            case MiniPascalType.STRING:
                this.value = value;
                break;

        }

        this.value = value;
    }

}
