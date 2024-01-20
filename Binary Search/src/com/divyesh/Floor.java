package com.divyesh;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-4, -2, 0, 3, 7, 14, 16, 20};
        int key = 4;
        int ans = floor(arr, key);
        System.out.println(ans);
    }

    // return the index : greatest number <= key
    static int floor(int[] arr, int key)
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

        return end; //In case while loop condition breaks i.e start > end i.e key is not present in array
    }
    
}
