package tests;

import org.junit.Before;
import org.junit.Test;
import triangle.Triangle;
import triangle.UnsupportedValue;

/**
 * Created by Uladzislau on 29.12.2015.
 */
public class TriangleTests {
    private Triangle triangle;

    @Before
    public void init() {
        triangle = new Triangle();
    }

    @Test
    public void correctSquareCalculation() throws UnsupportedValue {
        Double height = 4.0;
        Double base = 2.0;
        Double actual = 4.0;
        org.junit.Assert.assertEquals("Площадь должна вычисляться корректно", triangle.square(height, base), actual);
    }

    @Test
    public void correctPerimeterCalculation() throws UnsupportedValue {
        Double a = 4.0;
        Double b = 2.0;
        Double c = 2.0;
        Double actual = 8.0;
        org.junit.Assert.assertEquals("Периметр должен вычисляться корректно", triangle.perimeter(a, b, c), actual);
    }

    @Test(expected=UnsupportedValue.class)
    public void correctSquareException() throws UnsupportedValue {
        Double height = -4.0;
        Double base = 2.0;
        Double actual = 1.0;
        org.junit.Assert.assertEquals("Вычисление площади не может поддерживать отрицтельных значений", triangle.square(height, base), actual);
    }

    @Test(expected=UnsupportedValue.class)
    public void correctPerimeterException() throws UnsupportedValue {
        Double a = 4.0;
        Double b = 2.0;
        Double c = -2.0;
        Double actual = 2.0;
        org.junit.Assert.assertEquals("Вычисление периметра не может поддерживать отрицтельных значений", triangle.perimeter(a, b, c), actual);
    }
}
