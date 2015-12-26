 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ng
 */
public class QuadraticEquationTest {
      
    public QuadraticEquationTest() {
    }

    /**
     * Test of decision method, of class QuadraticEquation.
     */
    @Test
    public void testDecision() {
        System.out.println("decision");
        int a = 1;
        int b = 2;
        int c = 0;
        QuadraticEquation instance = new QuadraticEquation();
        String expResult = "0.0__-2.0";
        String result = instance.decision(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testDiscriminant() {
        System.out.println("Discriminant");
        int a = 1;
        int b = 2;
        int c = 11;
        QuadraticEquation instance = new QuadraticEquation();
        String expResult = "Дискриминант <0";
        String result = instance.decision(a, b, c);
        assertEquals(expResult, result);
    }
      
    @Test
    public void testDenominator() {
        System.out.println("Denominator");
        int a = 0;
        int b = 2;
        int c = 1;
        QuadraticEquation instance = new QuadraticEquation();
        String expResult = "Деление на 0";
        String result = instance.decision(a, b, c);
        assertEquals(expResult, result);
    }
        
//     @Test
//    public void testTheoremP() {
//        System.out.println("TheoremP");
//        int a = 1;
//        int b = 8;
//        int c = 11;
//        QuadraticEquation instance = new QuadraticEquation();
//        String expResult = "true p";
//        String result = instance.decision(a, b, c);
//        assertEquals(expResult, result);
//    } 
//        @Test
//    public void testTheoremQ() {
//        System.out.println("TheoremQ");
//        int a = 1;
//        int b = 2;
//        int c = 1;
//        QuadraticEquation instance = new QuadraticEquation();
//        String expResult = "true -q";
//        String result = instance.decision(a, b, c);
//        assertEquals(expResult, result);
//    } 
//       @Test
//    public void testTheoremP1() {
//        System.out.println("TheoremP1");
//        int a = 5;
//        int b = 8;
//        int c = 2;
//        QuadraticEquation instance = new QuadraticEquation();
//        String expResult = "true p1";
//        String result = instance.decision(a, b, c);
//        assertEquals(expResult, result);
//    } 
//         @Test
//    public void testTheoremQ1() {
//        System.out.println("TheoremQ1");
//        int a = 5;
//        int b = 8;
//        int c = 0;
//        QuadraticEquation instance = new QuadraticEquation();
//        String expResult = "true -q1";
//        String result = instance.decision(a, b, c);
//        assertEquals(expResult, result);
//    } 
//    /**
//     * Test of main method, of class QuadraticEquation.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        QuadraticEquation.main(args);
//        fail("The test case is a prototype.");
//    }
    
}
