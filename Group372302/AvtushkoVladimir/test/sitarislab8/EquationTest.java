/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitarislab8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vladimir
 */
public class EquationTest {

    public EquationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getRootsCount method, of class Equation.
     */
    @Test
    public void testGetRootsCount() {
        System.out.println("test 1");
        Equation instance = new Equation(1, -5, 6);
        int expResult = 2;
        int result = instance.getRootsCount();
        assertTrue(expResult == result);
    }

    /**
     * Test of getX1 method, of class Equation.
     *
     * @throws sitarislab8.EquationException
     */
    @Test
    public void testGetX1() throws EquationException {
        System.out.println("test 2");
        double[] expectedResult = {3.0, 2.0};
        double[] result = {0.0, 0.0};
        Equation instance = new Equation(1, -5, 6);
        result[0] = instance.getX1();
        result[1] = instance.getX2();
        assertTrue(expectedResult[0] == result[0] && expectedResult[1] == result[1]);
    }

    /**
     * Test of getX2 method, of class Equation.
     *
     * @throws sitarislab8.EquationException
     */
    @Test(expected = EquationException.class)
    public void testGetX2() throws EquationException {
        System.out.println("test 3");
        Equation instance = new Equation(1, 1, 10);
        double result = instance.getX2();
        assertNull(result);
    }

    /**
     *
     * @throws sitarislab8.EquationException
     */
    @Test(expected = EquationException.class)
    public void testSolveException1() throws EquationException {
        double result[] = null;
        System.out.println("test 4");
        Equation instance = new Equation(0, 2, 3);
        result[0] = instance.getX2();
        result[1] = instance.getX1();
        assertNull(result);
    }

    /**
     *
     * @throws EquationException
     */
    @Test(expected = EquationException.class)
    public void testSolveException2() throws EquationException {
        double result[] = null;
        System.out.println("test 5");
        Equation instance = new Equation(0, 0, 0);
        result[0] = instance.getX2();
        result[1] = instance.getX1();
        assertNull(result);
    }
}
