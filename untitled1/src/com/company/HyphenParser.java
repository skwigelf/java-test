package com.company;

/**
 * Parsable implementation that replaces spaces to hyphens
 */
public class HyphenParser implements Parsable {

    private String text;

    public HyphenParser(String text) {
        this.text = text;
    }
    @Override
    public String parse() {
        String result = this.text.replace(" ", "-");
        return result;
    }
}
