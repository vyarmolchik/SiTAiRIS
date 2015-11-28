package example;

import junit.framework.TestCase;
import org.junit.Assert;


public class SphereTest extends TestCase {

    public void testGetVolume() throws Exception {
        Sphere sphere = new Sphere(6);
        Assert.assertEquals(sphere.getVolume(), 4. / 3. * Math.PI * Math.pow(5, 3), 0.001);
    }

    public void testGetSquare() throws Exception {
        Sphere sphere = new Sphere(2);
        Assert.assertEquals(sphere.getSquare(), 4. * Math.PI * Math.pow(2, 2), 0.001);
    }
}