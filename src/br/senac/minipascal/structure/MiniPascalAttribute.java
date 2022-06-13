package br.senac.minipascal.structure;

public class MiniPascalAttribute extends MiniPascalSymbol{

    private byte type;
    private Object value;
    public MiniPascalAttribute(byte type){
        this.type = type;
    }

    public void setValue(String value){

        switch(type){

            case MiniPascalType.INT:
                this.value = Integer.getInteger(value);
            break;
            case MiniPascalType.BOOLEAN:
                this.value = Boolean.valueOf(value);
            break;
            case MiniPascalType.String:
                this.value = value;
            break;

        }

    }

    public Object getValue(){
        return value;
    }

    public byte getType(){
        return type;
    }

}
