package com.divyesh;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().trim().charAt(0); //This basically trims the empty spaces in the string and accepts letter at index '0'

        if(ch >= 'a' && ch<= 'z')
        {
            System.out.println("Input character is lower case");
        }
        else
        {
            System.out.println("Input character is upper case");
        }
    }
    
}
