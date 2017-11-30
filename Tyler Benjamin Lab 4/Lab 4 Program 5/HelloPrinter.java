/**
 * This is the class HelloPrinter for program 5.
 *
 * @author Tyler Benjamin
 * @version 10/3/17
 */
public class HelloPrinter
{
    public static void main(String args[]){
        
        String hello_World = "Hello, world!";
        hello_World = hello_World.replace("Hello", "Hollo");
        hello_World = hello_World.replace("world", "werld");
        System.out.println(hello_World);
    }
}