package com.Generator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include Uppercase letters? (true/false): ");
        boolean includeUpper = sc.nextBoolean();

        System.out.print("Include Lowercase letters? (true/false): ");
        boolean includeLower = sc.nextBoolean();

        System.out.print("Include Numbers? (true/false): ");
        boolean includeNumbers = sc.nextBoolean();

        System.out.print("Include Symbols? (true/false): ");
        boolean includeSymbols = sc.nextBoolean();

        String password = passwordGenerator.generatePassword(length, includeUpper, includeLower, includeNumbers, includeSymbols);
        System.out.println("Generated Password: " + password);

        sc.close();
    }
}
