/**
 * A class to store passwords. Top secret!
 *
 * @author Tyler Benjamin
 * @version 11/20/17
 */

import java.util.Scanner;

public class passwordKeeper
{
    public static void main(String[] args)
    {
        String[] passwords = new String[11]; // initializes the array
        
        System.out.println("The program will prompt you to enter 10 passwords in successive order.");
        for (int i = 1; i <= 10; i++) // enhanced for loop to gather 10 passwords from the user
        {
            Scanner passwordInput = new Scanner(System.in); // user input
            passwords[i] = passwordInput.next(); // stores each password in the array
            
        }
        
        System.out.println("Please enter a password");
        Scanner passwordCheckInput = new Scanner(System.in);
        String passwordCheck = passwordCheckInput.next();
        
        for (int i = 1; i <= 10; i++) 
        {
            if (passwordCheck.equals(passwords[i]) == true)
            {
                System.out.println("Valid password");
                
                break;
            }
            if (i == 10 && passwordCheck.equals(passwords[i]) == false)
            {
                System.out.println("Invalid password");
            }
        }
        
    }
}
