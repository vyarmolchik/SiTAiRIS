package by.dikun_mv;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Random;

public class CylinderTest {
    private Cylinder cylinder = null;
    private Random random = null;

    private double R = 0;
    private double H = 0;

    @Before
    public void initTest() {
        random = new Random(new Date().getTime());
        R = random.nextDouble() * 10;
        H = random.nextDouble() * 10;
    }

    @After
    public void cleanTest() {
        cylinder = null;
        random = null;
    }

    @Test
    public void calculateVolume_PositiveValueSetter() {
        cylinder = new Cylinder();
        cylinder.setR(R);
        cylinder.setH(H);

        Assert.assertEquals("Test positive values: calculateVolume fail (setter)",
                Math.PI * Math.pow(R, 2D) * H, cylinder.calculateVolume(), 0);
    }

    @Test
    public void calculateSideArea_PositiveValueSetter() {
        cylinder = new Cylinder();
        cylinder.setR(R);
        cylinder.setH(H);

        Assert.assertEquals("Test positive values: testCalculateSideArea fail (setter)",
                2D * Math.PI * R * H, cylinder.calculateSideArea(), 0);
    }

    @Test
    public void calculateFullArea_PositiveValueSetter() {
        cylinder = new Cylinder();
        cylinder.setR(R);
        cylinder.setH(H);

        Assert.assertEquals("Test positive values: testCalculateFullArea fail (setter)",
                (2D * Math.PI * R * H) + (2D * Math.PI * Math.pow(R, 2D)), cylinder.calculateFullArea(), 0);
    }

    @Test
    public void calculateVolume_NegativeValueSetter() {
        cylinder = new Cylinder();
        cylinder.setR(-R);
        cylinder.setH(-H);

        Assert.assertTrue("Test negative values: calculateVolume fail (setter)",
                cylinder.calculateVolume() == 0);
    }

    @Test
    public void calculateSideArea_NegativeValueSetter() {
        cylinder = new Cylinder();
        cylinder.setR(-R);
        cylinder.setH(-H);

        Assert.assertTrue("Test negative values: calculateSideArea fail (setter)",
                cylinder.calculateSideArea() == 0);
    }

    @Test
    public void calculateFullArea_NegativeValueSetter() {
        cylinder = new Cylinder();
        cylinder.setR(-R);
        cylinder.setH(-H);

        Assert.assertTrue("Test negative values: calculateFullArea fail (setter)",
                cylinder.calculateFullArea() == 0);
    }

    @Test
    public void calculateVolume_PositiveValueConstructor() {
        cylinder = new Cylinder(R, H);

        Assert.assertEquals("Test positive values: calculateVolume fail (constructor)",
                Math.PI * Math.pow(R, 2D) * H, cylinder.calculateVolume(), 0);
    }

    @Test
    public void calculateSideArea_PositiveValueConstructor() {
        cylinder = new Cylinder(R, H);

        Assert.assertEquals("Test positive values: testCalculateSideArea fail (constructor)",
                2D * Math.PI * R * H, cylinder.calculateSideArea(), 0);
    }

    @Test
    public void calculateFullArea_PositiveValueConstructor() {
        cylinder = new Cylinder(R, H);

        Assert.assertEquals("Test positive values: testCalculateFullArea fail (constructor)",
                (2D * Math.PI * R * H) + (2D * Math.PI * Math.pow(R, 2D)), cylinder.calculateFullArea(), 0);
    }

    @Test
    public void calculateVolume_NegativeValueConstructor() {
        cylinder = new Cylinder(-R, -H);

        Assert.assertTrue("Test negative values: calculateVolume fail (constructor)",
                cylinder.calculateVolume() == 0);
    }

    @Test
    public void calculateSideArea_NegativeValueConstructor() {
        cylinder = new Cylinder(-R, -H);

        Assert.assertTrue("Test negative values: calculateSideArea fail (constructor)",
                cylinder.calculateSideArea() == 0);
    }

    @Test
    public void calculateFullArea_NegativeValueConstructor() {
        cylinder = new Cylinder(-R, -H);

        Assert.assertTrue("Test negative values: calculateFullArea fail (constructor)",
                cylinder.calculateFullArea() == 0);
    }
}
