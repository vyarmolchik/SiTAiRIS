/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphere1;

import java.security.InvalidParameterException;

/**
 *
 * @author Matvey
 */
public class Sphere1 {

    /**
     * @param args the command line arguments
     */
    double getvolume(int radius1)
    {
        if (radius1==0) throw new InvalidParameterException();
        double volume;
        volume=4.0/3.0*radius1*radius1*radius1*3.14;
        return volume;
    }
    
    double getsquare(int radius1)
    {  
        if (radius1==0) throw new InvalidParameterException();
        double square;
        square = 4*3.14*radius1*radius1;
        return square;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
