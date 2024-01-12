package com.divyesh;

import java.util.Arrays;

//You've done this similar thing in "functions & methods" module
public class PassingFunct {
    public static void main(String[] args) {
        int[] num = {3,4,5,12};
        System.out.println(Arrays.toString(num));

        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr)
    {
        arr[2] = 69;
    }
}
