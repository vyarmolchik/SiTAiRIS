package test;

import conusKod.Conus;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import java.security.InvalidParameterException;

import java.security.InvalidParameterException;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConusTest {
    
    private static Conus conus;

    @BeforeClass
    public static void setUp() throws Exception {
        conus = new Conus();
    }

    @Test
    public void testSquareSide() {
        assertTrue(18.84 == conus.squareSide(2, 3));
    }

    @Test(expected = InvalidParameterException.class)
    public void testsquareSideException1() {
        conus.squareSideException(4, 0);
    }

    @Test(expected = InvalidParameterException.class)
    public void testsquareSideException2() {
        conus.squareSideException(0, 4);
    }
    
    @Test(expected = InvalidParameterException.class)
    public void testsquareSideException3() {
        conus.squareSideException(-4, 4);
    }

    @Test(expected = InvalidParameterException.class)
    public void testsquareSideException4() {
        conus.squareSideException(4, -4);
    }
    
    @Test
    public void testVolume() {
        assertTrue(50.24 == conus.volume(3, 4));
    }

    @Test(expected = InvalidParameterException.class)
    public void testVolumeException1() {
        conus.volumeException(4, 0);
    }
    
    @Test(expected = InvalidParameterException.class)
    public void testVolumeException2() {
        conus.volumeException(0, 4);
    }
    
    @Test(expected = InvalidParameterException.class)
    public void testVolumeException3() {
        conus.volumeException(-3, 4);
    }
    
    @Test(expected = InvalidParameterException.class)
    public void testVolumeException4() {
        conus.volumeException(3, -4);
    }
}