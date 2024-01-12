package com.divyesh;

import java.util.Arrays;
// VarArg or variable arguments is a concept which is used when we don't know how many
// arguments will be required for the function. We can take any number of arguments in this 
public class VarArgs {
    public static void main(String[] args) {
        //Here, you can take any number of int parameters
        fun(10, 20, 30, 40, 50);

        //Here, you can take any number of string parameters
        multiple(10, 20, "Divyesh", "how", "are", "you", "?");

        demo("Are", "bhai", "kaisa", "hai");
        demo(99, 88, 77, 66, 55);
        // demo(); This line will give error because you've overloaded this fun so you've to provide some arguments. You can't leave it empty without parameters. This is called Ambiguity.

    }
    
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

}
