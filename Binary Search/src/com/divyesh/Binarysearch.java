package com.divyesh;

public class Binarysearch {
    public static void main(String[] args) {

        int[] arr = {-4, -2, 0, 3, 7, 14, 16, 20};
        int key = 14;
        int ans = BinarySearch(arr, key);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length - 1;

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

        return -1; //In case above conditions are not true
    }
    
}