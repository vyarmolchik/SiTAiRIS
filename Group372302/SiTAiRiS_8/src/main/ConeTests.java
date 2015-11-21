package main;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Александр on 20.11.2015.
 */
public class ConeTests {
    @Test
    public void positiveTest1() throws MyException{
        Cone cone = new Cone(2, 3, 4);
        float v = (float)((Math.PI * pow(2, 2) * 4)/3);
        assertEquals(v, cone.getVolume(), 0.01);
    }
    @Test
    public void positiveTest2() throws MyException{
        Cone cone = new Cone(2, 3, 4);
        float a = (float)((Math.PI * pow(2, 2)));
        assertEquals(a, cone.getArea(), 0.01);
    }
    @Test
    public void positiveTest3() throws MyException{
        Cone cone = new Cone(2, 3, 4);
        float la = (float)(Math.PI*2*3);
        assertEquals(la, cone.getLateralArea(), 0.01);
    }
    @Test
    public void positiveTest4() throws MyException{
        Cone cone = new Cone(400000, 1000000, 500000);
        float v = (float)((Math.PI * pow(400000, 2) * 500000)/3);
        assertEquals(v, cone.getVolume(), 0.01);
    }
    @Test
    public void positiveTest5() throws MyException{
        Cone cone = new Cone(400000, 1000000, 500000);
        float a = (float)((Math.PI * pow(400000, 2)));
        assertEquals(a, cone.getArea(), 0.01);
    }
    @Test
    public void positiveTest6() throws MyException{
        Cone cone = new Cone(400000, 1000000, 500000);
        float la = (float)(Math.PI*400000*1000000);
        assertEquals(la, cone.getLateralArea(), 0.01);
    }
    @Test
    public void positiveTest7() throws MyException{
        Cone cone = new Cone(1, 1, 1);
        float v = (float)((Math.PI * pow(1, 2) * 1)/3);
        assertEquals(v, cone.getVolume(), 0.01);
    }
    @Test
    public void positiveTest8() throws MyException{
        Cone cone = new Cone(1, 1, 1);
        float a = (float)((Math.PI * pow(1, 2)));
        assertEquals(a, cone.getArea(), 0.01);
    }
    @Test
    public void positiveTest9() throws MyException{
        Cone cone = new Cone(1, 1, 1);
        float la = (float)(Math.PI*1*1);
        assertEquals(la, cone.getLateralArea(), 0.01);
    }
    @Test (expected = MyException.class)
    public void negativeTest1() throws MyException {
        Cone cone = new Cone(2, 3, 0);
        float v = (float) ((Math.PI * pow(2, 2) * 0) / 3);
        assertEquals(v, cone.getVolume(), 0.01);
    }
    @Test (expected = MyException.class)
    public void negativeTest2() throws MyException {
        Cone cone = new Cone(0, 3, 4);
        float a = (float)((Math.PI * pow(0, 2)));
        assertEquals(a, cone.getArea(), 0.01);
    }
    @Test (expected = MyException.class)
    public void negativeTest3() throws MyException {
        Cone cone = new Cone(2, 0, 4);
        float la = (float)(Math.PI*2*0);
        assertEquals(la, cone.getLateralArea(), 0.01);
    }
    @Test (expected = MyException.class)
    public void negativeTest4() throws MyException {
        Cone cone = new Cone(2, 3, -1);
        float v = (float) ((Math.PI * pow(2, 2) * (-1)) / 3);
        assertEquals(v, cone.getVolume(), 0.01);
    }
    @Test (expected = MyException.class)
    public void negativeTest5() throws MyException {
        Cone cone = new Cone(-1, 3, 4);
        float a = (float)((Math.PI * pow((-1), 2)));
        assertEquals(a, cone.getArea(), 0.01);
    }
    @Test (expected = MyException.class)
    public void negativeTest6() throws MyException {
        Cone cone = new Cone(2, -1, 4);
        float la = (float)(Math.PI*2*(-1));
        assertEquals(la, cone.getLateralArea(), 0.01);
    }
}
