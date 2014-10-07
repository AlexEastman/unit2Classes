import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
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
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Sky sky = new Sky(Color.BLUE);
        sky.draw(g2);
        
        Grass grass = new Grass(Color.GREEN);
        grass.draw(g2);
        
        BigYellowStar sun = new BigYellowStar(700,50,50);
        sun.draw(g2);        
        
        Building building1 = new Building(20,5,5,150,225);
        building1.draw(g2);
        
        Building building2 = new Building(200,5,5,125,250);
        building2.draw(g2);
        
        
       
        
        
        
    }

}
