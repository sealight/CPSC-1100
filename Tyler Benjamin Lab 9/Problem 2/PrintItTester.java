/**
 * The tester class for the PrintIt class.
 *
 * @author Tyler Benjamin
 * @version 11/15/17
 */

import java.util.Scanner;

public class PrintItTester
{
    public static void main(String[] args)
    {
        System.out.println();
        int arrayNumber;
        int[] arrayHolder = new int[11];
        for (int i = 1; i <= 10; i++)
        {
          Scanner inputArrayNumber = new Scanner(System.in);
          arrayNumber = inputArrayNumber.nextInt();
          
          arrayHolder[i] = arrayNumber;
            
            
        }
        PrintIt arrayTransporter = new PrintIt(arrayHolder);
        arrayTransporter.printInOrder();
        arrayTransporter.printInReverse();
        
    }
}
