import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;


//Conus calculator tests.
public class ConusTestCases {
    private static ConusCalculator conus;
    @BeforeClass
    public static void setUp() throws Exception {
        conus = new ConusCalculator();
    }

    //H cases
    @Test
    public void testH() {
        assertTrue(4.0 == conus.theH(5, 3));
    }

    @Test
    public void testNextH() {
        assertFalse(0 == conus.theH(5, 5));
    }

    //Square side cases
    @Test
    public void testSquareS() {
        assertTrue(78.5 == conus.squareS(5, 5));
    }

    @Test
    public void testSquareNextS() {
        assertFalse(conus.squareS(5, -5) < 0);
    }

    //Base square cases
    @Test
    public void testSquareB() {
        assertTrue(3.14 == conus.squareB(1));
    }

    @Test
    public void testSquareB() {
        assertTrue(0.0 == conus.squareB(0));
    }

    //Square of all bases cases
    @Test
    public void testSquare() {
        assertTrue(9 == conus.square(4.0, 5.0));
    }

    @Test
    public void testSquareNext() {
        assertFalse(conus.square(2.0, -1005.0) > 0);
    }

    //Volume cases
    @Test
    public void testVolume() {
        assertTrue(16.746666666666666 == conus.volume(4, 2));
    }

    @Test
    public void testVolumeNext() {
        assertTrue(conus.volume(-5, 3) < 0);
    }
}