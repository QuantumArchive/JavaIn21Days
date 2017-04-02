package com.java21days;

class StringChecker {
    public static void main(String[] arguments) {
        String str = "A Lannister always pays his debts";
        System.out.println("The string is: " + str);
        System.out.println("Length of this string: " + str.length());
        System.out.println("The character at poisition 6: " + str.charAt(6));
        System.out.println("The substring from 12 to 18: " + str.substring(12, 18));
        System.out.println("The index of the first 't': " + str.indexOf('t'));
        System.out.println("The index of the beginning of the " + "substring \"debts\": " + str.indexOf("debts"));
        System.out.println("The string is uppercase: " + str.toUpperCase());
    }
}