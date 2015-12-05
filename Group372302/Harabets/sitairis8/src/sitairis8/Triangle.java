/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitairis8;

/**
 *
 * @author User
 */
public class Triangle {
      double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() throws TriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleException("Some sides is negative");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleException("It is not a triangle");
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() throws TriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleException("Some sides is negative");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleException("It is not a triangle");
        }
        return a + b + c;
    }
}
