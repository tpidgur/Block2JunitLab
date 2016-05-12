import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class ModelTest provides testing for all methods in the Model class.
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 12.05.16)
 */
public class ModelTest {
    /**
     * The {@code Model}  represents the instance of the mentioned class
     * The {@code ACCURACY}  sets the tolerance in the following methods, like assertEquals (expected,actual, ACCURACY);
     */
    private static Model model;
    public static final double ACCURACY = 1e-10;

    /**
     * initializes instance of the class Model and sets the initial value
     */
    @BeforeClass
    public static void runT() {
        model = new Model();
        model.setValue(325);
    }

    /**
     * tests the  getUnits() method in Model class
     */
    @Test
    public void testGetUnits() {
        int res = model.getUnits();
        assertEquals(3, res, ACCURACY);
    }

    /**
     * tests the  getDecades() method in Model class
     */
    @Test
    public void testGetDecades() {
        int res = model.getDecades();
        assertTrue(res == 2);
    }

    /**
     * tests the  getHundreds() method in Model class
     */
    @Test
    public void testGetHundreds() {
        int res = model.getHundreds();
        assertEquals(5, res, ACCURACY);
    }

    /**
     * tests the  getReverseValue() method in Model class
     */
    @Test
    public void testGetReverseValue() {
        int res = model.getReverseValue();
        assertTrue(res == 523);
    }

    /**
     * tests the  findNaturalLogarithm() method in Model class
     */
    @Test
    public void testFindNaturalLogarithm() {
        double res = model.findNaturalLogarithm();
        assertEquals(6.259581464064923, res, ACCURACY);
    }

}