/**
 * Created by tresh on 04.12.2015.
 */
import java.math.*;

public class Cone {
    double length;
    double radius;
    double pi = 3.14;
    double temp = 0;

    public Cone(double l, double r) {
        this.length = l;
        this.radius = r;
    }

    public double square()
    {
        temp = pi*length*radius;
        System.out.println(temp);
       return temp;
    }

    public double volume() {
        temp = pi * radius * radius * Math.sqrt((Math.pow(length,2) - Math.pow(radius,2)));
        System.out.println(temp);
        return temp;
    }
}
