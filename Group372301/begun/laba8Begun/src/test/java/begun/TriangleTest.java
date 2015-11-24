
package begun;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author tbegu_000
 */
public class TriangleTest {
    private static Triangle triangle;        
    @Before
    public void setUp() {
        triangle = new Triangle();
    }
    
    @After
    public void tearDown() {
        triangle = null;
    }

    /**
     * Test of main method, of class Triangle.
     */
    
    //Проверка на правльность посчета площади и периметра
    @org.junit.Test
    public void testMain() throws IOException, MyException{
        int a = 5, b = 6, c = 7;
        int perim = a+b+c;
        //triangle.input();
        assertEquals(perim,triangle.perimetr(a,b,c),0.01) ;
        double p = perim/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        assertEquals(area,triangle.area(a,b,c),0.01) ;
    }
    
   //Тест, который не должен успешно выполниться. Т.к. в тесте а=9, а в методе класса а=3
    @Ignore
    @org.junit.Test
    public void testMainFalse() throws IOException, MyException{
        int a = 3, b = 6, c = 7;
        int perim = 9+b+c;
        //triangle.input();
        assertEquals(perim,triangle.perimetr(a,b,c),0.01) ;
        double p = perim/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        assertEquals(area,triangle.area(a,b,c),0.01) ;
    }
    
    @org.junit.Test
    //Негативный тест, который проверяет ввод пользователя отрацательного числа
    public void testMainNegativ() throws IOException, MyException{
        try{
            String a="5", b="-6", c = "5";
            int a2 = triangle.inputSide(a);
            triangle.error(a2);
            int b2 = triangle.inputSide(b);
            triangle.error(b2);
            int c2 = triangle.inputSide(c);
            triangle.error(c2);
            int perim = a2+b2+c2;
            assertEquals(perim,triangle.perimetr(a2,b2,c2),0.01) ;
            double p = perim/2;
            double area = Math.sqrt(p*(p-a2)*(p-b2)*(p-c2));
            assertEquals(area,triangle.area(a2,b2,c2),0.01) ;
        }
        catch (NumberFormatException e) {
            assertEquals(e.getMessage(), "Ошибка ввода!\nТребуется ввести числовое значение!", 0.01);
            //assertThat(e.getMessage(), );
        }
        catch (MyException e) {
            assertEquals(e.getMessage(), "Ошибка ввода!\nСторона должна быть больше нуля!", 0.01);
            assertEquals(e.getMessage(), "Ошибка ввода!\nСторона не может быть равна нулю!", 0.01);
            //assertThat(e.getMessage(), );
        }
    }
    
    //Негативный тест, который проверяет ввод пользователя стороны равной 0
    @org.junit.Test
    public void testMainNegativ2() throws IOException, MyException{
        try{
            String a="0", b="5", c = "7";
            int a2 = triangle.inputSide(a);
            triangle.error(a2);
            int b2 = triangle.inputSide(b);
            triangle.error(b2);
            int c2 = triangle.inputSide(c);
            triangle.error(c2);
            int perim = a2+b2+c2;
            org.junit.Assert.assertEquals(perim,triangle.perimetr(a2,b2,c2),0.01) ;
            double p = perim/2;
            double area = Math.sqrt(p*(p-a2)*(p-b2)*(p-c2));
            org.junit.Assert.assertEquals(area,triangle.area(a2,b2,c2),0.01) ;
        }
        catch (NumberFormatException e) {
            assertEquals(e.getMessage(), "Ошибка ввода!\nТребуется ввести числовое значение!", 0.01);
            //assertThat(e.getMessage(), );
        }
        catch (MyException e) {
            assertEquals(e.getMessage(), "Ошибка ввода!\nСторона должна быть больше нуля!", 0.01);
            assertEquals(e.getMessage(), "Ошибка ввода!\nСторона не может быть равна нулю!", 0.01);
            //assertThat(e.getMessage(), );
        }
    }
    
    //Негативный тест, который проверяет ввод пользователя некорректного значения
    @org.junit.Test
    public void testMainNegativ3() throws IOException, MyException{
        try{
            String a="5", b="6", c = "овстотал";
            int a2 = triangle.inputSide(a);
            triangle.error(a2);
            int b2 = triangle.inputSide(b);
            triangle.error(b2);
            int c2 = triangle.inputSide(c);
            triangle.error(c2);
            int perim = a2+b2+c2;
            assertEquals(perim,triangle.perimetr(a2,b2,c2),0.01) ;
            double p = perim/2;
            double area = Math.sqrt(p*(p-a2)*(p-b2)*(p-c2));
            assertEquals(area,triangle.area(a2,b2,c2),0.01) ;
        }
        catch (NumberFormatException e) {
            assertEquals(e.getMessage(), "Ошибка ввода!\nТребуется ввести числовое значение!", 0.01);
            //assertThat(e.getMessage(), );
        }
        catch (MyException e) {
            assertEquals(e.getMessage(), "Ошибка ввода!\nСторона должна быть больше нуля!", 0.01);
            assertEquals(e.getMessage(), "Ошибка ввода!\nСторона не может быть равна нулю!", 0.01);
            //assertThat(e.getMessage(), );
        }
    }
    
}
