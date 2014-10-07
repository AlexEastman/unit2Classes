import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/**
 * Defines the Static green rectangle of grass that my city has instead of roads, 
 * possibly because it is inhabited by hippies
 * 
 * @author Alex Eastman
 * @version 0.2
 */
public class Grass
{
    /** description of instance variable x (add comment for each instance variable) */
    private Color color;

    /**
     * If one wanted the grass to change color the color parameter makes it easier to customize
     */
    public Grass(Color color)
    {
        this.color = color;
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
        Rectangle grass = new Rectangle(0,540,800,60);
        g2.setColor(color);
        g2.fill(grass);
    }

}
