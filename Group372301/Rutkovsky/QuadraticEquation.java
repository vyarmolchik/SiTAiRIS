import java.security.InvalidParameterException;

public class QuadraticEquation {
    private double x1, x2;
    private double[] results = new double[2];

    public QuadraticEquation(){}

    public double[] solve(double a, double b, double c) {
        if (a != 0) {
            double D = Math.pow(b,2)-(4*a*c);
            if (D > 0) {
                x1 = ((-b) - Math.sqrt(D)) / (2 * a);
                x2 = ((-b) + Math.sqrt(D)) / (2 * a);
                results[0] = x1;
                results[1] = x2;
            } else if (D == 0) {
                x1 = (-b) / (2 * a);
                results[0] = x1;
                results[1] = x1;
            } else {
                throw new InvalidParameterException("Discriminant < 0");
            }
        } else {
            throw new InvalidParameterException("Not quadratic equation");
        }
        return results;
    }
}
