package tests;

import org.junit.Assert;
import org.junit.Test;
import view.Pyramid;

import static org.junit.Assert.*;

/**
 * Created by έμμΰ on 21.11.2015.
 */
public class PyramidTest {
    Pyramid pyramid = new Pyramid();

    @Test
    public void testCountArea1() throws Exception{
        Assert.assertNotNull(pyramid.countArea(5, 5));
        Assert.assertEquals(Float.valueOf(12.5f), pyramid.countArea(5,5));
    }

    @Test
    public void testCountArea2() throws Exception{
        Assert.assertNotNull(pyramid.countArea(5, 5));
        Assert.assertEquals(Float.valueOf(12.5f), pyramid.countArea(5,6));
    }

    @Test
    public void testCountVolume1() throws Exception{
        Assert.assertNotNull(pyramid.countVolume(5, 5));
        Assert.assertEquals(Float.valueOf(41.66667f), pyramid.countVolume(5, 5));
    }

    @Test
    public void testCountVolume2() throws Exception{
        Assert.assertNotNull(pyramid.countVolume(5, 6));
        Assert.assertEquals(Float.valueOf(12.5f), pyramid.countVolume(5,6));
    }
}