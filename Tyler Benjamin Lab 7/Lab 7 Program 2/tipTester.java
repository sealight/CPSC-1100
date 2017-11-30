/**
 * This is a tester class for the tip class.
 *
 * @author Tyler Benjamin
 * @version 10/31/17
 */

import java.util.Scanner;

public class tipTester
{
    public static void main(String[] args)
    {
        System.out.println("How much did your meal cost?");
        Scanner billInput = new Scanner(System.in);
        double bill = billInput.nextDouble();
        
        System.out.println("On a scale of 1-3, 1 being best and 3 being worst, how satisfied were you with your service? Please enter whole numbers (no fractions or decimals).");
        Scanner satisfactionRatingInput = new Scanner(System.in);
        int satisfactionRating = satisfactionRatingInput.nextInt();
        
        tip tipObject = new tip();
        
        if (satisfactionRating == 1)
        {
            System.out.println("Your satisfaction rating was: Totally Satisfied.");
            System.out.println("The cost of your meal was: $" + bill);
            System.out.println("The tip calculated for your bill is: $" + Math.round((tipObject.calcTip(bill, satisfactionRating) - bill)*100)/100f);
            System.out.println("The total cost of your meal is: $" + (Math.round(tipObject.calcTip(bill, satisfactionRating)*10)/10d));
        }
        
        else if(satisfactionRating == 2)
        {
            System.out.println("Your satisfaction rating was: Satisfied.");
            System.out.println("The cost of your meal was: $" + bill);
            System.out.println("The tip calculated for your bill is: $" + Math.round((tipObject.calcTip(bill, satisfactionRating) - bill)*100)/100f);
            System.out.println("The total cost of your meal is: $" + (Math.round(tipObject.calcTip(bill, satisfactionRating)*10)/10d));
        }
        
        else if(satisfactionRating == 3)
        {
            System.out.println("Your satisfaction rating was: Dissatisfied.");
            System.out.println("The cost of your meal was: $" + bill);
            System.out.println("The tip calculated for your bill is: $" + Math.round((tipObject.calcTip(bill, satisfactionRating) - bill)*100)/100f);
            System.out.println("The total cost of your meal is: $" + (Math.round(tipObject.calcTip(bill, satisfactionRating)*10)/10d));
        }
        else
        {
            System.out.println("The entered satisfaction rating was not within the range of 1-3. Please restart the program and try again.");
        }
       
        
    }
}
