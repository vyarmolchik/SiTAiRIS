import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testSquare1() throws Exception {
        Triangle triangle2 = new Triangle(4, 6, 8);
        Assert.assertEquals(11, triangle2.square(), 1);
    }

    @Test
    public void testSquare2() throws Exception {
        Triangle triangle2 = new Triangle(4, 6, -8);
        Assert.assertEquals(11, triangle2.square(), 1);
    }

    @Test
    public void testPerimeter1() throws Exception {
        Triangle triangle1 = new Triangle(3, 6, 4);
        Assert.assertEquals(13, triangle1.perimeter(), 0);
    }

    @Test
    public void testPerimeter2() throws Exception {
        Triangle triangle1 = new Triangle(3, 6, 10);
        Assert.assertEquals(0, triangle1.perimeter(), 0);
    }
}