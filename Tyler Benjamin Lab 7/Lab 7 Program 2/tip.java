/**
 * A class for the tip calculator.
 *
 * @author Tyler Benjamin
 * @version 10/31/17
 */

public class tip
{
    private int satisfactionRating;
    
    private double adjustedBill;
    
    private final double billMultiplier1 = 1.20;
    
    private final double billMultiplier2 = 1.15;
    
    private final double billMultiplier3 = 1.10;
    
    public tip()
    {
        satisfactionRating = 0;
    }
    public double calcTip(double bill, int satisfactionRating)
    {
        if (satisfactionRating == 1)
        {
            adjustedBill = bill * billMultiplier1;
        }
        
        else if(satisfactionRating == 2)
        {
            adjustedBill = bill * billMultiplier2;
        }
        
        else if(satisfactionRating == 3)
        {
            adjustedBill = bill * billMultiplier3;
        }
        
        return adjustedBill;
    }
}
