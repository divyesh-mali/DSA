package com.divyesh;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5},
            {7,9,11},
            {13,15,17},
            {19,21,23,25}
        };

        // int key = 23;
        // int[] ans = Search(arr, key); // format : {row, col}
        // System.out.println(Arrays.toString(ans));

        // int max = max(arr);
        System.out.print(max(arr));
    }

    static int[] Search(int[][] arr, int key)
    {
        for(int i=0; i<=arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j] == key)
                {
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }

    static int max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int[] ints : arr)
        {
            for(int element : ints)
            {
                if(element > max)
                {
                    max = element;
                }
            }
        }

        return max;
    }
    
}
