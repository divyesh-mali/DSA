package com.divyesh;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        /* 
        1st Method to Input 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        */

        // 2nd method to input
        for(int i=0; i<5; i++)
        {
            list.add(in.nextInt());
        } 
        
        /* 
        1st Method to output
        System.out.println(list);
         */

        // 2nd method to get output
        for(int i=0; i<5; i++)
        {
            System.out.print(list.get(i) + " "); // list[i] syntax will not work here
        }
        

    }
    
}
