package view;

import static java.lang.Math.pow;

/**
 * Created by έμμΰ on 25.11.2015.
 */
public class Sphere {
    public Float parseValueToVolume(String value) throws Exception{
        float radius = Float.parseFloat(value);
        if (radius < 0) throw new Exception();
        return countVolume(radius);
    }

    public Float parseValueToArea(String value)  throws Exception{
        float radius = Float.parseFloat(value);
        if (radius < 0) throw new Exception();
        return countArea(radius);
    }

    public Float countVolume(float radius) {
        return 4.0f / 3.0f * 3.14f * radius * radius * radius;
    }

    public Float countArea(float radius) {
        return 4.0f * 3.14f * radius * radius;
    }
}
