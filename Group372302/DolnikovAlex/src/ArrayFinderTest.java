import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by User-PC on 24.11.2015.
 */

@RunWith(Theories.class)
public class ArrayFinderTest {
    @DataPoint
    public static int[] ARRAY_1 = new int[] {5, 6, 7};
    @DataPoint
    public static int[] ARRAY_2 = new int[] {0, 0, 0};
    @DataPoint
    public static int[] ARRAY_3 = new int[] {-5, 2, 3, 6, 11};
    @DataPoint
    public static int[] ARRAY_4 = new int[] {0, -1, 6, 2};
    @DataPoint
    public static int[] ARRAY_5 = new int[] {-20, -99, -7};
    @DataPoint
    public static int[] ARRAY_6 = new int[] {1};


    private ArrayFinder arrayFinder;

    @Before
    public void initArrayFinder() {
        arrayFinder = new ArrayFinder();
    }

    @Theory
    public void arrayFinderTest(int[] array) {
        arrayFinder.setArray(array);
        double average = arrayFinder.FindAverage();
        double expectedAverage = 0;
        for(int tmp : array) {
            expectedAverage += tmp;
        }
        expectedAverage /= array.length;
        assertThat(average, is(expectedAverage));
    }

    @Theory
    public void findMinTest(int[] array) {
        arrayFinder.setArray(array);
        int min = arrayFinder.FindMin();
        int expectedMin = array[0];
        for(int tmp : array) {
            if(expectedMin > tmp)
                expectedMin = tmp;
        }
        assertThat(min, is(expectedMin));
    }

    @Theory
    public void findMaxTest(int[] array) {
        arrayFinder.setArray(array);
        int max = arrayFinder.FindMax();
        int expectedMax = array[0];
        for(int tmp : array) {
            if(expectedMax < tmp)
                expectedMax = tmp;
        }
        assertThat(max, is(expectedMax));
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointer() throws NullPointerException {
        arrayFinder.setArray(null);
        arrayFinder.FindAverage();
    }
}
