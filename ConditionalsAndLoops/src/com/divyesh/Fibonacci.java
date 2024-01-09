package com.divyesh;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter fibonacci number you want to find: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n)
        {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("Fibonacci no " + n + " is: " + b);
    }
    
}
