package conusKod;

import java.security.InvalidParameterException;

public class Conus {

    private int radius; 
    private int height;
    private int length;

    public Conus(int length, int radius) {
        this.height = length;
        this.radius = radius;
        this.length = length;
    }
     
    public Conus() {
        this.height = 0;
        this.radius = 0;
        this.length = 0;
    }

    public double squareSide(int length, int radius) {
        return 3.14 * radius * length;
    }

    public double volume(int height, int radius) {
        return 3.14 * height * radius * radius / 3;
    }
    
    public double squareSideException(int length, int radius) {
        if (length == 0) 
            throw new InvalidParameterException("Образующая не может равняться нулю!"); 
        if(radius == 0)
            throw new InvalidParameterException("Радиус не может равняться нулю!");
        if (length < 0) 
            throw new InvalidParameterException("Образующая не может быть отрицательной!"); 
        if(radius < 0)
            throw new InvalidParameterException("Радиус не может быть отрицательным!");
       
        return 3.14 * radius * length;
    }
    
    public double volumeException(int height, int radius){
        if (height == 0)
            throw new InvalidParameterException("Высота не может равняться нулю!"); 
        if(radius == 0)
            throw new InvalidParameterException("Радиус не может равняться нулю!");
        if (height < 0) 
            throw new InvalidParameterException("Высота не может быть отрицательной!"); 
        if(radius < 0)
            throw new InvalidParameterException("Радиус не может быть отрицательным!");
        return 3.14 * height * radius * radius / 3;
    }
}