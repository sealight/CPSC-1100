/**
 * Class to mutate an user input string.
 *
 * @author Tyler Benjamin   
 * @version 11/6/17
 */

import java.util.Scanner;

public class stringMutator
{
    public static void main(String[] args)
    {
        System.out.println(); // to separate previous entry from current entry
        
        Scanner inputString = new Scanner(System.in);
        String string1 = inputString.next();
        string1.toLowerCase();
        
        int x = string1.length() - 1;
        String newString = "";
        String letterA = "_";
        
        String xString = "";
        
        for (int i = 0; i <= x; i++)
        {
            if (i%2 != 0)
            {
                System.out.println(string1.charAt(i));
                
            }
        }
        
        
        for (int i = 0; i <= x; i++)
        {
            if (string1.charAt(i) == 'a' || string1.charAt(i) == 'e' || string1.charAt(i) == 'i'
            || string1.charAt(i) == 'o' || string1.charAt(i) == 'u')
            {
                newString = string1.replaceAll("[aeiou]", letterA);
            }
           
        }
        System.out.print(newString);
        
        for (int i = 0; i <= x; i++)
        {
           if (string1.charAt(i) == 't')
           {
               xString = string1.replaceAll("[t]", "x");
               
            }
           
        }
        System.out.println();
        System.out.println(xString);
       }
    }


