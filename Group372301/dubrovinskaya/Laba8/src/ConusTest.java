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
    public void testFindH() {
        assertTrue(4 == conus.findH(5, 3));
    }

    @Test
    public void testFindHNeg() {
        assertFalse(6 == conus.findH(6, 4));
    }

    @Test
    public void testSquareSide() {
        assertTrue(18.84 == conus.squareSide(2, 3));
    }

    @Test
    public void testSquareSideNeg() {
        assertFalse(conus.squareSide(4, -4) < 0);
    }

    @Test
    public void testSquareBase() {
        assertTrue(0 == conus.squareBase(0));
    }

    @Test
    public void testSquareAll() {
        assertTrue(9 == conus.squareAll(4.0, 5.0));
    }

    @Test
    public void testSquareAllNeg() {
        assertFalse(conus.squareAll(4.0, -5.0) > 0);
    }

    @Test
    public void testVolume() {
        assertTrue(47.1 == conus.volume(5, 3));
    }

    @Test
    public void testVolumeNeg() {
        assertTrue(conus.volume(-5, 3) < 0);
    }
}