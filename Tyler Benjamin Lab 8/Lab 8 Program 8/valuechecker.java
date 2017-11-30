/**
 * This is a class to solve the problem for problem 8.
 * 
 * @author Tyler Benjamin
 * @version 11/1/17
 */

import java.util.Scanner;


public class valuechecker
{
    static int input1;
    static int evencount = 0;
    static int evensum;
    static int evenAverage;
    
    static int oddcount = 0;
    static int oddsum;
    static int oddAverage;
    public static void main(String[] args)
    {
        while(input1 != -1) {
           Scanner inputUser = new Scanner(System.in);
           input1 = inputUser.nextInt();
           if (input1 % 2 == 0)
           {
               evencount++;
               evensum = evensum + input1;
               evenAverage = evensum / evencount;
            }
           else
           {
               if (input1 == -1)
               {
                   break;
                }
               else
               {
                   oddcount++;
                   oddsum = oddsum + input1;
                   oddAverage = oddsum / oddcount;
                }
            }
        }
        System.out.println("The average of the odd input numbers are " + oddAverage);
        System.out.println("The average of the even input numbers are " + evenAverage);
    }
}
