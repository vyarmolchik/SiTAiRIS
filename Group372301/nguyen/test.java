/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab8sitairis.Lab8sitairis;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author autorun.exe
 */
public class test {
    
    private Lab8sitairis triangle;
    private int a;
    private int b;
    private int c;
    @BeforeClass
    public static void start(){
         System.out.println("start");
    }
    @AfterClass
    public static void endprogram(){
         System.out.println("end");
    }
    @Before
    public void setUp() {
       triangle  = new Lab8sitairis();
   //    System.out.println("Constructor");
    }
    @After  
    public void tearDown() throws Exception {
       triangle = null;
//       System.out.println("Destructor");
    }
    @Test
    public void testContructor(){
        assertNotNull(triangle);
        System.out.println("test Constructor");
    }
    
    @Test
    public void testGetA(){
        int aa = 3;
        triangle.setA(aa);   
        assertEquals(aa,triangle.getA());    
        System.out.println("getA");
    }
         @Test
         public void testGetB(){
        int bb = 3;
        triangle.setB(bb);   
        assertEquals(bb,triangle.getB());    
        System.out.println("getB");
     }
         @Test
        public void testGetC(){
        int c = 3;
        triangle.setC(c);   
        assertEquals(c,triangle.getC());    
        System.out.println("getC");
     }
    @Test
    public void testPerimeter(){
       System.out.println("perimetr");
       int a = 3;
       int b = 4;
       int c = 5;
       int perimeter = a + b +c;
       int p = 0;
       triangle.setABC(a, b, c);
       p = triangle.Perimeter();
       assertEquals(perimeter,p);   
       
    }
}
