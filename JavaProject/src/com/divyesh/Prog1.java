package com.divyesh;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        System.out.print("Enter a value: "); 
        Scanner input = new Scanner(System.in); 
        //System.out.println(input.nextInt()); // Prints the input number
        //System.out.println(input.next());      // Prints string from inputted sentence till it finds [space] (i.e. prints 1st word)
        System.out.println(input.nextLine()); // Prints the entire sentence
    }
    
}
