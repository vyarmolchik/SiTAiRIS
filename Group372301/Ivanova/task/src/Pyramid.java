import java.security.InvalidParameterException;

public class Pyramid {

    public double volume(int h, int a, int b) {
        if (h <= 0 || a <= 0 || b <= 0)
            throw new InvalidParameterException("parameters must be positive");
        return a * b * h / 3.0;
    }

    public int squareBottom(int a, int b) {
        if (a <= 0 || b <= 0)
            throw new InvalidParameterException("parameters must be positive");
        return a * b;
    }

    public double findDiagonal(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double findHalfDiagonal(int a, int b) {
        return findDiagonal(a, b) / 2.0;
    }

    public double findBottomHA(int a, int b) {
        return Math.sqrt(Math.pow(findHalfDiagonal(a, b), 2) - Math.pow((a / 2.0), 2));
    }

    public double findBottomHB(int a, int b) {
        return Math.sqrt(Math.pow(findHalfDiagonal(a, b), 2) - Math.pow((b / 2.0), 2));
    }

    public double findSideHA(int h, int a, int b) {
        return Math.sqrt(Math.pow(findBottomHA(a, b), 2) + Math.pow(h, 2));
    }

    public double findSideHB(int h, int a, int b) {
        return Math.sqrt(Math.pow(findBottomHB(a, b), 2) + Math.pow(h, 2));
    }

    public double squareSidesA(int h, int a, int b) {
        if (h <= 0 || a <= 0 || b <= 0)
            throw new InvalidParameterException("parameters must be positive");
        return findSideHA(h, a, b) * (a / 2.0);
    }

    public double squareSidesB(int h, int a, int b) {
        if (h <= 0 || a <= 0 || b <= 0)
            throw new InvalidParameterException("parameters must be positive");
        return findSideHB(h, a, b) * (b / 2.0);
    }

    public double squareSides(int h, int a, int b) {
        return squareSidesB(h, a, b) * 2 + squareSidesA(h, a, b) * 2;
    }

    public double squareAll(int h, int a, int b) {
        return squareSides(h, a, b) + squareBottom(a, b);
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.squareAll(5, 2, 3);
    }
}
