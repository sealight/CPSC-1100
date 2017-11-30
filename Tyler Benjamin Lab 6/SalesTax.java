/**
 * A class to calculate the sales tax on a purchase.
 *
 * @author Tyler Benjamin
 * @version 10/6/17
 */
public class SalesTax extends SalesTaxTester
{
    // instance variables
    public double tax;
    
    public double purchasePrice;
    
    public double taxDue;
    
    public double totalCost;
    
    public SalesTax()
    {
        tax = 0;
    }
    public void SalesTaxRate(double taxRate)
    {
        tax = tax + taxRate;
    }
    public void calculateSalesTax(double purchase) 
    {
         purchasePrice = purchase;
         taxDue = (purchasePrice*(tax/100));
    }
    public void totalCost()
    {
        totalCost = (purchasePrice + taxDue);
        
    }
    public double getTotalCost()
    {
        return totalCost;
    }
}