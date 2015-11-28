import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {
    private static RhombusCalc rhombusCalc;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        rhombusCalc = new RhombusCalc();
    }

    @Test
    public  void testSquareByHeight() throws IllegalArgumentException  {
        assertEquals(6,rhombusCalc.squareByHeight(2,3),2);
    }
    @Test
    public void boolTestSquareByHeight() throws IllegalArgumentException {
        assertTrue(rhombusCalc.squareByHeight(4,5) == 20);
    }

    @Test(expected = IllegalArgumentException.class)
    public  void failTestSquareByHeight() throws IllegalArgumentException  {
        rhombusCalc.squareByHeight(0,3);
    }

    @Test
    public void testSquareByDiagonal() throws IllegalArgumentException {
        assertEquals(10,rhombusCalc.squareByDiagonal(4,5), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failTestSquareByDiagonal() throws IllegalArgumentException {
        rhombusCalc.squareByDiagonal(-1, 4);
    }

    @Test
    public void testPerimeter() throws IllegalArgumentException {
        assertEquals(16, rhombusCalc.perimeter(4), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void faiTestPerimeter() throws IllegalArgumentException {
        rhombusCalc.perimeter(-1);
    }
}
