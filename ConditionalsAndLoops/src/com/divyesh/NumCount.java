package com.divyesh;
import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.print("Enter the digit of which you want to count frequency: ");
        int digit = in.nextInt();

        int count = 0;

        while(num > 0)
        {
            int rem = num % 10;
            if(rem == digit)
            {
                count++;
            }
            num = num / 10;
        }
        System.out.println("No of " + digit + "s are: " + count);
    }
    
}
