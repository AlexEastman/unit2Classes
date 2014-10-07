import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;



/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xCord;
    private int rows;
    private int columns;
    private int width;
    private int height;
    private int yCord;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int xCord, int rows, int columns, int width, int height)
    {
        
        this.xCord = xCord;
        this.rows = rows;
        this.columns = columns;
        this.width = width;
        this.height = height;
        this.yCord = 540-height;
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
        Rectangle shell = new Rectangle(xCord,yCord,width,height);
        g2.setColor(Color.BLACK);
        g2.fill(shell);
        
        g2.setColor(Color.GRAY);        
        for(double i=1;i<columns; i++)
        {
            double newXCord = xCord + (i * width/columns);
            Line2D.Double verticalLine = new Line2D.Double(newXCord,yCord,newXCord,540);        
            g2.draw(verticalLine);
        }
        
        for(double i=1;i<rows; i ++)
        {
            double newYCord = yCord + (i*height/rows);
            Line2D.Double horizontalLine = new Line2D.Double(xCord,newYCord,xCord+width,newYCord);
            g2.draw(horizontalLine);
        }       
    }

}
