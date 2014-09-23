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
       double centerX = 400;
       double centerY = 400;
       double thickness = 100;
       double numCircles = 4;
       double radius = numCircles * thickness;
       
       Target target1 = new Target(centerX,centerY,radius,numCircles);
       target1.draw(g2);
       
       
   }
}
