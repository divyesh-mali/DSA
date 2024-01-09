package com.divyesh;
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Enter three nos: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // int max = a;

        // if(b>max)
        // {
        //     max = b;
        //     System.out.println("Greatest no is: " + b);
        // }

        // else if(c>max)
        // {
        //     max = c;
        //     System.out.println("Greatest no is: " + c);
        // }

        // else
        // {
        //     System.out.println(a + " is the greatest number");
        // }


        // Alternative approach
        int max = Math.max(c, Math.max(a,b));
        System.out.println("The maximum no is: " + max);

    }
}
