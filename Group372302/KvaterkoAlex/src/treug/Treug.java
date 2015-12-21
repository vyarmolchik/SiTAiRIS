/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treug;


public class Treug {

    private int a, b, c;
    private int p;
    private Double S;

    public Treug(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perim() throws TreugException {
        if (a > 0 || b > 0 || c > 0) {
                p = a + b + c;
            return p;
        } 
        else if(a+b<c||b+c<a||a+c<b)
        {
            throw new TreugException("Не верные данные!");
        }
        else {
            throw new TreugException("Не верные данные!");
        }
    }

    public Double plosch() throws TreugException {
          S = Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c));
        if (S.isNaN() || S.isInfinite()) {
            throw new TreugException("Не получается площадь!");
        }

        return S;
    }
}
