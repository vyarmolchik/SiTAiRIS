
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class PyramidTest {
    private static Pyramid pyramid;

    @BeforeClass
    public static void setUp() throws Exception {
        pyramid = new Pyramid();
    }

    @Test
    public void testVolume() throws Exception {
        assertTrue(10.0 == pyramid.volume(5, 2, 3));
    }

    @Ignore
    @Test(expected = InvalidParameterException.class)
    public void testVolume1() throws Exception {
        pyramid.volume(5, 2, 1);
    }

    @Test
    public void testVolume2() throws Exception {
        assertFalse(11.0 == pyramid.volume(5, 2, 3));
    }

    @Test
    public void testSquareBottom() throws Exception {
        assertTrue(6.0 == pyramid.squareBottom(2, 3));
    }

    @Test(expected = InvalidParameterException.class)
    public void testSquareBottom1() throws Exception {
        pyramid.squareBottom(2, -3);
    }

    @Test
    public void testSquareBottom2() throws Exception {
        assertFalse(11.0 == pyramid.squareBottom(2, 3));
    }

    @Test
    public void testSquareSidesA() throws Exception {
        assertTrue(5.0 == Math.round(pyramid.squareSidesA(5, 2, 3)));
    }

    @Test(expected = InvalidParameterException.class)
    public void testSquareSidesA1() throws Exception {
        pyramid.squareSidesA(0, 2, -3);
    }

    @Test
    public void testSquareSidesA2() throws Exception {
        assertFalse(5.22 == pyramid.squareSidesA(5, 2, 3));
    }

    @Test
    public void testSquareSidesB() throws Exception {
        assertTrue(8.0 == Math.round(pyramid.squareSidesB(5, 2, 3)));
    }

    @Ignore
    @Test(expected = InvalidParameterException.class)
    public void testSquareSidesB1() throws Exception {
        pyramid.squareSidesB(1, 2, 1);
    }

    @Test
    public void testSquareSidesB2() throws Exception {
        assertFalse(7.0 == Math.round(pyramid.squareSidesB(5, 2, 3)));
    }

    @Test
    public void testSquareSides() throws Exception {
        assertTrue(26.0 == Math.round(pyramid.squareSides(5, 2, 3)));
    }

    //@Ignore
    @Test(expected = InvalidParameterException.class)
    public void testSquareSides1() throws Exception {
        pyramid.squareSides(-5, 2, 1);
    }

    @Test
    public void testSquareSides2() throws Exception {
        assertFalse(25.0 == Math.round(pyramid.squareSides(5, 2, 3)));
    }

    @Test
    public void testSquareAll() throws Exception {
        assertTrue(32.0 == Math.round(pyramid.squareAll(5, 2, 3)));
    }
    @Test(expected = InvalidParameterException.class)
    public void testSquareAll1() throws Exception {
        pyramid.squareAll(-5, 2, 1);
    }

    @Test
    public void testSquareAll2() throws Exception {
        assertFalse(31.0 == Math.round(pyramid.squareAll(5, 2, 3)));
    }
}