
public class QuadraticEquation {

    private String Equation;
    private double A;
    private double B;
    private double C;

    public QuadraticEquation(String eq) {
        Equation = eq;
    }

    private boolean setParameters() {
        if (verify()) {
            String[] arr = Equation.split("x\\^2");
            A = Double.parseDouble(arr[0]);
            arr = arr[1].split("x=");
            B = Double.parseDouble(arr[0]);
            C = -1 * Double.parseDouble(arr[1]);
        }
        return verify();
    }

    public String solve() {
        if (!setParameters()) {
            return "Ошибка формата!";
        }
        double D = B * B - 4 * A * C;
        if (D < 0) {
            return "Корней нет!";
        } else if (D == 0) {
            return "D=0\nx=" + (-1 * B / (2 * A));
        } else {
            return "x1=" + ((-1 * B + Math.sqrt(D))) / (2 * A) + " x2=" + ((-B - Math.sqrt(D))) / (2 * A);
        }
    }

    public boolean verify() {
        return Equation.matches("^(-?\\d+\\.?\\d*)x\\^2\\+?(-?\\d+\\.?\\d*)x=(-?\\d+\\.?\\d*)$");
    }

}
