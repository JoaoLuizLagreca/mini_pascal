package br.senac.minipascal.structure;

public class MiniPascalVariable extends MiniPascalSymbol{

    public static byte TYPE_INT = 0;
    public static byte TYPE_BOOLEAN = 1;

    public MiniPascalVariable(String name){
        super(name);
    }

}
