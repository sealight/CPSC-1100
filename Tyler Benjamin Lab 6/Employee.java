/**
 * This is the Employee class for lab 6.
 *
 * @author Tyler Benjamin
 * @version 10/10/17
 */

import java.util.Scanner;

public class Employee
{
   private String employeeName;
   private double byPercent;
   private double currentSalary;
   private double actualPercent;
   public void EmployeeConstr(String employeeName, double currentSalary)
   {
      employeeName = "";
      currentSalary = 0;
    }
   public String getName()
    {
        return employeeName;
    }
   public double getSalary()
    {
       return currentSalary; 
    }
    
   public void raiseSalary(double byPercent)
    {
        actualPercent = (1+(byPercent/100));
        currentSalary = currentSalary * actualPercent;
    }
    }
