/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitairis8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.security.InvalidParameterException;

public class CylinderTest {

    Cylinder obj = null;

    public CylinderTest() {
    }

    @Before
    public void setUp() {
        obj = new Cylinder();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    /**
     * Test of CalculateVolume method, of class Cylinder.
     */
    @Test
    public void testVolumeSuccess() {
        assertTrue(obj.CalculateVolume(1, 2) == 6.28);
    }

    @Test
    public void testVolumeFail() {
        assertFalse(obj.CalculateVolume(1, 2) != 6.28);
    }

    @Test(expected = InvalidParameterException.class)
    public void testVolumeFirstException() {
        obj.CalculateVolume(-1, 2);
    }

    @Test(expected = InvalidParameterException.class)
    public void testVolumeSecondException() {
        obj.CalculateVolume(1, -2);
    }

    @Test(expected = InvalidParameterException.class)
    public void testVolumeFirstAndSecondException() {
        obj.CalculateVolume(-1, -2);
    }

    @Test(expected = InvalidParameterException.class)
    public void testVolumeNullFirstException() {
        obj.CalculateVolume(0, 2);
    }

    @Test(expected = InvalidParameterException.class)
    public void testVolumeNullSecondException() {
        obj.CalculateVolume(1, 0);
    }

    @Test(expected = InvalidParameterException.class)
    public void testVolumeNullFirstAndSecondException() {
        obj.CalculateVolume(0, 0);
    }

    @Test(expected = InvalidParameterException.class)
    public void testVolumeNullAndMinusException() {
        obj.CalculateVolume(0, -2);
    }

    @Test(expected = InvalidParameterException.class)
    public void testVolumeMinusAndNullException() {
        obj.CalculateVolume(-1, 0);
    }

    @Test
    public void testSurfaceAreaSuccess() {
        assertTrue(obj.CalculateSurfaceArea(1, 2) == 18.84);
    }

    @Test
    public void testSurfaceAreaFail() {
        assertFalse(obj.CalculateSurfaceArea(1, 2) != 18.84);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSurfaceAreaFirstException() {
        obj.CalculateSurfaceArea(-1, 2);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSurfaceAreaSecondException() {
        obj.CalculateSurfaceArea(1, -2);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSurfaceAreaFirstAndSecondException() {
        obj.CalculateSurfaceArea(-1, -2);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSurfaceAreaNullFirstException() {
        obj.CalculateSurfaceArea(0, 2);
    }

    @Test(expected = InvalidParameterException.class)
    public void tesSurfaceAreaNullSecondException() {
        obj.CalculateSurfaceArea(1, 0);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSurfaceAreaNullFirstAndSecondException() {
        obj.CalculateSurfaceArea(0, 0);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSurfaceAreaNullAndMinusException() {
        obj.CalculateSurfaceArea(0, -2);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSurfaceAreaMinusAndNullException() {
        obj.CalculateSurfaceArea(-1, 0);
    }
}
