package com.divyesh;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-4, -2, 0, 3, 7, 14, 16, 20};
        int key = 8;
        int ans = ceiling(arr, key);
        System.out.println(ans);
    }

    // return index of smallest number >= key
    static int ceiling(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length - 1;

        // If search key > greatest number in array then return -1 
        if(key > arr[arr.length - 1])
        {
            return -1;
        }

        while(start <= end)
        {
            int mid = start+(end-start)/2;
            
            if(arr[mid] < key)
            {
                start = mid + 1;
            }

            else if(arr[mid] > key)
            {
                end = mid - 1;
            }

            else 
            {
                System.out.println("Element found");
                return mid;
            }

        }

        return start; //In while loop condition breaks i.e start > end i.e key is not present in array
    }
    
}
    

