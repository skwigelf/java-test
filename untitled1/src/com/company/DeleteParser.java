package com.company;

/**
 * Parsable implementation that deletes spaces
 */
public class DeleteParser implements Parsable {

    private String text;

    public DeleteParser(String text) {
        this.text = text;
    }

    @Override
    public String parse() {
        String result = this.text.replace(" ", "");
        return result;
    }
}
