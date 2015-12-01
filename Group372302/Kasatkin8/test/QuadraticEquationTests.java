
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuadraticEquationTests {

    public QuadraticEquationTests() {
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

    @Test
    public void testSolve0(){
        QuadraticEquation instance = new QuadraticEquation("10x^2+5.2x=-4");
        String expResult = "Корней нет!";
        String result = instance.solve();
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolve1(){
        QuadraticEquation instance = new QuadraticEquation("1x^2+6x=-9");
        String expResult = "D=0\nx=-3.0";
        String result = instance.solve();
        Assert.assertEquals(expResult, result);
    }

    @Test(expected = org.junit.ComparisonFailure.class)
    public void testSolve2(){
        QuadraticEquation instance = new QuadraticEquation("4x^2+3x=-5");
        String expResult = "someError!!";
        String result = instance.solve();
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolve3(){
        QuadraticEquation instance = new QuadraticEquation("1x^2+1x=6");
        String expResult = "x1=2.0 x2=-3.0";
        String result = instance.solve();
        Assert.assertEquals(expResult, result);
    }

    @Test (expected = org.junit.ComparisonFailure.class)
    public void testSolve4(){
        QuadraticEquation instance = new QuadraticEquation("x^2+x=6");
        String expResult = "x1=2.0 x2=-3.0";
        String result = instance.solve();
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testVerify0(){
        QuadraticEquation instance = new QuadraticEquation("10x^2+5.2x=-7");
        boolean expResult = true;
        boolean result = instance.verify();
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testVerify1(){
        QuadraticEquation instance = new QuadraticEquation(" x^2 ");
        boolean expResult = false;
        boolean result = instance.verify();
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testVerify2(){
        QuadraticEquation instance = new QuadraticEquation(" ");
        boolean expResult = false;
        boolean result = instance.verify();
        Assert.assertEquals(expResult, result);
    }

}

