package com.divyesh;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int ans = 0;
        while(true)
        {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
               System.out.print("Enter two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt(); 

                if(op == '+')
                {
                    ans = a + b;
                }

                if(op == '-')
                {
                    ans = a - b;
                }

                if(op == '*')
                {
                    ans = a * b;
                }

                if(op == '/')
                {
                    if(b != 0)
                    {
                        ans = a / b;
                    }
                }

                if(op == '%')
                {
                    ans = a % b;
                }
            }
            
            else if (op == 'X' || op == 'x') 
            {
                break;
            }

            else
            {
                System.out.println("Invalid Operation !!");
            }
            
            System.out.println("The answer is: " + ans);
        }
        
    }
    
    
}
