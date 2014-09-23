
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.ArrayList;

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private double x;
    private double y;
    private double radius;
    private double diameter;
    private double numCircles;
   
    
  
   

    /**
     * Default constructor for objects of class Target
     */
    public Target(double x, double y, double radius, double numCircles)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.numCircles = numCircles;    
        
       
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
          
        
          for (int i = 0; i<this.numCircles; i++)
          {
              this.radius = ((this.numCircles - i)/this.numCircles)*this.radius;
              this.diameter = this.radius*2;
              
              Ellipse2D.Double circle1             
              = new Ellipse2D.Double(this.x-this.radius,this.y-this.radius,this.diameter,this.diameter);
              
              if (i%2 == 0)
              {
                 g2.setColor(Color.RED);
              }
              else
              {
                  g2.setColor(Color.BLACK);
              }
              g2.fill(circle1);
              g2.draw(circle1);
             
           } 
         


        }
    }
