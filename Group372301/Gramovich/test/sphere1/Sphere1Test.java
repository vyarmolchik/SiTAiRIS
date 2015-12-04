/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphere1;

import java.security.InvalidParameterException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matvey
 */
public class Sphere1Test {
    
    int radius1;
    
    public Sphere1Test() {
    }
    
    @Before
    public void setUp() {
        radius1 = 3;
    }
    @After
    public void tearDown() {
        radius1 = 3;
    }

    /**
     * Test of getvolume method, of class Sphere1.
     */
    @Test
    public void testGetvolume() {
        System.out.println("getvolumeEqual");
        Sphere1 instance = new Sphere1();
        double expResult = 113.04;
        double result = instance.getvolume(radius1);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetvolumeparamT() {
        System.out.println("getvolumeTrue");
        Sphere1 instance = new Sphere1();
        double expResult = 113.04;
        double result = instance.getvolume(radius1);
        assertTrue(expResult==result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testGetvolumeparamF() {
        System.out.println("getvolumeFalse");
        Sphere1 instance = new Sphere1();
        double expResult = 12.00;
        double result = instance.getvolume(radius1);
        assertFalse(expResult==result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test (expected=InvalidParameterException.class)
    public void testGetvolumeExc() {
        System.out.println("getvolumeInval");
        Sphere1 instance = new Sphere1();
        radius1=0;
        instance.getvolume(radius1);
    }



    /**
     * Test of getsquare method, of class Sphere1.
     */
    @Test
    public void testGetsquare() {
        System.out.println("getsquareEqu");
        Sphere1 instance = new Sphere1();
        double expResult = 113.0;
        double result = Math.round(instance.getsquare(radius1));
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testGetsquareparamT() {
        System.out.println("getsquareTrue");
        Sphere1 instance = new Sphere1();
        double expResult = 113.0;
        double result = Math.round(instance.getsquare(radius1));
        assertTrue(expResult == result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
       @Test
    public void testGetsquareparamF() {
        System.out.println("getsquareFalse");
        Sphere1 instance = new Sphere1();
        double expResult = 12;
        double result = instance.getsquare(radius1);
        assertFalse(expResult == result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test (expected=InvalidParameterException.class)
    public void testGetsquareExc() {
        System.out.println("getsquareInval");
        Sphere1 instance = new Sphere1();
        radius1=0;
        instance.getsquare(radius1);
    }
    
}
