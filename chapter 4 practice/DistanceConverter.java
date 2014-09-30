public class DistanceConverter
{
    private static final double FEET_IN_YARDS = 3;
    private static final double INCHES_IN_FEET = 12;
    
    
    public static void main(String[] args)
    {
        double yards = 3.5;
        double feet = yards * FEET_IN_YARDS;
        double inches = feet*INCHES_IN_FEET;
        
        System.out.println(yards + " yards are " + feet + " feet");
        System.out.println(yards + " yards are " + inches + " inches");
        
    }
}