package com.divyesh;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

// https://leetcode.com/problems/find-peak-element/

public class MountainArray {
    public static void main(String[] args) {
        
    }

    public int peakIndexInMountainArray(int[] arr) {
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
