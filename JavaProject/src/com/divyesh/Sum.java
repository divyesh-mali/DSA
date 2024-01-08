package com.divyesh;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter two numbers: ");
        // float num1 = input.nextFloat();
        // float num2 = input.nextFloat();

        // float sum = num1 + num2;
        // System.out.println("The sum is: " + sum);

        // Type casting
        // int num = (int)(69.1234f);
        // System.err.println(num);

        // Automatic type promotions in expressions
        // int a = 257;
        // byte b = (byte)(a); // 257 % 256 = 1 (i.e. If you provide value larger than 256 it basically divides the provided value with 256 and returns the remainder)
        // System.out.println(b);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f*b) + (i/c) - (d*s);
        // float + int - double = double (i.e the conversion is done to highest type (here double))
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);
    }
    
}
