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
    /** color: the color of the grass */
    private Color color;

    /**
     * If one wanted the grass to change color the color parameter makes it easier to customize
     */
    public Grass(Color color)
    {
        this.color = color;
    }

    /**
     * This method draws a green rectangle that fills a static portion of the bottom of 
     * the screen, this constant for height (540) is also used as the base point of my
     * buildings as this is earth and our buildings dont float.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle grass = new Rectangle(0,540,800,60);
        g2.setColor(color);
        g2.fill(grass);
    }

}
