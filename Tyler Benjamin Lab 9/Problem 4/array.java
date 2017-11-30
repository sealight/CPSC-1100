/**
 * Class that holds the instance variables and methods.
 *
 * @author Tyler Benjamin
 * @version 11/15/17
 */
public class array
{
    private int[] array1 = new int[26];
    private int oddAverage;
    private int evenAverage;
    
    public array(int[] arrayNumber)
    {
        array1 = arrayNumber;
        oddAverage = 0;
        evenAverage = 0;
        
    }
    public void addOddAverage(int arrayPart)
    {
        oddAverage = oddAverage + arrayPart;
        
        }
    public void getOddAverage()
    {
        System.out.println("The average of the odd numbers in the array is" + oddAverage);
        }
        
       
    public void addEvenAverage(int arrayPart)
    {
        evenAverage = evenAverage + arrayPart;
        
        }
    public void getEvenAverage()
    {
        System.out.println("The average of the even numbers in the array is" + evenAverage);
        }
}
