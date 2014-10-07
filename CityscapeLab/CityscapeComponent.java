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
        
        LittleWhiteStar star1 = new LittleWhiteStar(500,200,30);
        star1.draw(g2);
        
        LittleWhiteStar star2 = new LittleWhiteStar(400,150,30);
        star2.draw(g2);
        
        LittleWhiteStar star3 = new LittleWhiteStar(300,250,30);
        star3.draw(g2);
        
        LittleWhiteStar star4 = new LittleWhiteStar(130,70,30);
        star4.draw(g2);    
        
        LittleWhiteStar star5 = new LittleWhiteStar(700,130,30);
        star5.draw(g2);
        
        Building building1 = new Building(20,5,5,150,225);
        building1.draw(g2);
        
        Building building2 = new Building(200,5,5,125,250);
        building2.draw(g2);
        
        Building building3 = new Building(360,3,8,180,280);
        building3.draw(g2);
        
        Building building4 = new Building(600,8,3,95,160);
        building4.draw(g2);
        
        Building building5 = new Building(730,16,2,70,250);
        building5.draw(g2);
       
        
        
        
    }

}
