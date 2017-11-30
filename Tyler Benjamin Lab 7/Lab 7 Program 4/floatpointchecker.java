/**
 * This is the class floatpointchecker to solve problem 4. "You'll float too!"
 *
 * @author Tyler Benjamin
 * @version 10/31/17
 */

import java.util.Scanner;

public class floatpointchecker
{
    public static void main(String[] args)
    {
        System.out.println("Please enter your first and second floating point numbers to test for equality up to two decimal places.");
        Scanner input1 = new Scanner(System.in);
        double num1 = input1.nextDouble();
        
        Scanner input2 = new Scanner(System.in);
        double num2 = input2.nextDouble();
        
        double compareValue = 0.01;
        
        
        if ((Math.round(Math.abs(num1 - num2) * 100) / 100d) < compareValue) 
        {
            System.out.println("Your number is equal up to two decimal places.");
        }
        else
        {
           System.out.println("Your number is not equal up to two decimal places."); 
        }
    }
}
