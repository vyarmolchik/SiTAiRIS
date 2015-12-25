/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitairis88;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author Анна
 */
public class Sitairis88Test {
    
   public Sitairis88Test() {
    }


    /**
     * Test of getVolume method, of class Sitairis88.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        int h = 5;
        int r = 3;
        double expResult = 47.1;
        double result = Sitairis88.getVolume(h, r);
        assertTrue( "Объем конуса вычеслен неправильно!", result==expResult);
    }
    
     /**
     * Test of getVolume method, of class Sitairis88.
     */
    @Test
    public void testGetVolumeNull() {
         int h = 5;
        int r = 0;
        double result = Sitairis88.getVolume(h, r);
        assertNull(result);
    }

    /**
     * Test of getAreaFaceBase method, of class Sitairis88.
     */
    @Test
    public void testGetAreaFaceBaseNull() {
        System.out.println("getAreaFaceBase");
        int r = 0;
        double result = Sitairis88.getAreaFaceBase(r);
         assertNull( result);
        }
    
      /**
     * Test of getAreaFaceBase method, of class Sitairis88.
     */
    @Test
    public void testGetAreaFaceBase() {
        System.out.println("getAreaFaceBase");
        int r = 3;
        double expResult = 28.26;
        double result = Sitairis88.getAreaFaceBase(r);
         assertTrue( "Площадь основания конуса вычеслена неправильно!", result==expResult);
        }

    /**
     * Test of getAreaFaceSide method, of class Sitairis88.
     */
    @Test
    public void testGetAreaFaceSide() {
        System.out.println("getAreaFaceSide");
        int h = 2;
        int r = 5;
        double expResult = 84.54708747201171;
        double result = Sitairis88.getAreaFaceSide(h, r);
         assertTrue( "Площадь боковой поверхности конуса вычеслена неправильно!", result==expResult);
    }
    
     /**
     * Test of getAreaFaceSide method, of class Sitairis88.
     */
    @Test
    public void testGetAreaFaceSideMinus() {
        int h = -3;
        int r = 4;
        double expResult = 62.8;
        double result = Sitairis88.getAreaFaceSide(h, r);
        assertTrue( "Площадь боковой поверхности конуса вычеслена неправильно!", result==expResult);
    }

}
