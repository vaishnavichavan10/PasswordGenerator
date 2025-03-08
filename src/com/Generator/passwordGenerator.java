package com.Generator;

import java.security.SecureRandom;

public class passwordGenerator {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_-+=<>?/";

    public static String generatePassword(int length, boolean includeUpper, boolean includeLower,
            boolean includeNumbers, boolean includeSymbols) {
        StringBuilder charPool = new StringBuilder();
        if (includeUpper)
            charPool.append(UPPERCASE);
        if (includeLower)
            charPool.append(LOWERCASE);
        if (includeNumbers)
            charPool.append(NUMBERS);
        if (includeSymbols)
            charPool.append(SYMBOLS);

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        return password.toString();
    }
}
