import java.util.Scanner;

/**
 * Write a description of class GiveChange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GiveChange
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("enter amount due in pennies: ");
        int cost = s.nextInt();
        System.out.print("enter amount paid in pennies: ");
        int paid = s.nextInt();
        
        int change = paid-cost;
        
        int dollars= 0;
        int quarters=0;
        int dimes=0;
        int nickels=0;
        
        while(change>=100)
        {
            dollars = dollars +1;
            change = change - 100;
        
        }
        
        while(change>=25)
        {
            quarters = quarters +1;
            change = change - 25;
        
        }
        
        while(change>=10)
        {
            dimes = dimes +1;
            change = change - 10;
           
        }
    
        while(change>=5)
        {
            nickels = nickels +1;
            change = change - 5;
        
        }
        
        System.out.println("dollars: " +dollars);
        System.out.println("quarters: " +quarters);
        System.out.println("dimes: " +dimes);
        System.out.println("nikhils: " +nickels);
        System.out.println("pennies: " +change);
    }

}
