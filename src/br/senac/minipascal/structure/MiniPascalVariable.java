package br.senac.minipascal.structure;

import java.lang.Integer;
import java.lang.Boolean;

public class MiniPascalVariable extends MiniPascalSymbol{

    private MiniPascalAttribute attribute;

    public MiniPascalVariable(String name, byte type){
        super(name);
        attribute = new MiniPascalAttribute(type);
    }

    public byte getType(){
        return attribute.getType();
    }

    public void setValue(String value){

        attribute.setValue(value);

    }

    public Object getValue(){
        return attribute.getValue();
    }

}
