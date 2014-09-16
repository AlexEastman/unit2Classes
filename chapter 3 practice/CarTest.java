

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class CarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarTest
{

    /**
     * Default constructor for objects of class CarTest
     */
    public CarTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    @Test
    public void testGetGasInTank()
    {
        Car testCar = new Car(50);
        double gallons = testCar.getGasInTank();
        assertEquals(0.0, gallons,1e-6);
    }    

    @Test
    public void testAddGas()
    {
        Car testCar = new Car(50);
        testCar.addGas(20);
        double gallons = testCar.getGasInTank();
        asserEquals(20.0,gallons, 1e-6);
        
        testCar.addGas(5);
        gallons = testCar.getGasInTank();
        assert
}
