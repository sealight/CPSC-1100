/**
 * A tester class of astronomyStats. Blasting off into space in 3, 2, 1...
 *
 * @author Tyler Benjamin
 * @version 10/30/17
 */

import java.util.Scanner;

public class astronomyTester
{
    public static void main(String[] args)
    {
        astronomyStats weightObject = new astronomyStats();
        System.out.println("Welcome to the Space Weight Conversion Calculator. This calculator converts the input weight into weight on different celestial bodies.");
        System.out.println("Please enter your weight that you would like to convert.");
        
        Scanner earthWeightInput = new Scanner(System.in);
        double earthWeight = earthWeightInput.nextDouble();
        
        System.out.println("Your weight on the Moon would be: " + weightObject.moonConversionMethod(earthWeight) + " lbs");
        System.out.println("Your weight on Mercury would be: " + weightObject.mercuryConversionMethod(earthWeight) + " lbs");
        System.out.println("Your weight on Venus would be: " + weightObject.venusConversionMethod(earthWeight) + " lbs");
        System.out.println("Your weight on Jupiter would be: " + weightObject.jupiterConversionMethod(earthWeight) + " lbs");
        System.out.println("Your weight on Saturn would be: " + weightObject.saturnConversionMethod(earthWeight) + " lbs");
    }
}
