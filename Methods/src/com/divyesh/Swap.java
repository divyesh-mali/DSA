package com.divyesh;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap_fun(a,b);
        System.out.println(a + " " + b);
    }

    static void swap_fun(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    
}
