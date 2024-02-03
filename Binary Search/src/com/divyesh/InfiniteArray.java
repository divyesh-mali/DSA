package com.divyesh;
// # A bit of critical thinking required
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
        int target = 10;
        System.out.print(ans(arr, target));   
    }
    
    static int ans(int[] arr, int target)
    {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end])
        {
            int temp = end;

            // double the box value
            // end = previous end + sizeofbox*2

            end = end + (end-start+1)*2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }
    
    static int BinarySearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            
            if(arr[mid] < target)
            {
                start = mid + 1;
            }

            else if(arr[mid] > target)
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
