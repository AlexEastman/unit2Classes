

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
      
    }
    
    @Test
    public void testFillMachine()
    {
        VendingMachine vend = new VendingMachine();
       
        vend.fillMachine(10);
        int cans = vend.getSodaCount();
        int tokens = vend.getTokenCount();
        assertEquals(cans,10);
        assertEquals(tokens,0);
        
        vend.fillMachine(4);
        cans = vend.getSodaCount();
        tokens = vend.getTokenCount();
        assertEquals(cans,14);
        assertEquals(tokens,0);
        
    }
    
    @Test
    public void testBuySoda()
    {
        VendingMachine vend = new VendingMachine();
        
        vend.fillMachine(10);
        vend.buySoda(4);
        int cans = vend.getSodaCount();
        int tokens = vend.getTokenCount();
        assertEquals(cans,6);
        assertEquals(tokens,4);
        
        vend.fillMachine(36);
        vend.buySoda(38);
        cans = vend.getSodaCount();
        tokens = vend.getTokenCount();
        assertEquals(cans,4);
        assertEquals(tokens,42);
    }
    

}
