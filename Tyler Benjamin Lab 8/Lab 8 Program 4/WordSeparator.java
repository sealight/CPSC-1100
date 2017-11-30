/**
 * Reads a word as input from the user and outputs each character in the word separated by a space.
 * 
 * @author Tyler Benjamin
 * @version 11/1/17
 */

import java.util.Scanner;

public class WordSeparator
{
    static String word1;
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("Please enter a word.");
        Scanner input1 = new Scanner(System.in);
        word1 = input1.next();
        
        
        
        int stringLength = word1.length();
        
        for (int counter = 0; counter <= stringLength; counter++)
        {
            if (counter <= stringLength)
            {
                System.out.print(word1.charAt(counter) + " ");
            }
            
        }
        
    }
}
