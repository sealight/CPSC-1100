/**
 * A class to test out the BankAccount class.
 *
 * @author Tyler Benjamin
 * @version 10/31/17
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
      
       Scanner harrysCheckingWithdraw = new Scanner(System.in);
       System.out.println("Enter the amount you would like to withdraw: ");
       double withdrawal1 = harrysCheckingWithdraw.nextDouble();
      
       harrysChecking.withdraw(withdrawal1);
       System.out.println("Harry, ");
       System.out.println("Your current balance is " + harrysChecking.getBalance());
     
        
       BankAccount tylersChecking = new BankAccount();
       Scanner tylersCheckingDeposit = new Scanner(System.in);
       System.out.println("Tyler,");
       System.out.println("Enter the amount you would like to deposit: ");
       double deposit2 = tylersCheckingDeposit.nextDouble();
       tylersChecking.deposit(deposit2);
       System.out.println("Tyler,");
       System.out.println("Your current balance is " + tylersChecking.getBalance());
      
       Scanner tylersCheckingWithdraw = new Scanner(System.in);
       System.out.println("Enter the amount you would like to withdraw: ");
       double withdrawal2 = tylersCheckingWithdraw.nextDouble();
       tylersChecking.withdraw(withdrawal2);
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
       
       Scanner bobsCheckingWithdraw = new Scanner(System.in);
       System.out.println("Enter the amount you would like to withdraw: ");
       double withdrawal3 = bobsCheckingWithdraw.nextDouble();
       bobsChecking.withdraw(withdrawal3);
       System.out.println("Bob,");
       System.out.println("Your current balance is " + bobsChecking.getBalance());
     }
}