/**
 * This class PerimeterTester will construct a rectangle then compute and print
 * its perimeter.
 *
 * @author Tyler Benjamin
 * @version 10/2/17
 */

import java.awt.Rectangle;

public class PerimeterTester
{
    public static void main(String[] args) {
        Rectangle box = new Rectangle(10,20,20,10);
        double width = box.getWidth();
        double height = box.getHeight();
        double perimeter = (2 * width) + (2 * height);
        System.out.println(perimeter);
    }
}