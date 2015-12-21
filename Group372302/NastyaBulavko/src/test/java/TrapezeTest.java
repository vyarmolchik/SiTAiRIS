import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TrapezeTest {
    public TrapezeTest(){}

    @Test
    public void testSquarePositive() throws Exception{
        double a = 5, b = 1, h = 2;
        Trapeze obj = new Trapeze();
        obj.setA(a);
        Trapeze obj1 = new Trapeze();
        obj1.setB(b);
        Trapeze obj2 = new Trapeze();
        obj2.setH(h);
        BigDecimal expResult = new BigDecimal((((double)a + (double)b)/2) * (double)h);
        BigDecimal result = obj.calculateSquare();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testPerimeterPositive() throws Exception{
        double a = 10, b = 2, c = 4, d = 5, h = 7;
        Trapeze obj = new Trapeze();
        obj.setA(a);
        Trapeze obj1 = new Trapeze();
        obj.setB(b);
        Trapeze obj2 = new Trapeze();
        obj1.setH(h);
        Trapeze obj3 = new Trapeze();
        obj2.setC(c);
        Trapeze obj4 = new Trapeze();
        obj2.setD(d);
        BigDecimal expResult = new BigDecimal((double)a + (double)b + (double)c + (double)d);
        BigDecimal result = obj.calculatePerimeter();
        assertEquals(expResult,result,0.01);
    }

    @Test
    public void testSquareNull() throws Exception{
        double a = 0, b = 0, h = 0;
        Trapeze obj = new Trapeze();
        obj.setA(a);
        Trapeze obj1 = new Trapeze();
        obj1.setB(b);
        Trapeze obj2 = new Trapeze();
        obj2.setH(h);
        BigDecimal expResult = new BigDecimal((((double)a + (double)b)/2) * (double)h);
        BigDecimal result = obj.calculateSquare();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testPerimeterNull() throws Exception{
        double a = 0, b = 0, c = 0, d = 0, h = 0;
        Trapeze obj = new Trapeze();
        obj.setA(a);
        Trapeze obj1 = new Trapeze();
        obj.setB(b);
        Trapeze obj2 = new Trapeze();
        obj1.setH(h);
        Trapeze obj3 = new Trapeze();
        obj2.setC(c);
        Trapeze obj4 = new Trapeze();
        obj2.setD(d);
        BigDecimal expResult = new BigDecimal((double)a + (double)b + (double)c + (double)d);
        BigDecimal result = obj.calculatePerimeter();
        assertEquals(expResult,result,0.01);
    }

    @Test
    public void testSquareMinus() throws Exception{
        double a = -5, b = -1, h = 2;
        Trapeze obj = new Trapeze();
        obj.setA(a);
        Trapeze obj1 = new Trapeze();
        obj1.setB(b);
        Trapeze obj2 = new Trapeze();
        obj2.setH(h);
        BigDecimal expResult = new BigDecimal((((double)a + (double)b)/2) * (double)h);
        BigDecimal result = obj.calculateSquare();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testPerimeterMinus() throws Exception{
        double a = -10, b = -2, c = -4, d = -5, h = -7;
        Trapeze obj = new Trapeze();
        obj.setA(a);
        Trapeze obj1 = new Trapeze();
        obj.setB(b);
        Trapeze obj2 = new Trapeze();
        obj1.setH(h);
        Trapeze obj3 = new Trapeze();
        obj2.setC(c);
        Trapeze obj4 = new Trapeze();
        obj2.setD(d);
        BigDecimal expResult = new BigDecimal((double)a + (double)b + (double)c + (double)d);
        BigDecimal result = obj.calculatePerimeter();
        assertEquals(expResult,result,0.01);
    }
}
