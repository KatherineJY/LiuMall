package com.ghy.katherinejy.latte.ec;

import com.joanzapata.iconify.Icon;

public enum EcIcons implements Icon {
    icon_shopping_cart('\ue63f');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_','-');
    }

    @Override
    public char character() {
        return character;
    }
}
