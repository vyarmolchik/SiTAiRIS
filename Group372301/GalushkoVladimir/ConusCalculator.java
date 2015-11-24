public class ConusCalculator {
    //Fast implementation without exceptions. Eat everything like JS
    public ConusCalculator() {}

    public double theH(double lh, double radius){
        lh = Math.abs(lh);
        radius = Math.abs(radius);
        return Math.sqrt(Math.pow(lh, 2) - Math.pow(radius, 2));
    }
    public double squareS(double lh, double radius){
        lh = Math.abs(lh);
        radius = Math.abs(radius);
        return 3.14 * radius * lh;
    }

    public double squareB(double radius){
        radius = Math.abs(radius);
        return 3.14 * Math.pow(radius, 2);
    }

    public double square(double squareSide, double squareBase){
        squareBase = Math.abs(squareBase);
        squareSide = Math.abs(squareSide);
        return squareBase + squareSide;
    }

    public double volume(double h, int radius){
        h = Math.abs(h);
        radius = Math.abs(radius);
        return 3.14 * h * Math.pow(radius, 2) / 3;
    }

}
