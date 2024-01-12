package com.divyesh;

// Shadowing is the concept where the variable with higher level scope will be hidden by variable 
// with lower level scope, when their scope overlap 
 
public class Shadowing {
    
    static int x = 50; //This variable i.e. class variable will be shadowed at line 18

    public static void main(String[] args) {
        System.out.println(x); //50
        int x; // This variable's declareation itself does not shadows the class variable
        
        /* 
        System.out.println(x); // This line will give error because you've not yet initialised 'x' in local scope.
        Shadowing actually begins when you initialise the variable and not when you just leave it declared.
        */
        x = 69; //Now, this variable 'x' can shadow the class variable 'x'
        System.out.println(x); //69
        fun(); //50
    }
    
    static void fun()
    {
        System.out.println(x); //50
    }
}
