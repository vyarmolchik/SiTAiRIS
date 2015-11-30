import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Created by Admin on 24.11.2015.
 */
public class TetraedrTest {
    public TetraedrTest(){}
    @Test
    public void testHeightPositive() throws Exception{
        double l = 11;
        Tetraedr obj = new Tetraedr();
        obj.setA(l);
        double per = (double) 2/3;
        double expResult = new BigDecimal((double)l * Math.sqrt(per)).setScale(3, RoundingMode.UP).doubleValue();
        double result = obj.calculateHeight();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testSquarePositive() throws Exception{
        double l = 5;
        Tetraedr obj = new Tetraedr();
        obj.setA(l);
        double tmp = Math.sqrt(3) /4;
        double expResult = new BigDecimal((double)l * l * tmp).setScale(3, RoundingMode.UP).doubleValue();
        double result = obj.calculateSquare();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testVolumePositive() throws Exception{
        double l = 10;
        Tetraedr obj = new Tetraedr();
        obj.setA(l);
        double per = (double)1/3;
        double expResult = new BigDecimal((double)per * obj.calculateHeight() * obj.calculateSquare()).setScale(3, RoundingMode.UP).doubleValue();
        double result = obj.calculateVolume();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testHeightNull() throws Exception{
        double l = 0;
        Tetraedr obj = new Tetraedr();
        obj.setA(l);
        double per = (double) 2/3;
        double expResult = new BigDecimal((double)l * Math.sqrt(per)).setScale(3, RoundingMode.UP).doubleValue();
        double result = obj.calculateHeight();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testSquareNull() throws Exception{
        double l = 0;
        Tetraedr obj = new Tetraedr();
        obj.setA(l);
        double tmp = Math.sqrt(3) /4;
        double expResult = new BigDecimal((double)l * l * tmp).setScale(3, RoundingMode.UP).doubleValue();
        double result = obj.calculateSquare();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testVolumeNull() throws Exception{
        double l = 0;
        Tetraedr obj = new Tetraedr();
        obj.setA(l);
        double per = (double)1/3;
        double expResult = new BigDecimal((double)per * obj.calculateHeight() * obj.calculateSquare()).setScale(3, RoundingMode.UP).doubleValue();
        double result = obj.calculateVolume();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testHeightMinus() throws Exception{
        double l = -5;
        Tetraedr obj = new Tetraedr();
        obj.setA(l);
        double per = (double) 2/3;
        double expResult = new BigDecimal((double)l * Math.sqrt(per)).setScale(3, RoundingMode.UP).doubleValue();
        double result = obj.calculateHeight();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testSquareMinus() throws Exception{
        double l = -1;
        Tetraedr obj = new Tetraedr();
        obj.setA(l);
        double tmp = Math.sqrt(3) /4;
        double expResult = new BigDecimal((double)l * l * tmp).setScale(3, RoundingMode.UP).doubleValue();
        double result = obj.calculateSquare();
        assertEquals(expResult,result,0.01);
    }
    @Test
    public void testVolumeMinus() throws Exception{
        double l = 0;
        Tetraedr obj = new Tetraedr();
        obj.setA(l);
        double per = (double)1/3;
        double expResult = new BigDecimal((double)per * obj.calculateHeight() * obj.calculateSquare()).setScale(3, RoundingMode.UP).doubleValue();
        double result = obj.calculateVolume();
        assertEquals(expResult,result,0.01);
    }
}
