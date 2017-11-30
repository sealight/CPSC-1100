/**
 * Class to check if two input words are the same.
 *
 * @author Tyler Benjamin
 * @version 10/31/17
 */

import java.util.Scanner;

public class wordchecker
{
    public static void main(String[] args)
       {
           System.out.println("Please enter your first word.");
           
           Scanner wordInput1 = new Scanner(System.in);
           String word1 = wordInput1.next();
           
           System.out.println("Please enter your second word.");
           
           Scanner wordInput2 = new Scanner(System.in);
           String word2 = wordInput2.next();
           
           if (word1.equals(word2) == true)
           {
               if (word1.compareTo(word2) == 0)
               {
                 System.out.println("The words are the same.");
                }
               else
               {
                 System.out.println("The words are not the same."); 
                }
            }
           else
           {
               System.out.println("The words are not the same.");
            }
        }
}
