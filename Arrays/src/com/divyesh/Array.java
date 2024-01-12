package com.divyesh;

public class Array {
    public static void main(String[] args) {
        // Syntax
        // data_type[] var = new data_type[size]

        int[] var = new int[5]; //Either define size like this. This is dynamic memory allocation

        int[] var2 = {10,20,30,40,50}; //Or define it like this

        int[] var3; //Here array is just declared
        var3 = new int[5]; //Here, actual memory allocation is done in heap memory at time of initialisation
    }
    
}
