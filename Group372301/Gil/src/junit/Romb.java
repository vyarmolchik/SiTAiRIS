/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import java.security.InvalidParameterException;

/**
 *
 * @author Kleopatra
 */
public class Romb {

    public Romb() {
    }

    public float Perimetr(float a) {
        if (a < 0) {
            throw new InvalidParameterException("Неудвлетворительные параметры!");
        }
        return 4 * a;
    }

    public float Square_h_a(float h, float a) {
        if (a < 0 || h < 0) {
            throw new InvalidParameterException("Неудвлетворительные параметры!");
        }
        return h * a;
    }

    public float Square_d_d(float d1, float d2) {
        if (d1 < 0 || d2 < 0) {
            throw new InvalidParameterException("Неудвлетворительные параметры!");
        }
        return d1 * d2 / 2;
    }

    public float Square_a_alpha(float a, float alpha) {
        if (a < 0 || alpha < 0 || alpha > 90) {
            throw new InvalidParameterException("Неудвлетворительные параметры!");
        }
        float res = (float) (a * a * Math.sin(Math.PI*alpha/180));
        return res;
    }

    public float Square_r_alpha(float r, float alpha) {
        if (r < 0 || alpha < 0 || alpha > 90) {
            throw new InvalidParameterException("Неудвлетворительные параметры!");
        }
        float res = (float) (4 * r * r / Math.sin(Math.PI*alpha/180));
        return res;
    }

    public float Square_r_a(float r, float a) {
        if (a < 0 || r < 0) {
            throw new InvalidParameterException("Неудвлетворительные параметры!");
        }
        return 2 * r * a;
    }
}
