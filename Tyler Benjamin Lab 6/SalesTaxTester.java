/**
 * A class to test the SalesTax class.
 *
 * @author Tyler Benjamin
 * @version 10/6/17
 */
public class SalesTaxTester
{
    public static void main(String[] args)
    {
        SalesTax harrysPurchase = new SalesTax();
        harrysPurchase.SalesTaxRate(10.0);
        harrysPurchase.calculateSalesTax(5.45);
        harrysPurchase.totalCost();
        double cost = harrysPurchase.getTotalCost();
        System.out.println("The total cost is " + cost + " dollars.");
}
}
