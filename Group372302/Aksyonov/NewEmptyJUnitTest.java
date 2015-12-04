/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nexon
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void triangleCountsTest() {
        
    ITriangleCounts t=new ITriangleCountsImpl(1.0, 2.0, 3.0);
    double expected=6;
    double actual=t.countPrimeter();
    org.junit.Assert.assertEquals(expected,actual, 0.01);
    
    actual=t.countSquare();
    org.junit.Assert.assertEquals(-1,actual, 0.01);
    
    org.junit.Assert.assertFalse(t.setSides(1, 2, 3));
    org.junit.Assert.assertFalse(t.setSides(0, 2, 3));
    org.junit.Assert.assertFalse(t.setSides(3, -2, 3));
    
    org.junit.Assert.assertTrue(t.setSides(6, 4, 3));
    
    expected=5.33;
    actual=t.countSquare();
    org.junit.Assert.assertEquals(expected,actual, 0.01);
    }
}
