package com.divyesh;

// Any variable that is declared outside the block cannot be redeclared inside the block but, it can be used normally inside the block
// But any variable that is declared inside the block cannot be directly used outside the block. But, it can be redeclared outside the block and then we can then use it outside the block.

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // int a = 78; In block of particular func, you can't declare variable again if it is already declared outside the block
            a = 75; // But you can change its value. That change will be visible outside the block also.
            
            System.out.println("b=" + b); //The variables declared outside the block can be accessed & modified inside the block
            int c = 69; // And the variables declared inside a block can't be directly used outside the block
            
            int inside_block = 55;
        }

        // System.out.print(c); This will give error
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int inside_block = 65; // The variable 'inside_block' which is inside the block, can be redeclared outside the block
        System.out.println("inside_block=" + inside_block);

        //This is also true for 'for loop'
        for(int i = 0; i <= 4; i++)
        {
            int x = 80;
            int y = 90;
            System.out.println("i=" + i);
        }
        
        /* 
        You can't access the variables inside the for loop, outside of the loop until you redeclare them.

        System.out.println(i);
        System.out.println(x);
        System.out.println(y);
        */
    }
    
}
