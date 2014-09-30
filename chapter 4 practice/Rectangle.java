import java.util.Scanner;

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.print("side1=");
       double side1 = s.nextDouble();
       System.out.print("side2=");
       double side2 = s.nextDouble();
       
       double area = side1*side2;
       double perimeter = 2*side1+2*side2;
       
       double hypoteneuse =Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
       
       System.out.println("area "+ area);
       System.out.println("perimeter "+perimeter);
       System.out.println("hypoteneuse "+hypoteneuse);
   }
}
