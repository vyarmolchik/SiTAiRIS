/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitarislab8;

/**
 *
 * @author Vladimir
 */
class Equation {

    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Equation(final double a, final double b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public int getRootsCount() {
        double d = getDiscriminant();
        if (d < 0) {
            return 0;
        } else if (d == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    public double getX1() throws EquationException {
        Double x1;
        double d = getDiscriminant();
        if (d < 0) {
            throw new EquationException("Невозможно получить корень при отрицательном дискриминанте!");
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            if (x1.isInfinite() || x1.isNaN()) {
                throw new EquationException("Нет данных!");
            }
        }
        return x1;
    }

    public double getX2() throws EquationException {
        Double x2;
        double d = getDiscriminant();
        if (d < 0) {
            throw new EquationException("Невозможно получить корень при отрицательном дискриминанте!");
        } else {
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (x2.isInfinite() || x2.isNaN()) {
                throw new EquationException("Нет данных!");
            }
        }
        return x2;
    }
}
