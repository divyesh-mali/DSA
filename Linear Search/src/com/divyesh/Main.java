package com.divyesh;

public class Main {
    public static void main(String[] args) {
        int[] arr = {22,55,33,11,88,77,99,66};
        int key = 11;
        // int index = LinearSearch(arr, key);
        // System.out.println(key + " is present at: " + index);

        LinearSearch2(arr, key);
        boolean value = LinearSearch2(arr, key);
        System.out.println(value);

        
    }

    static int LinearSearch(int[] arr, int key)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }

        return -1;
    }


    static boolean LinearSearch2(int[] arr, int key)
    {
        if(arr.length == 0)
        {
            return false;
        }

        for(int i : arr)
        {
            if(i == key)
            {
                return true;
            }
        }

        return false;
    }
    
}
