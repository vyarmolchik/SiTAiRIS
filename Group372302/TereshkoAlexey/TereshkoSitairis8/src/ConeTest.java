import org.junit.Test;
import org.junit.Assert;

/**
 * Created by tresh on 04.12.2015.
 */
public class ConeTest {
    @Test
    public void testSquare1() throws Exception {
        Cone triangle2 = new Cone(4, 6);
        Assert.assertEquals(75.36, triangle2.square(), 1);
    }

    @Test
    public void testSquare2() throws Exception {
        Cone triangle2 = new Cone(4, 6);
        Assert.assertEquals(75.36, triangle2.square(), 1);
    }

    @Test
    public void testVolume1() throws Exception {
        Cone triangle1 = new Cone(6, 3);
        Assert.assertEquals(13, triangle1.volume(), 0);
    }

    @Test
    public void testVolume2() throws Exception {
        Cone triangle1 = new Cone(6, 3);
        Assert.assertEquals(0, triangle1.volume(), 0);
    }
}
