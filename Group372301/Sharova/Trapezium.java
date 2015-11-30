import java.security.InvalidParameterException;

public class Trapezium {

    public Trapezium() {
    }

    public double square(int a, int b, int c, int d){
        Double res = ((a+b)/2)*(Math.sqrt(Math.pow(c, 2) - (Math.pow((b - a), 2) + Math.pow(c, 2) - Math.pow(d, 2)) / (2 * (b - a))));

        if (a <= 0 || b <= 0 || c<=0 || d<=0  || (a+b+c) <=d || (a+c+d) <=b || (a+b+d) <=c || (b+c+d) <=a)
            throw new InvalidParameterException("Неудвлетворительные параметры!");

        return res;
    }

    public double perimeter(int a, int b, int c, int d){
        int res = a+b+c+d;

        if (a <= 0 || b <= 0 || c<=0 || d<=0  || (a+b+c) <=d || (a+c+d) <=b || (a+b+d) <=c || (b+c+d) <=a)
            throw new InvalidParameterException("Неудвлетворительные параметры!");
        return res;
    }

}
