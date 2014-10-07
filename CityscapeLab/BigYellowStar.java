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
public class BigYellowStar
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private int diameter;
    

    /**
     * Default constructor for objects of class Sun
     */
    public BigYellowStar(int x,int y,int radius)
    {
        this.x = x;
        this.y = y;
        this.diameter = radius;
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
        Ellipse2D.Double sun = new Ellipse2D.Double(x,y,diameter,diameter);
        g2.setColor(Color.yellow);
        g2.fill(sun);
    }

}
