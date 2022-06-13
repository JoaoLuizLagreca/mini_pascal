package br.senac.minipascal.structure;

public class MiniPascalVariable extends MiniPascalAttribute{

    private String name;

    public MiniPascalVariable(byte type, String name){
        super(type);
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
