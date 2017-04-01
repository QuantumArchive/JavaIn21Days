package com.java21days;

public class Weather {
    public static void main(String[] arguments) {
        float fah = 86;
        System.out.println(fah + " degreeds Fahrenheight is ...");
        
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " degrres Celsius\n");
        
        float cel = 33;
        System.out.println(cel + " dgrees Celsius is ...");
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;
        System.out.println(cel + " degrees Fahrenheight");
    }
}