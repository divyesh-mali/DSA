package com.divyesh;


public class CharSearch {
    public static void main(String[] args) {
        String name = "Divyesh";
        char letter = 'v';
        // boolean search = LinearSearch(name, letter);
        // System.out.println(search);

        boolean search = LinearSearch2(name, letter);
        System.out.println(search);
    }

    static boolean LinearSearch(String name, char letter) 
    {
        if(name.length() == 0)
        {
            return false;
        }

        for(int i=0; i < name.length(); i++)
        {
            if(letter == name.charAt(i))
            {
                return true;
            }
        }
        
        return false;
    }


    static boolean LinearSearch2(String name, char letter) 
    {
        if(name.length() == 0)
        {
            return false;
        }

        for(char ch : name.toCharArray())
        {
            if(ch == letter)
            {
                return true;
            }
        }
        
        return false;
    }
    
}
