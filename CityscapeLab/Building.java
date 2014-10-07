import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;



/**
 * Building is a class that defines the shape and color of buildings in the city scape
 * 
 * @author Alex Eastman
 * @version 0.11
 */
public class Building
{
    /** xCord: this is the xPosition of the buildings top left corner*/
    private int xCord;
    /**rows: this is the number of rows seperated by stripes*/
    private int rows;
    /**columns: this is the number of columns seperated by stripes*/
    private int columns;
    /**width: the width of the building rectangle*/
    private int width;
    /**height; the height of the building rectange*/
    private int height;
    /**yCord: bottom left corner of the building*/
    private int yCord;

    /**
     * Takes inputs for each building, xCoordinate of building number of row, columns
     * and the width and height
     */
    public Building(int xCord, int rows, int columns, int width, int height)
    {
        
        this.xCord = xCord; 
        this.rows = rows;
        this.columns = columns;
        this.width = width;
        this.height = height;
        this.yCord = 540-height; //this a set distance from the bottom of the screen
        // it never changes because the buildings all start at same height
    }

    /**
     * This method defines how to draw the building itself
     */
    public void draw(Graphics2D g2)
    {
        Rectangle shell = new Rectangle(xCord,yCord,width,height);
        g2.setColor(Color.BLACK);
        g2.fill(shell);
        
        g2.setColor(Color.GRAY); //makes customizeable vertical lines, change rows and columns to change the number of lines     
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
