package com.divyesh;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* 
        // Method 1
        int arr[][] = new int[3][3];

        //Method 2
        int[][] arr2 = {
            {1,2,3},
            {4,5},
            {5,6,7,8}
        };
        */

        int[][] arr = new int[3][3];

        //Input
        System.out.println("Enter elements of matrix: ");
        for(int row=0; row < arr.length; row++)
        {
            for(int column=0; column < arr[row].length; column++)
            {
                arr[row][column] = in.nextInt();
            }
        }

        /* 
        // 1st method of output
        for(int row=0; row < arr.length; row++)
        {
            for(int column=0; column < arr[row].length; column++)
            {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        */

        /* 
        // 2nd method of output
        for(int row=0; row < arr.length; row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }
        */

        // 3rd method of output
        for(int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
    
}
