import java.util.Scanner;

/**
 * Write a description of class RemoveComma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RemoveComma
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        String message = s.next();
        
        int index = message.indexOf(",");
        
        String part1 = message.substring(0,index);
        String part2 = message.substring(index+1);
        System.out.println(part1+part2);
    
    }

}
