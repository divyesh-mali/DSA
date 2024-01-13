package com.divyesh;

import java.util.Scanner;
import java.util.Arrays;

public class MaxInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,3,2,5,4,9,7,6,8};

        // System.out.print("Enter start and end index (from 0 to 8)");
        // int start = in.nextInt();
        // int end = in.nextInt();

        // maxinrange(arr, start, end);

        reverse(arr);
        System.out.print("The reverse of array: " + Arrays.toString(arr));

    }

    static int maxinrange(int[] arr, int start, int end)
    {
        int max = arr[start];

        if(start > end)
        {
            System.out.print("End index > start index!!");
        }

        if(arr.length == 0)
        {
            System.out.print("Array is empty!!");
        }

        
        for(int i=start; i<=end; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            } 
        }
        System.out.print("Max element in range is: " + max);
        return max;
        

    }

    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
