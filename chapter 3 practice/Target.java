
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private int radius;
    private int diameter;
    private int numCircles;
   
    
  
   

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y, int radius, int numCirlces)
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
         
                    
          Ellipse2D.Double circle1
          = new Ellipse2D.Double(this.x-this.radius,this.y-this.radius,this.diameter,this.diameter);
      
          
          g2.setColor(this.color);          
          g2.draw(circle1);
          g2.fill(circle1);
           
           
        
    }

}
