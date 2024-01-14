package com.divyesh;
public class EvenDigits {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.print(digits2(-25648));
    }

    static int FindNumbers(int[] nums)
    {
        int count = 0;
        for(int num : nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num)
    {
        int NumofDigits = digits(num);
        /* 
        if(NumofDigits % 2 == 0)
        {
            return true;
        } 
        return false;
        */
        return NumofDigits % 2 == 0;
    }

    static int digits2(int num)
    {
        if(num < 0)
        {
            num = num * -1;
        }

        if(num==0)
        {
            return 1;
        }

        return (int)(Math.log10(num)) + 1;
    }

    // Count no of digits in a number
    static int digits(int num)
    {
        if(num<0)
        {
            num = num * -1;
        }

        if(num==0)
        {
            return 1;
        }

        int count = 0;
        while(num > 0)
        {
            count++;
            num = num/10;
        }

        return count;
    }
    
}
