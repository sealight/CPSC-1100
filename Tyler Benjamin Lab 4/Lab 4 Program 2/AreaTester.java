/**
 * This is the class AreaTester, which will construct a rectangle then compute
 * and print its area.
 *
 * @author Tyler Benjamin
 * @version 10/2/17
 */
import java.awt.Rectangle;

public class AreaTester
{
    
    
    public static void main(String[] args) {
        Rectangle box = new Rectangle(10,20,20,10);
        double width = box.getWidth();
        double height = box.getHeight();
        double area = (width * height);
        System.out.println(area);
    }
}