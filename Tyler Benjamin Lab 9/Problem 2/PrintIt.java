/**
 * The class PrintIt that holds the instance variables and methods necessary
 * to complete problem 2 of lab 9.
 *
 * @author Tyler Benjamin  
 * @version 11/15/17
 */
public class PrintIt
{
    private int[] array1 = new int[11];
    
    public PrintIt(int[] inputArray)
    {
       
        array1 = inputArray;
        
    }
    public void printInOrder()
    {
        for (int i = 1; i <= 10; i++)
        {
        System.out.print(array1[i]);
        
        
        
    }
    System.out.println();
    }
    public void printInReverse()
    {
        for (int i = 10; i >= 1; i--)
        {
            System.out.print(array1[i]);
            
        }
        
        System.out.println();
    }
}
