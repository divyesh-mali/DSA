package com.divyesh;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter empID & department: ");
        int empID = in.nextInt();
        String department = in.next();
    

    switch(empID)
    {
        case 1:
            System.out.println("Divyesh Mali");
            break;
        
            case 2:
            System.out.println("Kunal Kushwaha");
            break;

            case 3:
                System.out.println("Employee No 3");
                switch(department)
                {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    
                    default:
                        System.out.println("Enter valid department");
                }
                break;

            default:
                System.out.println("Enter valid empID !!");
                
    }

    }
    
}
