import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Creates a sun which is a circular ellipse and is always yellow
 * 
 * @author Alex Eastman
 * @version 0.3
 */
public class BigYellowStar
{
    /** x: top left x coordinate of the star */
    private int x;
    /** y: top left y coordinate of the star */
    private int y;
    /** diameter: diameter of the star */
    private int diameter;
    

    /**
     * takes input for the diameter and the top left coord of the sun
     */
    public BigYellowStar(int x,int y,int diameter)
    {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    /**
     *Makes a circular ellipse and sets its color to yellow
     * 
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(x,y,diameter,diameter);
        g2.setColor(Color.yellow);
        g2.fill(sun);
    }

}
