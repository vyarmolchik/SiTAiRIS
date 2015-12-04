/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhombus;
import java.security.InvalidParameterException;
/**
 *
 * @author ddv
 */
public class Rhombus {
    private int d1;
    private int d2;
    private int st;
    
    public Rhombus(){}
    
public double area(int d1, int d2)
{
    if (d1 <=0 || d2 <= 0)
        throw new InvalidParameterException("Диагонали должны быть только положительными");
    return d1*d2/2;
}

public int perimetr(int a)
{
    if (a <= 0)
        throw new InvalidParameterException("Стороны должны быть только положительными");
    return 4*a;
}
    
    public static void main(String[] args) {
       
        
    }
    
}
