package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser{

    // Write your code here!

    public WordParser() {
        super();
    }

    public WordParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] ch = string.toCharArray();
        for(char c : ch){
            abstractTextComponent.add(new SymbolLeaf(TextComponentType.WORD, c));
        }
    }

    @Override
    protected void setNextParser(AbstractTextParser nextParser) {
        super.setNextParser(nextParser);
    }
}
