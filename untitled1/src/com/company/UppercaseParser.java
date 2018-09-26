package com.company;

/**
 * Parsable implementation that uppercases string
 */
public class UppercaseParser implements Parsable {

    private String text;

    public UppercaseParser(String text) {
        this.text = text;
    }

    @Override
    public String parse() {
        String result = this.text.toUpperCase();
        return result;
    }
}
