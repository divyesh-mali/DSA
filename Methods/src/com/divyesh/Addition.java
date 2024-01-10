package com.divyesh;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // void type function
        // sum();

        // int type function which returns int value
        int result = sum2();
        System.out.print("The sum is: " + result);

    }

    static void sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a = in.nextInt();
        System.out.print("Enter second no: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.print("The sum is: " + sum);
    }

    static int sum2()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a = in.nextInt();
        System.out.print("Enter second no: ");
        int b = in.nextInt();
        int sum = a + b;
        return sum;

        // System.out.println("This statement will give error");
        // After return statement nothing can be executed in function
    }
    
}
