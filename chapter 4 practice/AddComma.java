import java.util.Scanner;

/**
 * Write a description of class AddComma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddComma
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
        
       System.out.print("Enter number: ");
       String message = s.next();
       
       int length = message.length();
       String part1 = message.substring(length - 3);
       String part2 = message.substring(0,length-3);
       System.out.println(part2 + "," + part1);
       
   }   
}
