/**
 * Created by Admin on 23.11.2015.
 */
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tetraedr{
    private double a; // Длина ребра тетраэдра
    public void setA(double l){
        a = l;
    }
    public double getA(){
        return a;
    }
    public double calculateHeight() throws Exception{
        if(a < 0){
            throw new Exception("Длина ребра не может быть отрицательной");
        }
        if(a == 0){
            throw new Exception("Длина ребра не может быть равной нулю");
        }
        double per = (double)2/3;
        double tmp = Math.sqrt(per);
        return new BigDecimal((double)a * tmp).setScale(3, RoundingMode.UP).doubleValue();
    }
    public double calculateSquare() throws Exception{
        if(a < 0){
            throw new Exception("Длина ребра не может быть отрицательной");
        }
        if(a == 0){
            throw new Exception("Длина ребра не может быть равной нулю");
        }
        double tmp = Math.sqrt(3) /4;
        return new BigDecimal((double)a * a * tmp).setScale(3, RoundingMode.UP).doubleValue();
    }
    public double calculateVolume() throws Exception{
        if(a < 0){
            throw new Exception("Длина ребра не может быть отрицательной");
        }
        if(a == 0){
            throw new Exception("Длина ребра не может быть равной нулю");
        }
        double per = (double)1/3;
        return new BigDecimal((double)per * this.calculateHeight() * this.calculateSquare()).setScale(3, RoundingMode.UP).doubleValue();
    }
    public static void main(String [] args){
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите сторону тетраэдра");
            double side = in.nextDouble();
            Tetraedr tetraedr = new Tetraedr();
            tetraedr.setA(side);
            System.out.println("Высота тетраэдра: " + tetraedr.calculateHeight() + " Площадь грани тетраэдра: " +
                    tetraedr.calculateSquare() + " Объём тетраэдра: " + tetraedr.calculateVolume());
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
