import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuadraticEquationTest {
    private static QuadraticEquation qe;

    @BeforeClass
    public static void QuadraticEquation(){
        qe = new QuadraticEquation();
    }

    @Test(expected = InvalidParameterException.class)
    public void testSolveException1() {
        qe.solve(1, 1, 10);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSolveException2() {
        qe.solve(0, 2, 3);
    }

    @Test
    public void testSolveTrue() {
        double[] expectedResult = {2,3};
        double[] result = qe.solve(1, -5, 6);
        assertTrue(expectedResult[0] == result[0] && expectedResult[1] == result[1]);
    }

    @Test
    public void testSolveFalse() {
        double[] expectedResult = {-2,-3};
        double[] result = qe.solve(1, -5, 6);
        assertFalse(expectedResult[0] == result[0] && expectedResult[1] == result[1]);
    }

}
