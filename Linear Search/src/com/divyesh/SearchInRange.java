package com.divyesh;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {22,55,33,11,88,77,99,66};
        int key = 55;
        int value = LinearSearch(arr, key, 1, 4);
        System.out.println(value);
        
    }

    static int LinearSearch(int[] arr, int key, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int i = start; i <= end; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }

        return -1;
    }
    
}
