package by.bsuir.rhombus;

/**
 * Created by BlizniovaAn on 19.11.2015.
 */

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class RhombusTest {
    private static Rhombus rhombus;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		rhombus = new Rhombus();
	}

	@Test(expected = RhombusException.class)
	 public void testSquare() throws RhombusException{
		 assertEquals(4,rhombus.square(2, 2));
    }
	@Test(expected = RhombusException.class)
	 public void testPer() throws RhombusException{
       assertEquals(4,rhombus.perimeter(0));
   }
	@Test
	public void testNull(){
		assertNotNull("object is null....",rhombus);
	}

}
