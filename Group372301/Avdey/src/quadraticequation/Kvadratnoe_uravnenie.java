/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

public class Kvadratnoe_uravnenie {

    private String Equation;
    private double A;
    private double B;
    private double C;

    public Kvadratnoe_uravnenie(String eq) {
        Equation = eq;
    }

    private boolean fulfilParameters() {

        if (verifyEquation()) {
            String[] arr = Equation.split("x\\^2");
            A = Double.parseDouble(arr[0]);
            arr = arr[1].split("x=");
            B = Double.parseDouble(arr[0]);
            C = -1 * Double.parseDouble(arr[1]);
        }
        return verifyEquation();
    }

    public String solve() {
        if(!fulfilParameters())
            return "Equation ERROR!!";
        double D = B * B - 4 * A * C;
        if (D < 0) {
            return "D<0 Нет корней!";
        } else if (D == 0) {
            double d = (-1*B / (2 * A));
            return "D=0 x=" + d;
        } else {
            return "x1=" + ((-1*B + Math.sqrt(D))) / (2 * A) + " x2=" + ((-B - Math.sqrt(D))) / (2 * A);
        }
    }

    public boolean verifyEquation() {
        return Equation.matches("^(-?\\d+\\.?\\d*)x\\^2\\+?(-?\\d+\\.?\\d*)x=(-?\\d+\\.?\\d*)$");
    }
}
