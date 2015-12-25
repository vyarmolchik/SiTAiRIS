/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_test;

/**
 *
 * @author NotePad
 */
public interface Calc {
    public double FindMax(double mas[]) throws NotSuchMarkException;
    public double FindMin(double mas[]) throws NotSuchMarkException;
    public double CalcAverage(double mas[]) throws NotSuchMarkException;
}
