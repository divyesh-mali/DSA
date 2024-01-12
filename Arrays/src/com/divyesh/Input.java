package com.divyesh;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        // First way to print arrays
        /*
        for(int i=0; i<arr.length; i++) // "arr.length" is used when the number of columns are not fixed or not specified
        {
            System.out.print(arr[i] + " ");
        }
        */

        //Second way to print arrays
        /* 
        for(int num : arr) // For every element in array, print the array
        {
            System.out.print(num + " "); // Here, num represents element of array
        }
        */

        // Third way to print arrays
        System.out.println(Arrays.toString(arr));
    }
    
}
