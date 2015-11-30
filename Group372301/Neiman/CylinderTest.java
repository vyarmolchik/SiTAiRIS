import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Я on 27.11.2015.
 */
public class CylinderTest {
   private static Cylinder cr;
    @BeforeClass
    public static void Cylinder() {
        cr = new Cylinder();
    }
    @Test
    public void SquareTestTrue(){
        assertTrue(cr.square(2,3) == 65.94 );
    }
    @Test
    public void SquareTestFalse(){
        assertFalse(cr.square(4, 5) == 65.94);
    }
    @Test
    public void  VolumeTestTrue(){
        assertTrue(cr.volume(6,3) == 169.56);
    }
    @Test
    public void  VolumeTestFalse(){
        assertFalse(cr.volume(9,4) == 169.56);
    }

    @Test(expected = InvalidParameterException.class)
    public void testException1(){
        cr.square(-1,2);
    }
    @Test(expected = InvalidParameterException.class)
    public void testException2(){
        cr.volume(-1,2);
    }
}
