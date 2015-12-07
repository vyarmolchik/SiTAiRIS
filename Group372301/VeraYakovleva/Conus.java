package junit;

public class Conus {

    private int radius; 
    private int height;

    public Conus(int length, int radius) {
        this.height = length;
        this.radius = radius;
    }
     
    public Conus() {
        this.height = 0;
        this.radius = 0;
    }

    public double findLength(int height, int radius) {
        return Math.sqrt(height * height + radius * radius);
    }
    
    public double findHeight(int length, int radius) {
        return Math.sqrt(length * length - radius * radius);
    }
    
    public double findRadius(int length, int height) {
        return Math.sqrt(length * length - height * height);
    }

    public double squareSide(int length, int radius) {
        
        if (height < 0) {
            height *= (-1);
        }
        
        if (radius < 0) {
            radius *= (-1);
        }
        return 3.14 * radius * length;
    }

    public double squareBase(int radius) {
        return 3.14 * radius * radius;
    }

    public double squareGeneral(int height, int radius) {
        return squareBase(radius) + squareSide(height,radius);
    }
    
    public double squareAll(double squareSide, double squareBase) {
        return squareBase + squareSide;
    }

    public double volume(int height, int radius) {
        return 3.14 * height * radius * radius / 3;
    }
}
