/**
 * A class to test out the BankAccount class.
 *
 * @author Tyler Benjamin
 * @version 10/10/17
 */

import java.util.Scanner;

public class BankAccountTester
{
    /**
     * Tests the methods of the BankAccount class.
     * @param args not used 
     */
     public static void main(String[] args)
     {
         BankAccount harrysChecking = new BankAccount();
         Scanner harrysCheckingDeposit = new Scanner(System.in);
         System.out.println("Harry,");
         System.out.println("Enter the amount you would like to deposit: ");
         double deposit1 = harrysCheckingDeposit.nextDouble();
         harrysChecking.deposit(deposit1);
         System.out.println("Harry,");
         System.out.println("Your current balance is " + harrysChecking.getBalance());
         
         BankAccount tylersChecking = new BankAccount();
         Scanner tylersCheckingDeposit = new Scanner(System.in);
         System.out.println("Tyler,");
         System.out.println("Enter the amount you would like to deposit: ");
         double deposit2 = tylersCheckingDeposit.nextDouble();
         tylersChecking.deposit(deposit2);
         System.out.println("Tyler,");
         System.out.println("Your current balance is " + tylersChecking.getBalance());
         
         BankAccount bobsChecking = new BankAccount();
         Scanner bobsCheckingDeposit = new Scanner(System.in);
         System.out.println("Bob,");
         System.out.println("Enter the amount you would like to deposit: ");
         double deposit3 = bobsCheckingDeposit.nextDouble();
         bobsChecking.deposit(deposit3);
         System.out.println("Bob,");
         System.out.println("Your current balance is " + bobsChecking.getBalance());
         
         
         // The code below was commented to save for potential future use.
         /* harrysChecking.deposit(2000);
         harrysChecking.withdraw(500);
         System.out.println(harrysChecking.getBalance());
         System.out.println("Expected: 1500");
         System.out.println(harrysChecking.addInterest(5));
         System.out.println("Expected: 1575");
         
        
         BankAccount tylersChecking = new BankAccount();
         tylersChecking.deposit(4000);
         tylersChecking.withdraw(200);
         System.out.println(tylersChecking.getBalance());
         System.out.println("Expected: 3800");
         System.out.println(tylersChecking.addInterest(5));
         System.out.println("Expected: 3990");
         
         
         BankAccount bobsChecking = new BankAccount();
         bobsChecking.deposit(5000);
         bobsChecking.withdraw(200);
         System.out.println(bobsChecking.getBalance());
         System.out.println("Expected: 4800");
         System.out.println(bobsChecking.addInterest(5));
         System.out.println("Expected: 5040");
         */
}
}