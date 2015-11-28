
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

public class ArrayCalcTest {

    private int[] arr;

    @Before
    public void setUp() {
        arr = new int[]{1, 2, 3, 4, 5};
    }

    @After
    public void tearDown() {
        arr = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testMaxElement() {
        System.out.println("maxElement");
        ArrayCalc instance = new ArrayCalc();
        int expResult = 5;
        int result = instance.maxElement(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testMinElement() {
        System.out.println("minElement");
        ArrayCalc instance = new ArrayCalc();
        int expResult = 1;
        int result = instance.minElement(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testAverageValue() {
        System.out.println("averageValue");
        ArrayCalc instance = new ArrayCalc();
        double expResult = 3.0;
        double result = instance.averageValue(arr);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testException() {

        System.out.println("testException averageValue");
        ArrayCalc instance = new ArrayCalc();
        try {
            arr = new int[0];
            double expResult = 1.0;
            double result = instance.averageValue(arr);
            fail("IllegalArgumentException was expected");
        } catch (IllegalArgumentException ex) {
        }
    }

    @Ignore
    @Test
    public void testIgnoreException() {

        System.out.println("testIgnoreException averageValue");
        ArrayCalc instance = new ArrayCalc();
        try {
            arr = new int[1];
            double expResult = 1.0;
            double result = instance.averageValue(arr);
            fail("IllegalArgumentException wasnt expected");
        } catch (IllegalArgumentException ex) {
        }
    }

}
