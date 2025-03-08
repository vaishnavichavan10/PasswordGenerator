package com.Generator;

public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()_-+=<>?/";

    public static String getAlphabet(boolean upper, boolean lower, boolean numbers, boolean symbols) {
        StringBuilder alphabet = new StringBuilder();
        if (upper) alphabet.append(UPPERCASE_LETTERS);
        if (lower) alphabet.append(LOWERCASE_LETTERS);
        if (numbers) alphabet.append(NUMBERS);
        if (symbols) alphabet.append(SYMBOLS);
        return alphabet.toString();
    }
}
