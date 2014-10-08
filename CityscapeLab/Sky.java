import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Creates a colored rectangle which fills the screen
 * 
 * @author Alex Eastman
 * @version 0.1
 */
public class Sky
{
    /**  Color: the color the sky is set to*/
    private Color color;

    /**
     * color: takes a parameter for the color of the sky
     */
    public Sky(Color color)
    {
       this.color = color;
    }

    /**
     * Creates a rectangle the size of the screen and sets its color to the input parameter
     * 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(0,0,800,600);
        g2.setColor(color);
        g2.fill(sky);
    }

}
