import javax.swing.JFrame;

/**
 * Write a description of class CarViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetViewer
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(600,600);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);

    }
}
