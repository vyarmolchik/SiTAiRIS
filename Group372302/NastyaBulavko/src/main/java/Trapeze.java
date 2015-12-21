
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Trapeze {
    private double a, b; // Длина оснований трапеции
    private double c, d; // Длина боковых сторон трапеции
    private double h; // Высота трапеции

    public void setA(double l){a = l;}
    public double getA(){return a;}

    public void setC(double l){c = l;}
    public double getC(){return c;}

    public void setB(double l){b = l;}
    public double getB(){return b;}

    public void setD(double l){d = l;}
    public double getD(){return d;}

    public void setH(double l){h = l;}
    public double getH(){return h;}

    public BigDecimal calculateSquare() throws Exception{
        if(a < 0 || b < 0 || c < 0 || d < 0 || h < 0){
            throw new Exception("Длина/высота не может быть отрицательной");
        }
        if(a == 0 || b == 0 || c == 0 || d == 0 || h == 0){
            throw new Exception("Длина/высота не может быть равной нулю");
        }
        return new BigDecimal((((double)a + (double)b )/2)*(double)h);
    }
    public BigDecimal calculatePerimeter() throws Exception{
        if(a < 0 || b < 0 || c < 0 || d < 0 || h < 0){
            throw new Exception("Длина/высота не может быть отрицательной");
        }
        if(a == 0 || b == 0 || c == 0 || d == 0 || h == 0){
            throw new Exception("Длина/высота не может быть равной нулю");
        }
        //double per = (double)1/3;
        return new BigDecimal((double)a + (double)b + (double)c + (double)d);
    }
    public static void main(String [] args){
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите 1-е основание трапеции");
            double side = in.nextDouble();
            Trapeze trapeze = new Trapeze();
            trapeze.setA(side);

            System.out.println("Введите 2-е основание трапеции");
            double side1 = in.nextDouble();
            Trapeze trapeze1 = new Trapeze();
            trapeze.setB(side1);

            System.out.println("Введите боковую 1-ю сторону трапеции");
            double side2 = in.nextDouble();
            Trapeze trapeze2 = new Trapeze();
            trapeze.setC(side2);

            System.out.println("Введите 2-ю боковую сторону трапеции");
            double side3 = in.nextDouble();
            Trapeze trapeze3 = new Trapeze();
            trapeze.setD(side3);

            System.out.println("Введите высоту трапеции");
            double side4 = in.nextDouble();
            Trapeze trapeze4 = new Trapeze();
            trapeze.setH(side4);

            System.out.println("Площадь трапеции: " + trapeze.calculateSquare() + " Периметр трапеции: " + trapeze.calculatePerimeter());
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
