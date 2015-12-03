package quadraticequation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Kvadratnoe_uravnenieTest {
    
    public Kvadratnoe_uravnenieTest() {
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
     * Test of solve method, of class QuadraticEquationEvaluetor.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        Kvadratnoe_uravnenie instance = new Kvadratnoe_uravnenie("10x^2+5.2x=-7");
        String expResult = "D<0 Нет корней!";
        String result = instance.solve();
        assertEquals(expResult, result);
    }
       /**
     * Test of solve method, of class QuadraticEquationEvaluetor.
     */
   @Test
    public void testSolve2() {
        System.out.println("solve2");
        Kvadratnoe_uravnenie instance = new Kvadratnoe_uravnenie("1x^2+6x=-9");
        String expResult = "D=0 x=-3.0";
        String result = instance.solve();
        assertEquals(expResult, result);
    }
    
       @Test
    public void testSolve3() {
        System.out.println("solve3");
        Kvadratnoe_uravnenie instance = new Kvadratnoe_uravnenie("0x^2+0x=0");
        String expResult = "someError!!";
        String result = instance.solve();
        assertEquals("D=0 x=NaN", result);
    } 
    
     @Test
    public void testSolve4() {
        System.out.println("solve4");
        Kvadratnoe_uravnenie instance = new Kvadratnoe_uravnenie("1x^2+1x=6");
        String expResult = "x1=2.0 x2=-3.0";
        String result = instance.solve();
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testSolve5() {
        System.out.println("solve5");
        Kvadratnoe_uravnenie instance = new Kvadratnoe_uravnenie("x^2+x=6");
        String expResult = "x1=2.0 x2=-3.0";
        String result = instance.solve();
        assertNotSame(expResult, result);
    }   

    /**
     * Test of verifyEquation method, of class QuadraticEquationEvaluetor.
     */
    @Test
    public void testVerifyEquation() {
        System.out.println("verifyEquation");
        Kvadratnoe_uravnenie instance = new Kvadratnoe_uravnenie("10x^2+5.2x=-7");
        boolean expResult = true;
        boolean result = instance.verifyEquation();
        assertEquals(expResult, result);
    }
    /**
     * Test of verifyEquation method, of class QuadraticEquationEvaluetor.
     */
    @Test
    public void testVerifyEquation2() {
        System.out.println("verifyEquation2");
        Kvadratnoe_uravnenie instance = new Kvadratnoe_uravnenie(" x^2 ");
        boolean expResult = false;
        boolean result = instance.verifyEquation();
        assertEquals(expResult, result);
    }
     /**
     * Test of verifyEquation method, of class QuadraticEquationEvaluetor.
     */
    @Test
    public void testVerifyEquation3() {
        System.out.println("verifyEquation3");
        Kvadratnoe_uravnenie instance = new Kvadratnoe_uravnenie(" ");
        boolean expResult = false;
        boolean result = instance.verifyEquation();
        assertEquals(expResult, result);
    }
    
}
