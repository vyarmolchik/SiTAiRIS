/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import junit_test.*;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;
import org.junit.*;
import static org.junit.Assume.assumeThat;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 *
 * @author NotePad
 */

@RunWith(Theories.class)
public class CalcTest {
    
    private static Calc test;
    
    @DataPoint 
   public static double[] mas={0, 0, 0};
    @DataPoint 
   public static double[] mas_1={-16,-2, -45, -99, -1000, -1};
    @DataPoint 
   public static double[] mas_2={5, 16, 4, 45, 1};
    @DataPoint 
   public static double[] mas_3={1, -24, 3, 17};
    @DataPoint 
   public static double[] mas_4={};
    
    @BeforeClass
    public static void initScholarshipCalculator(){
	test=new CalcImpl();	
    }
    
    
    //на разные исходные данные
    @Theory
    public void findMaxTest(double[] mas) throws NotSuchMarkException{
        assumeThat(mas.length, not(is(0)));
	double expected=mas[0]; 
        for(double x: mas) {
                if(x > expected) expected = x;
        }
        
	double actual=test.FindMax(mas);
	assertThat(actual, is(expected));
    }

    @Theory
    public void findMinTest(double[] mas) throws NotSuchMarkException{
        assumeThat(mas.length, not(is(0)));
	double expected=mas[0]; 
        for(double x: mas) {
                if(x < expected) expected = x;
        }
        
	double actual=test.FindMin(mas);
	assertThat(actual, is(expected));
    }
    
    @Theory
    public void calcAverageTest(double[] mas) throws NotSuchMarkException{
        assumeThat(mas.length, not(is(0)));
	double expected, sum=0; 
        for(int i=0; i<mas.length; i++) {
            sum+=mas[i];
        }
        expected=sum/mas.length;
        
	double actual=test.CalcAverage(mas);
	assertThat(actual, is(expected));
    }
    
    //на пустой массив
    @Test(expected=NotSuchMarkException.class)
    public void findMaxForEmpty() throws NotSuchMarkException{
        double[] mas={};
        test.FindMax(mas);
    }
    
    @Test(expected=NotSuchMarkException.class)
    public void findMinForEmpty() throws NotSuchMarkException{
        double[] mas={};
        test.FindMin(mas);
    }
    
    @Test(expected=NotSuchMarkException.class)
    public void calcAverForEmpty() throws NotSuchMarkException{
        double[] mas={};
        test.CalcAverage(mas);
    }
}

