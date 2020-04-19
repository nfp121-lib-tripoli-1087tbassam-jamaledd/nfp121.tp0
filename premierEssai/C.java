
/**
 * Write a description of class C here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// bassam makram jamleddine 1087t tripoli cnam informatique,  a modifie cette class
public class C extends A
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class C
     */
    public C()
    {
        super();
        // initialise instance variables
        x = 5;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + (super.sampleMethod(3));
    }
}
