import java.util.Scanner;

/**
 * Write a description of class AreaCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AreaCode
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        
        String message = s.next();
        
        String part1 = message.substring(6);
        String part2 = message.substring(3,6);
        String part3 = message.substring(0,3);
        
        System.out.println("(" + part3 + ") " + part2 + "-" + part1);
    
    }

}
