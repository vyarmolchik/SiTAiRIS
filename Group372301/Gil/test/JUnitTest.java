/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.security.InvalidParameterException;
import junit.Romb;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Kleopatra
 */
public class JUnitTest {
    
    private static Romb R;

    @BeforeClass
    public static void Romb() {
        R = new Romb();
    }

    @Test ()
    public void PerimeterTestTrue(){
        assertTrue(R.Perimetr(3) == 12);
        System.out.println("Верное");
    }
    
    @Test (expected = InvalidParameterException.class)
    public void PerimeterTest1(){
        assertFalse(R.Perimetr(-5) == -20);
        System.out.println("Длина стороны < 0");
    }
    
     @Test ()
    public void SquareTestTrue1(){
        assertTrue(R.Square_h_a(3, 5) == 15);
        System.out.println("Верное");
    }
    
     @Test ()
    public void SquareTestTrue2(){
        assertTrue(R.Square_a_alpha(3,90) == 9);
        System.out.println("Верное");
    }
    
     @Test ()
    public void SquareTestTrue3(){
        assertTrue(R.Square_d_d(12,3) == 18);
        System.out.println("Верное");
    }
    
    @Test ()
    public void SquareTestTrue4(){
        assertTrue(R.Square_r_a(12,3) == 72);
        System.out.println("Верное");
    }
    
    @Test ()
    public void SquareTestTrue5(){
        assertTrue(R.Square_r_alpha(12,30) == 1152);
        System.out.println("Верное");
    }
    
    
    @Test (expected = InvalidParameterException.class)
    public void SquareTest1(){
        assertFalse(R.Square_a_alpha(-12,30) == 1152);
        System.out.println("Длина стороны < 0");
    }
    
    @Test (expected = InvalidParameterException.class)
    public void SquareTest2(){
        assertFalse(R.Square_a_alpha(12,130) == 1152);
        System.out.println("Угол > 90");
    }
    
     @Test (expected = InvalidParameterException.class)
    public void SquareTest3(){
        assertFalse(R.Square_a_alpha(-12,130) == 1152);
        System.out.println("Угол > 90 и длина стороны < 0");
    }
    
     @Test (expected = InvalidParameterException.class)
    public void SquareTest4(){
        assertFalse(R.Square_d_d(-12,130) == 1152);
        System.out.println("Длина диагонали1 < 0");
    }
    
     @Test (expected = InvalidParameterException.class)
    public void SquareTest5(){
        assertFalse(R.Square_d_d(12,-13) == 1152);
        System.out.println("Длина диагонали2 < 0");
    }
    
     @Test (expected = InvalidParameterException.class)
    public void SquareTest6(){
        assertFalse(R.Square_d_d(-12,-13) == 1152);
        System.out.println("Длина диагоналей < 0");
    }
    
    @Test (expected = InvalidParameterException.class)
    public void SquareTest7(){
        assertFalse(R.Square_h_a(12,-13) == 1152);
        System.out.println("Длина стороны < 0");
    }
    
    @Test (expected = InvalidParameterException.class)
    public void SquareTest8(){
        assertFalse(R.Square_h_a(-12,13) == 1152);
        System.out.println("Длина высоты < 0");
    }
    
     @Test (expected = InvalidParameterException.class)
    public void SquareTest9(){
        assertFalse(R.Square_h_a(-12,-13) == 1152);
        System.out.println("Длина высоты < 0 и длина стороны < 0");
    }
    
    @Test (expected = InvalidParameterException.class)
    public void SquareTest10(){
        assertFalse(R.Square_r_a(12,-13) == 1152);
        System.out.println("Длина стороны < 0");
 
    }
    
    @Test (expected = InvalidParameterException.class)
    public void SquareTest11(){
        assertFalse(R.Square_r_a(-12,13) == 1152);
        System.out.println("Радиус < 0");
 
    }
    @Test (expected = InvalidParameterException.class)
    public void SquareTest12(){
        assertFalse(R.Square_r_a(-12,-13) == 1152);
        System.out.println("Длина стороны < 0 и радиус < 0");
    }
    @Test (expected = InvalidParameterException.class)
    public void SquareTest13(){
        assertFalse(R.Square_r_alpha(-12,90) == 1152);
        System.out.println("Радиус < 0");
    }
     @Test (expected = InvalidParameterException.class)
    public void SquareTest14(){
        assertFalse(R.Square_r_alpha(12,190) == 1152);
        System.out.println("Угол > 90");
    }
      @Test (expected = InvalidParameterException.class)
    public void SquareTest15(){
        assertFalse(R.Square_r_alpha(12,-20) == 1152);
        System.out.println("Угол < 0");
    }
    
      @Test (expected = InvalidParameterException.class)
    public void SquareTest16(){
        assertFalse(R.Square_r_alpha(-12,-20) == 1152);
        System.out.println("Радиус < 0 и угол < 0");
    }
    
     @Test (expected = InvalidParameterException.class)
    public void SquareTest17(){
        assertFalse(R.Square_r_alpha(-12,120) == 1152);
        System.out.println("Радиус < 0 и угол > 90");
    }
    
    
}
