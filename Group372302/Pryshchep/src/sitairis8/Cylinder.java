package sitairis8;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Cylinder {

    private double volume;
    private double surfaceArea;

    public static final double PI = 3.14;

    double CalculateVolume(double r, double h) {
        if (r <= 0 || h <= 0) {
            throw new InvalidParameterException("Радиус и высота должны быть положительными!");
        }
        volume = PI * r * r * h;
        return volume;
    }

    double CalculateSurfaceArea(double r, double h) {
        if (r <= 0 || h <= 0) {
            throw new InvalidParameterException("Радиус и высота должны быть положительными!");
        }
        surfaceArea = 2 * PI * r * (h + r);
        return surfaceArea;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double r = 0;
        double h = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус(см) и высоту(см) цилиндра:");
        r = in.nextDouble();
        h = in.nextDouble();
        Cylinder cylinder = new Cylinder();
        System.out.println(r);
        System.out.println("Объём цилиндра: " + cylinder.CalculateVolume(r, h) + " см^3");
        System.out.println("Площадь поверхности цилиндра: " + cylinder.CalculateSurfaceArea(r, h) + " см^2");
    }
}
