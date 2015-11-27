import java.security.InvalidParameterException;

/**
 * Created by Я on 27.11.2015.
 */
public class Cylinder {

    public Cylinder() {
    }


    public double square(int l, int r){
        if (l <= 0 || r <= 0)
            throw new InvalidParameterException("Параметры должны быть положительными!");
        return (2 * 3.14 * r * l) + 3.14 * Math.pow(r, 2);
    }

    public double volume(int l, int r){
        if (l <= 0 || r <= 0)
            throw new InvalidParameterException("Параметры должны быть положительными!");
        return 3.14 * l * Math.pow(r, 2);
    }
}
