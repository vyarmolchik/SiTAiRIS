/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhombus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ddv
 */
public class RhombusTest {
    Rhombus ob = null;
    public RhombusTest() {}
    
    @Before
    public void setUp() {
        ob = new Rhombus();
    }
    
    @After
    public void tearDown() {
        ob = null;
    }

    /**
     * Test of main method, of class Rhombus.
     */
    @Test
    public void testAreaOK() {
        assertTrue(ob.area(3, 6) == 9.0);
    }
    
    @Test
    public void testPerimetrOK() {
        assertTrue(ob.perimetr(3) == 12);
    }
    
    @Test
    public void testPerimetrBad() {
         assertFalse(ob.perimetr(4) != 16);
    }
    
    @Test
    public void testAreaBad() {
         assertFalse(ob.area(6,6) != 18.0);
    }
    
    @Test(expected = InvalidParameterException.class)
    public void testAreaException() {
        ob.area(-1, 3);
    }
    
    @Test(expected = InvalidParameterException.class)
    public void testPerimetrException() {
        ob.perimetr(0);
    }
     
}