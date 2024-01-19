package com.divyesh;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        //int[] arr = {-4, -2, 0, 3, 7, 14, 16, 20};
        int[] arr = {20, 16, 14, 7, 3, 0, -2, -4};
        int key = -2;
        int ans = OrdAgnBinarySearch(arr, key);
        System.out.println(ans);
        
    }

    static int OrdAgnBinarySearch(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length - 1;

        // Find whether array is in ascending or descening order
        boolean isAscending = arr[start] < arr[end];

        /* Logic of above boolean isAscending 

        if(start < end)
        {
            return true;
        }
        else
        {
            return false;
        }
        */

        while(start <= end)
        {
            int mid = start+(end-start)/2;

            if(arr[mid] == key)
            {
                return mid;
            }

            if(isAscending)
            {
                if(arr[mid] < key)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }

            else
            {
                if(arr[mid] < key)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
    
}
