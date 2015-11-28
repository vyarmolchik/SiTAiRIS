package piramid;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pyramid4bTest {
    
    private Pyramid4b piramid;
    private int height;
    private int side;
    
    public Pyramid4bTest() {
    }
    
    private Pyramid4b getUntrowInstance(double height, double side) {
        Pyramid4b instance = null;
        try {
            instance = new Pyramid4b(height, side);
        } catch (Pyramid4b.NotPeramidException ex) {
            fail("Генерация исключения когда пирамида невырождена");
        }
        return instance;
    }
    
    @Before
    public void setUp() {
        piramid =  getUntrowInstance(3., 2.);
    }

    @Test(expected = Pyramid4b.NotPeramidException.class)
    public void testConstructor() throws Pyramid4b.NotPeramidException {
        System.out.println("Constructor");
        
        try {
            Pyramid4b instance = new Pyramid4b(1., 2.);
        } catch (Pyramid4b.NotPeramidException ex) {
            fail("Генерация исключения когда пирамида невырождена");
        }  
        Pyramid4b instance = new Pyramid4b(0., 1.);
        fail("Не произошла генерация исключения когда пирамида вырождена");
    }
    
    @Test
    public void testCountVolume() {
        System.out.println("CountVolume");
        
        Pyramid4b instance = getUntrowInstance(3., 2.);
        
        double result = instance.CountVolume();
        assertEquals(4., result, 0.);
        assertNotSame(4., result);
        
    }

    @Test
    public void testCountBaseSquare() {
        System.out.println("CountBaseSquare");
        
        double result = piramid.CountBaseSquare();
        assertEquals(4., result, 0.);
        assertNotSame(2., result);
    }

    @Test
    public void testCountTriangleSquare() {
        System.out.println("CountTriangleSquare");
        
        double result = piramid.CountTriangleSquare();
        assertEquals(Math.sqrt(10.), result, 0.0);
        assertNotSame(2., result);
    }

    @Test
    public void testCountSquare() {
        System.out.println("CountSquare");
        
        double result = piramid.CountSquare();
        assertEquals(4. + 4 * Math.sqrt(10.), result, 0.0);
        assertNotSame(2., result);
    }
}
