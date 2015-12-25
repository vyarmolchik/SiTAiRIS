import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrapeziumTest {

    private static Trapezium cr;

    @BeforeClass
    public static void Trapezium() {

        cr = new Trapezium();
    }
    @Test ()
    public void PerimeterTestTrue(){
        assertTrue(cr.perimeter(1, 3, 2, 2) == 8);
        System.out.println("Верное");
    }

    @Test ()
    public void PerimeterTestTrue2(){
        assertTrue(cr.perimeter(3, 1, 2, 2) == 8);
        System.out.println("Верное");
    }

    @Test (expected = InvalidParameterException.class)//для проверки выбрасывания исключения из метода вл время выполнения //timeout
    public void PerimeterTestFalse1a(){
        assertFalse(cr.perimeter(12,1,1,1) == 8);
        System.out.println("1 сторона больше суммы трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse1b(){
        assertFalse(cr.perimeter(1,12,1,1) == 8);
        System.out.println("2 сторона больше суммы трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse1c(){
        assertFalse(cr.perimeter(1,1,12,1) == 8);
        System.out.println("3 сторона больше суммы трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse1d(){
        assertFalse(cr.perimeter(1,1,1,12) == 8);
        System.out.println("4 сторона больше суммы трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse2(){
        assertFalse(cr.perimeter(0,3,2,2) == 8);
        System.out.println("Первая сторона = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse3(){
        assertFalse(cr.perimeter(1,0,2,2) == 8);
        System.out.println("Вторая сторона = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse4(){
        assertFalse(cr.perimeter(1,3,0,2) == 8);
        System.out.println("Третья сторона = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse5(){
        assertFalse(cr.perimeter(1,3,2,0) == 8);
        System.out.println("Четвертая сторона = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse6(){
        assertFalse(cr.perimeter(-1,3,2,2) == 8);
        System.out.println("Первая сторона меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse7(){
        assertFalse(cr.perimeter(1,-1,2,2) == 8);
        System.out.println("Вторая сторона меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse8(){
        assertFalse(cr.perimeter(1,3,-1,2) == 8);
        System.out.println("Третья сторона меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse9(){
        assertFalse(cr.perimeter(1,3,2,-1) == 8);
        System.out.println("Четвертая сторона меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse10(){
        assertFalse(cr.perimeter(-1,-1,2,0) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse11(){
        assertFalse(cr.perimeter(-1,3,-1,2) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse12(){
        assertFalse(cr.perimeter(-1,5,2,-1) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse13(){
        assertFalse(cr.perimeter(1,-1,-1,2) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
     public void PerimeterTestFalse14(){
        assertFalse(cr.perimeter(1,-1,2,-1) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse15(){
        assertFalse(cr.perimeter(1,1,-2,-1) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse16(){
        assertFalse(cr.perimeter(-1,-5,-2,1) == 8);
        System.out.println("3 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse17(){
        assertFalse(cr.perimeter(-1,1,-1,-2) == 8);
        System.out.println("3 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse18(){
        assertFalse(cr.perimeter(-1,-1,2,-1) == 8);
        System.out.println("3 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse19(){
        assertFalse(cr.perimeter(1,-1,-2,-1) == 8);
        System.out.println("3 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse20(){
        assertFalse(cr.perimeter(0,0,2,0) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse21(){
        assertFalse(cr.perimeter(0,3,0,2) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse22(){
        assertFalse(cr.perimeter(0,5,2,0) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse23(){
        assertFalse(cr.perimeter(1,0,0,2) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse24(){
        assertFalse(cr.perimeter(1,0,2,0) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse25(){
        assertFalse(cr.perimeter(1,1,0,0) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse26(){
        assertFalse(cr.perimeter(0,0,0,1) == 8);
        System.out.println("3 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse27(){
        assertFalse(cr.perimeter(0,1,0,0) == 8);
        System.out.println("3 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse28(){
        assertFalse(cr.perimeter(0,0,1,0) == 8);
        System.out.println("3 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse29(){
        assertFalse(cr.perimeter(1,0,0,0) == 8);
        System.out.println("3 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse30(){
        assertFalse(cr.perimeter(-1,-1,-1,-1) == 8);
        System.out.println("4 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse31(){
        assertFalse(cr.perimeter(0,0,0,0) == 8);
        System.out.println("4 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse32a(){
        assertFalse(cr.perimeter(3,1,1,1) == 8);
        System.out.println("Сторона равна сумме трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse32b(){
        assertFalse(cr.perimeter(1,3,1,1) == 8);
        System.out.println("Сторона равна сумме трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse32c(){
        assertFalse(cr.perimeter(1,1,3,1) == 8);
        System.out.println("Сторона равна сумме трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void PerimeterTestFalse32d(){
        assertFalse(cr.perimeter(1,1,1,3) == 8);
        System.out.println("Сторона равна сумме трех других сторон");
    }

    @Test ()
    public void SquareTestTrue(){
        assertTrue(cr.square(1, 3, 2, 2) == 3.4641016151377544);
        System.out.println("Верное");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse1a(){
        assertFalse(cr.square(12,1,1,1) == 8);
        System.out.println("Сторона больше суммы трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse1b(){
        assertFalse(cr.square(1,12,1,1) == 8);
        System.out.println("Сторона больше суммы трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse1c(){
        assertFalse(cr.square(1,1,12,1) == 8);
        System.out.println("Сторона больше суммы трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse1d(){
        assertFalse(cr.square(1,1,1,12) == 8);
        System.out.println("Сторона больше суммы трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse2(){
        assertFalse(cr.square(0,3,2,2) == 8);
        System.out.println("Первая сторона = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse3(){
        assertFalse(cr.square(1,0,2,2) == 8);
        System.out.println("Вторая сторона = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse4(){
        assertFalse(cr.square(1,3,0,2) == 8);
        System.out.println("Третья сторона = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse5(){
        assertFalse(cr.square(1,3,2,0) == 8);
        System.out.println("Четвертая сторона = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse6(){
        assertFalse(cr.square(-1,3,2,2) == 8);
        System.out.println("Первая сторона меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse7(){
        assertFalse(cr.square(1,-1,2,2) == 8);
        System.out.println("Вторая сторона меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse8(){
        assertFalse(cr.square(1,3,-1,2) == 8);
        System.out.println("Третья сторона меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse9(){
        assertFalse(cr.square(1,3,2,-1) == 8);
        System.out.println("Четвертая сторона меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse10(){
        assertFalse(cr.square(-1,-1,2,0) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse11(){
        assertFalse(cr.square(-1,3,-1,2) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse12(){
        assertFalse(cr.square(-1,5,2,-1) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse13(){
        assertFalse(cr.square(1,-1,-1,2) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse14(){
        assertFalse(cr.square(1,-1,2,-1) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse15(){
        assertFalse(cr.square(1,1,-2,-1) == 8);
        System.out.println("2 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse16(){
        assertFalse(cr.square(-1,-5,-2,1) == 8);
        System.out.println("3 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse17(){
        assertFalse(cr.square(-1,1,-1,-2) == 8);
        System.out.println("3 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse18(){
        assertFalse(cr.square(-1,-1,2,-1) == 8);
        System.out.println("3 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse19(){
        assertFalse(cr.square(1,-1,-2,-1) == 8);
        System.out.println("3 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse20(){
        assertFalse(cr.square(0,0,2,0) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse21(){
        assertFalse(cr.square(0,3,0,2) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse22(){
        assertFalse(cr.square(0,5,2,0) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse23(){
        assertFalse(cr.square(1,0,0,2) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse24(){
        assertFalse(cr.square(1,0,2,0) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse25(){
        assertFalse(cr.square(1,1,0,0) == 8);
        System.out.println("2 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse26(){
        assertFalse(cr.square(0,0,0,1) == 8);
        System.out.println("3 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse27(){
        assertFalse(cr.square(0,1,0,0) == 8);
        System.out.println("3 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse28(){
        assertFalse(cr.square(0,0,1,0) == 8);
        System.out.println("3 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse29(){
        assertFalse(cr.square(1,0,0,0) == 8);
        System.out.println("3 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse30(){
        assertFalse(cr.square(-1,-1,-1,-1) == 8);
        System.out.println("4 стороны меньше 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse31(){
        assertFalse(cr.square(0,0,0,0) == 8);
        System.out.println("4 стороны = 0");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse32a(){
        assertFalse(cr.square(3,1,1,1) == 8);
        System.out.println("Сторона равна сумме трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse32b(){
        assertFalse(cr.square(1,3,1,1) == 8);
        System.out.println("Сторона равна сумме трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse32c(){
        assertFalse(cr.square(1,1,3,1) == 8);
        System.out.println("Сторона равна сумме трех других сторон");
    }

    @Test (expected = InvalidParameterException.class)
    public void SquareTestFalse32d(){
        assertFalse(cr.square(1,1,1,3) == 8);
        System.out.println("Сторона равна сумме трех других сторон");
    }



}
