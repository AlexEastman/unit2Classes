import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Little white star creates a white star on the background of the image
 * 
 * @author Alex Eastman
 * @version 0.1
 */
public class LittleWhiteStar
{
    /** x: center x coordinate of the star */
    private int x;
    /** y: center y coordinate of the star */
    private int y;
    /** diameter: width of the star at widest point */
    private double diameter;
    /** radius: calculated for convienence and clarity */
    private double radius;
    /** rt3: this is used as the ratio between the widths, 
     * this is not final because i may change it if a different ratio is prettier */
    private double rt3;

    /**
     * This class takes input for the center of the star and for its size
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
     * defines how to draw the star, it is 2 ellipses and 1 circle (3 ellipses) the ratio is set
     * in the constructor method
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(x-radius/3,y-radius,diameter/3,diameter);
        Ellipse2D.Double ellipse2 = new Ellipse2D.Double(x-radius,y-radius/3,diameter,diameter/3);
        Ellipse2D.Double ellipse3 = new Ellipse2D.Double(x-radius/rt3,y-radius/rt3,
                                                         diameter/rt3,diameter/rt3);
        g2.setColor(Color.white);
        g2.fill(ellipse1);
        g2.fill(ellipse2);
        g2.fill(ellipse3);
        
    }

}
