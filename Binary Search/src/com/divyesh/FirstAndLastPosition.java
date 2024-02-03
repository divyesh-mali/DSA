package com.divyesh;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstAndLastPosition {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};
            int start = Search(nums, target, true); //For searching further occurence of 'target' at left side of array
            int end = Search(nums, target, false); //For searching further occurence of 'target' at right side of array
            ans[0] = start;
            ans[1] = end;
            
            // This is done because we've been asked answer in array form i.e [start, end]
            return ans;
            
        }
    
        public int Search(int[] nums, int target, boolean findStartIndex)
        {
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
    
            while(start <= end)
            {
                int mid = start+(end-start)/2;
                
                if(nums[mid] < target)
                {
                    start = mid + 1;
                }
    
                else if(nums[mid] > target)
                {
                    end = mid - 1;
                }
    
                else 
                {
                    ans = mid;
                    
                    // If true it will search further occurences of target at left side
                    if(findStartIndex == true)
                    {
                        end = mid - 1;
                    }
                    
                    // If false it will search further occurences of target at right side
                    else
                    {
                        start = mid + 1;
                    }
                }
    
            }
            
            return ans; 
        }
        
    }
    
}
