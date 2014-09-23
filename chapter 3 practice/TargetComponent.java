import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class TargetComponent here.
 * 
 * @author Alex
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
   public void paintComponent(Graphics g)
   {
       Graphics2D g2 = (Graphics2D) g;
       //initialize variables here
       int centerX = 300;
       int centerY = 300;
       int radius = 250;
       int numCircles = 2;
       
       
       Target target1 = new Target(centerX,centerY,radius,numCirlces);
       target1.draw(g2);
       
       }
   }


}
