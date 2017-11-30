/**
 * The tester class for class array.
 *
 * @author Tyler Benjamin
 * @version 11/20/17
 */

import java.util.Scanner;

public class arrayTester
{
    public static void main(String[] args)
    {
        int arrayNumber;
        int[] array1 = new int[11];
        
        for (int i = 1; i <= 10; i++)
        {
          Scanner inputArrayNumber = new Scanner(System.in);
          arrayNumber = inputArrayNumber.nextInt();
          
          array1[i] = arrayNumber;
            
            
        }
        array arrayObject = new array(array1);
        
     for (int i = 1; i <= 10; i++)
      {
        if (array1[i] % 2 == 0)
        {
            arrayObject.addOddAverage(array1[i]);
            
        }
        if (array1[i] % 2 != 0)
        {
           arrayObject.addOddAverage(array1[i]);
           
        }
        
    }
    
    arrayObject.getOddAverage();
    arrayObject.getEvenAverage();
    }
}
