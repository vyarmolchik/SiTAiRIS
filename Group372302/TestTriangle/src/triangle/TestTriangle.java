package triangle;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class TestTriangle {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testSquareTrue() throws Exception {
        Triangle triangle = new Triangle(4, 6, 8);
        Assert.assertEquals("Error", 11, triangle.square(), 1);
    }

    @Test
    public void testSquareFalse() throws Exception {
        Triangle triangle = new Triangle(4, 6, -10);
        thrown.expect(TriangleException.class);
        triangle.square();
    }

    @Test
    public void testPerimeterTrue() throws Exception {
        Triangle triangle = new Triangle(3, 6, 4);
        Assert.assertEquals("Error", 13, triangle.perimeter(), 0);
    }

    @Test
    public void testPerimeterFalse() throws Exception {
        Triangle triangle = new Triangle(3, 6, 10);
        thrown.expect(TriangleException.class);
        triangle.perimeter();
    }
}