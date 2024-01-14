package com.divyesh;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {55,76,32,89,11,2,66};
        int ans = minimum(arr);
        System.out.print(ans);
    }

    static int minimum(int[] arr)
    {
        int min = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    
}
