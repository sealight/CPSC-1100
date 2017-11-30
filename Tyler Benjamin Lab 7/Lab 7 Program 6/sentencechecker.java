/**
 * Class to check if two input sentences are the same.
 *
 * @author Tyler Benjamin
 * @version 10/31/17
 */

import java.util.Scanner;

public class sentencechecker
{
       public static void main(String[] args)
       {
           System.out.println("Please enter your first sentence.");
           
           Scanner sentenceInput1 = new Scanner(System.in);
           String sentence1 = sentenceInput1.next();
           
           System.out.println("Please enter your second sentence.");
           
           Scanner sentenceInput2 = new Scanner(System.in);
           String sentence2 = sentenceInput2.next();
           
           if (sentence1.equals(sentence2) == true)
           {
               if (sentence1.compareTo(sentence2) == 0)
               {
                 System.out.println("The sentences are the same.");
                }
               else
               {
                 System.out.println("The sentences are not the same."); 
                }
            }
           else
           {
               System.out.println("The sentences are not the same.");
            }
        }
}
