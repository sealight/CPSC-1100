/**
 * This is a class to test the Employee class.
 *
 * @author Tyler Benjamin
 * @version 10/11/17
 */

import java.util.Scanner;

public class EmployeeTester
{
   public static void main(String[] args)
   {
     Employee person = new Employee();
     
     System.out.println("Please type your name.");
     Scanner employeeNameInput = new Scanner(System.in);
     String employeeName = employeeNameInput.next();
     
     System.out.println("What is your current salary?");
     Scanner currentSalaryInput = new Scanner(System.in);
     double currentSalary = currentSalaryInput.nextDouble();
     
     System.out.println("What percent would you like to raise your salary by?");
     Scanner byPercentInput = new Scanner(System.in);
     double byPercent = byPercentInput.nextDouble();
     System.out.println("The name is " + person.getName());
     System.out.println("The current salary is " + person.getSalary());
     person.raiseSalary(byPercent);
     System.out.println("The raised salary is " + person.getSalary());
     
}
}
