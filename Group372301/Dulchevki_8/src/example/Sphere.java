package example;


public class Sphere {

    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public double getVolume(){
        return 4. / 3. * Math.PI * Math.pow(radius, 3);
    }


    public double getSquare(){
        return 4. * Math.PI * Math.pow(radius, 2);
    }
}
