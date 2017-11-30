/**
 * The static class for lab 7. It contains the methods and instance variables
 * for the first program.
 * @author Tyler Benjamin
 * @version 10/30/17    
 */
public class astronomyStats
{
    private static double moonWeightConversion;
    
    private static double mercuryWeightConversion;
    
    private static double venusWeightConversion;
    
    private static double jupiterWeightConversion;
    
    private static double saturnWeightConversion;
    
    private final static double moonMultiplier = 0.1666;
        
    private final static double mercuryMultiplier = 0.4;
    
    private final static double venusMultiplier = 0.9;
    
    private final static double jupiterMultiplier = 2.5;
    
    private final static double saturnMultiplier = 1.1;
    
    public static double moonConversionMethod(double earthWeight)
    {
        moonWeightConversion = earthWeight * moonMultiplier;
        return moonWeightConversion;  
    }
    public static double mercuryConversionMethod(double earthWeight)
    {
        mercuryWeightConversion = earthWeight * mercuryMultiplier;
        return mercuryWeightConversion;
    }
    public static double venusConversionMethod(double earthWeight)
    {
        venusWeightConversion = earthWeight * venusMultiplier;
        return venusWeightConversion;
    }
    public static double jupiterConversionMethod(double earthWeight)
    {
        jupiterWeightConversion = earthWeight * jupiterMultiplier;
        return jupiterWeightConversion;
    }
    public static double saturnConversionMethod(double earthWeight)
    {
        saturnWeightConversion = earthWeight * saturnMultiplier;
        return saturnWeightConversion;
    }
}
