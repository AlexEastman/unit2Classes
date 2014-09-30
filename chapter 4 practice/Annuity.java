import java.util.Scanner;

/**
 * Write a description of class Annuity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Annuity
{
    
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
           
       System.out.print("i=");
       double i = s.nextDouble();
       System.out.print("n=");
       double n = s.nextDouble();
       System.out.print("PMT=");
       double PMT = s.nextDouble();
       
       double power = Math.pow((1+i),(n-1));
       double PVann = PMT*(((power-1)/i)/power+1);
      
       System.out.println(PVann);
       
       
    }

}
