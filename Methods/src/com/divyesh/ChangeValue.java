package com.divyesh;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        change(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void change(int[] num)
    {
        num[0] = 99; //Here, if we change the object through this reference variable then it will also change for other reference variable 
    }
    
}
