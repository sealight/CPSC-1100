/**
 * This class weightVariables will hold six variables that house numbers in
 * units of weight.
 *
 * @author Tyler Benjamin
 * @version 10/2/17
 */
public class weightVariables
{
    public static void main(String[] args) {
        int weight_1 = 10;
        int weight_2 = 50;
        int weight_3 = 100;
        
        double convweight_1 = (weight_1 / 0.454);
        double convweight_2 = (weight_2 / 0.454);
        double convweight_3 = (weight_3 / 0.454);
        System.out.println("The converted values in lbs are " + convweight_1 + " lbs, " + convweight_2 + " lbs, and " + convweight_3 + " lbs.");
    }
}