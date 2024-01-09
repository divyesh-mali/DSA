package com.divyesh;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of fruit: ");
        String fruit = in.next();

        // Old syntax of switch
/*
        switch(fruit)
        {
            case "Mango":
                System.out.println("King of all fruits");
                break;
            
            case "Apple":
                System.out.println("a day keeps the doctor away");
                break;

            case "Orange":
                System.out.println("No ryhmes of me");
                break;

            case "Grapes":
                System.out.println("Small fruit");
                break;

            default:
                System.out.println("Enter a valid fruit !!");
        }
*/

        //New Syntax of switch which is precised and where you don't need to add 'break'
        switch(fruit)
        {
            case "Mango" -> System.out.println("King of all fruits");
            case "Apple" -> System.out.println("a day keeps the doctor away");
            case "Orange" -> System.out.println("No ryhmes of me");
            
            // To add multi lines in cases
            case "Grapes" -> 
            {
                System.out.println("Small fruit");
            }

            default -> System.out.println("Enter a valid fruit !!");
        }
    }
    
}
