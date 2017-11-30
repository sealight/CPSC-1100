/**
 * Computes the sum of all even numbers between 2 and 100 inclusive
 * and the sum of all squares between 1 and 100 inclusive.
 *
 * @author Tyler Benjamin
 * @version 11/6/17
 */
public class sumComputer
{
    public static void main(String[] args)
    {
      int sum1 = 0;
      int sum2 = 0;
      int x = 1;
      int n;
      for (n = 2; n <= 100; n = n+2)
      {
          sum1 = sum1 + n; 
        }
        
      System.out.println("Sum of all even numbers between 2 and 100 inclusive = " + sum1);
      
      while (x <= 10) {
          
          sum2 = (sum2 + (x*x));
          x++;
        }
      System.out.println("Sum of all squares between 1 and 100 inclusive = " + sum2);
   }
}

