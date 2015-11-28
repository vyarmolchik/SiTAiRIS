package piramid;

//четырехугольная правильная пирамида (основание - квадрат)
public class Pyramid4b {
    
    static class NotPeramidException extends Exception {
    };
    
    private double height;
    private double side;
    
    public Pyramid4b(double height, double side) throws NotPeramidException{
        if (side <= 0 || height <= 0) throw new NotPeramidException();
        this.height = height;
        this.side = side;
    }
    
    public double CountVolume() {
        return side * side * height / 3.;
    }
    
    public double CountBaseSquare() {
        return side * side;
    }
    
    public double CountTriangleSquare() {
        return side / 2. * Math.sqrt(height * height + side * side / 4.);
    }
    
    public double CountSquare() {
        return CountBaseSquare() + CountTriangleSquare() * 4.;
    } 
    
    public static void main(String[] args) throws NotPeramidException{
        Pyramid4b piramid = new Pyramid4b(1., 1.);
        System.out.println("Vol: " + piramid.CountVolume() + " sq: " + piramid.CountSquare());
    }
    
}
