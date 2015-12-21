/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shabanstas8;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Станислав
 */
public class ShabanStas8Test {

    public ShabanStas8Test() {
    }

    /**
     * Test of PyramidVolume method, of class ShabanStas8.
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("RABOTAET");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("RABOTAET");
    }

    @Test
    public void testPyramidVolume() {
        System.out.println("PyramidVolume");
        int facet = 4;
        int baseSide = 3;
        double expResult = 8.0;
        double result = ShabanStas8.PyramidVolume(facet, baseSide);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of FacetSquare method, of class ShabanStas8.
     */
    @Test
    public void testFacetSquare() {
        System.out.println("FacetSquare");
        int facet = 4;
        int baseSide = 5;
        double expResult = 400.0;
        double result = ShabanStas8.FacetSquare(facet, baseSide);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of main method, of class ShabanStas8.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        ShabanStas8.main(args);
//        fail("The test case is a prototype.");
//    }
//    @Test
//    public void testZero
//    
}
