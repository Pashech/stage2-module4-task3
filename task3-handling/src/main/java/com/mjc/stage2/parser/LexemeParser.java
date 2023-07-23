package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    public LexemeParser() {
        super();
    }

    public LexemeParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] ch = string.toCharArray();
        for(char c : ch){
            abstractTextComponent.add(new SymbolLeaf(TextComponentType.SYMBOL, c));
        }
    }

    @Override
    protected void setNextParser(AbstractTextParser nextParser) {
        super.setNextParser(nextParser);
    }
}
