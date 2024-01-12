package com.divyesh;

// In fun overloading, either funs should have different no of arguments.
// If they have same no of arguments then they should have different types of arguments

// Fun overloading is a concept where you're having function with same name and performing different tasks
public class Overloading {
    public static void main(String[] args) {
        fun(10);

        fun("Divu");
    }

    static void fun(int a)
    {
        System.out.println(a);
    }

    static void fun(String a)
    {
        System.out.println(a);
    }
    
}
