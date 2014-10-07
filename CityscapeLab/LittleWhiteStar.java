import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LittleWhiteStar
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private double diameter;
    private double radius;
    private double rt3;

    /**
     * Default constructor for objects of class Sun
     */
    public LittleWhiteStar(int x,int y,double diameter)
    {
        this.x = x;
        this.y = y;
        this.radius = diameter/2.0;
        this.diameter = diameter;
        rt3 = Math.sqrt(3);
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
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(x-radius/3,y-radius,diameter/3,diameter);
        Ellipse2D.Double ellipse2 = new Ellipse2D.Double(x-radius,y-radius/3,diameter,diameter/3);
        Ellipse2D.Double ellipse3 = new Ellipse2D.Double(x-
    }

}
