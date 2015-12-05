/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trapeze;

/**
 *
 * @author user
 */
import java.security.InvalidParameterException;

public class Trapeze {
    private int a;
    private int b;
    private int c;
    private int d;
    private int h;

    public Trapeze(){}

    public static void main (String[] args){
        
    }
    public int perimeter(int a, int b, int c, int d){
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0)
            throw new InvalidParameterException("Стороны должны быть положительными!");
        return a + b + c + d;
    }

    public double square(int a, int b, int h){
        if (a < 0 || b < 0 || h < 0)
            throw new InvalidParameterException("Стороны должны быть положительными!");
        return ((a + b) / 2.0) * h;
    }
}

