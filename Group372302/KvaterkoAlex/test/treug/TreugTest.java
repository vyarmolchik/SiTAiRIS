/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treug;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreugTest {

    public TreugTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of perim method, of class Treug.
     *
     * @throws treug.TreugException
     */
    @Test
    public void test1() throws TreugException {
        System.out.println("test1");
        Treug instance = new Treug(3, 4, 5);
        int expResult = 12;
        double expResult1 = 6.0;
        int result = instance.perim();
        double result1 = instance.plosch();
        assertTrue(expResult == result && result1 == expResult1);
    }

    @Test(expected = java.lang.AssertionError.class)
    public void test2() throws TreugException {
        System.out.println("test2");
        Treug instance = new Treug(-2, 3, 4);
        int result = instance.perim();
        assertNull(result);
    }
 
    @Test(expected = TreugException.class)
    public void testMain() throws TreugException {
        System.out.println("test3");
        Treug instance = new Treug(0, 0, 0);
        int result = instance.perim();
        assertNull(result);
    }
    
    @Test(expected = java.lang.AssertionError.class)
    public void test4() throws TreugException {
        System.out.println("test4");
        Treug instance = new Treug(11, 3, 4);
        int result = instance.perim();
        assertNull(result);
    }
}
