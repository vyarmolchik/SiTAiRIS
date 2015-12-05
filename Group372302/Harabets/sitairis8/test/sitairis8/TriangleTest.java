/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitairis8;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
/**
 *
 * @author User
 */

public class TriangleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void testSquare1() throws Exception {
        Triangle triangle2 = new Triangle(4, 6, 8);
        Assert.assertEquals(11, triangle2.square(), 1);
    }

    @Test
    public void testSquare2() throws Exception {
        Triangle triangle2 = new Triangle(4, 6, -8);        
        thrown.expect(TriangleException.class);
        triangle2.square();
    }

    @Test
    public void testPerimeter1() throws Exception {
        Triangle triangle1 = new Triangle(3, 6, 4);
        Assert.assertEquals(13, triangle1.perimeter(), 0);
    }

    @Test
    public void testPerimeter2() throws Exception {
        Triangle triangle1 = new Triangle(3, 6, 10);
        thrown.expect(TriangleException.class);        
        triangle1.perimeter();
    }
}