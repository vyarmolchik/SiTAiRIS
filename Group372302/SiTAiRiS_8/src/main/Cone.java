package main;

import static java.lang.Math.pow;
import main.MyException;
/**
 * Created by Александр on 20.11.2015.
 */
public class Cone {
    float l, r, h;
    Cone(float r, float l, float h){
        this.h = h;
        this.l = l;
        this.r = r;
    }
    public float getVolume() throws MyException{
        if (r <= 0 || h <= 0)
            throw new MyException();
        return (float) ((Math.PI * pow(r, 2) * h) / 3);
    }
    public float getArea() throws MyException{
        if (r <= 0)
            throw new MyException();
        return (float) ((Math.PI * pow(r, 2)));
    }
    public float getLateralArea() throws MyException{
        if (r <= 0 || l <= 0)
            throw new MyException();
        return (float) (Math.PI * r * l);
    }
}
