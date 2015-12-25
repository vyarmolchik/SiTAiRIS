/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitairis88;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Анна
 */
public class Sitairis88 {

    public static double getVolume(int h,int r) //Вычисление объема конуса
    {
     if(h<=0 || r<=0)
          throw new IllegalArgumentException("Отрицательные или нулевые параметры конуса");
     double v = h*3.14*Math.pow(r, 2)/3;
     return v;
    }
    
    public static double getAreaFaceBase(int r)//Вычисление площади основания конуса
    {
         if(r<=0)
            throw new IllegalArgumentException("Отрицательный или нулевой радиус основания конуса");
     double s = 3.14*Math.pow(r, 2);
     return s;
    }  
     public static double getAreaFaceSide(int h, int r)//Вычисление боковой плащади конуса
    {
         if(h<=0 || r<=0)
            throw new IllegalArgumentException("Отрицательные или нулевые параметры конуса");
     double s = 3.14*r*Math.sqrt(Math.pow(r, 2)+Math.pow(h, 2));
     return s;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
       System.out.println("Введите радиус:");
       int r = read.nextInt();
        System.out.println("Введите высоту:");
        int h = read.nextInt();
        System.out.println("Объем конуса равен "+getVolume( h,r));
       System.out.println("Площадь боковой поверхности конуса раван "+getAreaFaceSide(h,r));
       System.out.println("Площадь основания конуа равна "+getAreaFaceBase(r));
    }
}


 
