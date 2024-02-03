package com.divyesh;

public class SearchMountain {
    public static void main(String[] args) {
        
    }
    
    static int Search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrdAgnBinarySearch(arr, target, 0, peak);

        if(peak != 1){
            return firstTry;
        }

        return OrdAgnBinarySearch(arr, target, peak+1, arr.length-1);
    }
    
    static int OrdAgnBinarySearch(int[] arr, int key, int start, int end)
    {
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

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            int mid = start+(end-start)/2;
            
            if(arr[mid] > arr[mid+1])
            {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }

            else 
            {
                // you are in ascending part of array
                start = mid + 1;
            }
        }

        return start;  // or return end as both are same
    }
}


