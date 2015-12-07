import junit.Conus;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConusTest {
    
    private static Conus conus;

    @BeforeClass
    public static void setUp() throws Exception {
        conus = new Conus();
    }
    
    @Test
    public void testFindLenght() {
        assertTrue(5 == conus.findLength(4, 3));
    }
    
    @Test
    public void testFindRadius() {//
        assertTrue(4 == conus.findRadius(5, 3));
    }
    
    @Test
    public void testFindHeight() {
        assertTrue(4 == conus.findHeight(5, 3));
    }

    @Test
    public void testFindHeightNeg() {
        assertFalse(6 == conus.findHeight(6, 40));
    }

    @Test
    public void testSquareSide() {//
        assertTrue(18.84 == conus.squareSide(2, 3));
    }

    @Test
    public void testSquareSideNeg() {
        assertFalse(conus.squareSide(4, -4) < 0);
    }

    @Test
    public void testSquareBase() {
        assertTrue(78.5 == conus.squareBase(5));
    }

    @Test
    public void testSquareAll() {
        assertTrue(9 == conus.squareAll(4.0, 5.0));
    }
    
    @Test
    public void testSquareGeneral() {
        assertTrue(113.04 == conus.squareGeneral(3, 4));
    }

    @Test//
    public void testSquareAllNeg() {
        assertFalse(conus.squareAll(4.0, -5.0) > 0);
    }

    @Test
    public void testVolume() {
        assertTrue(50.24 == conus.volume(3, 4));
    }

    @Test
    public void testVolumeNeg() {
        assertTrue(conus.volume(-5, 3) < 0);
    }
}