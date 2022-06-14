package br.senac.minipascal.structure;

import org.antlr.v4.runtime.Token;

public class MiniPascalFactor{

    private byte type;
    private Token token;

    public MiniPascalFactor(byte type){
        this.type = type;
    }

    public byte getType(){
        return type;
    }

    protected void setType(byte type){
        this.type = type;
    }

    public void setToken(Token token){
        this.token = token;
    }

    public Token getToken(){
        return token;
    }

}
