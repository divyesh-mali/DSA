package com.divyesh;

import java.util.Scanner;

public class StringFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalized = MyGreet(naam);
        System.out.print(personalized);
    }

    static String MyGreet(String name)
    {
        String message = "Hello " + name;
        return message;
    }
    
}
