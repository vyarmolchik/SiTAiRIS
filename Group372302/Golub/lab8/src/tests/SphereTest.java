package tests;

import org.junit.Assert;
import org.junit.Test;
import view.Sphere;

import static org.junit.Assert.*;

/**
 * Created by έμμΰ on 25.11.2015.
 */
public class SphereTest {
    Sphere sphere = new Sphere();

    @Test
    public void testParseValue1() throws Exception {
        Assert.assertNotNull(sphere.parseValueToVolume("5"));
        Assert.assertEquals(Float.valueOf("523.3334"), sphere.parseValueToVolume("5"));
    }

    @Test (expected = Exception.class)
    public void testParseValue2() throws Exception {
        Assert.assertNotNull(sphere.parseValueToVolume("ghjk"));
    }

    @Test (expected = Exception.class)
    public void testParseValue3() throws Exception {
        Assert.assertNotNull(sphere.parseValueToVolume("-1"));
        Assert.assertEquals(Float.valueOf("-523.3334"), sphere.parseValueToVolume("-5"));
        fail("nagative value");
    }

    @Test
    public void testParseValue4() throws Exception {
        Assert.assertNotNull(sphere.parseValueToArea("5"));
        Assert.assertEquals(Float.valueOf("314.0"), sphere.parseValueToArea("5"));
    }

    @Test (expected = Exception.class)
    public void testParseValue5() throws Exception {
        Assert.assertNotNull(sphere.parseValueToArea("ghjk"));
    }

    @Test (expected = Exception.class)
    public void testParseValue6() throws Exception {
        Assert.assertNotNull(sphere.parseValueToArea("-1"));
        Assert.assertEquals(Float.valueOf("-314.0"), sphere.parseValueToArea("-5"));
        fail("nagative value");
    }
}