/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8sitairis;

/**
 *
 * @author autorun.exe
 */
public class Lab8sitairis {
    
    private int a;
    private int b;
    private int c;
   
    public Lab8sitairis(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    Lab8sitairis(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void setABC(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setC(int c){
        this.c = c;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    
    public int Perimeter(){
        int res = 0;
        res = a+b+c;
        return res;
    }
    public double Square(){
        double res = 0;
        double p = (a + b + c)/2;
        res = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return res;
    }

    public static void main(String[] args) {
        Lab8sitairis ob = new Lab8sitairis(3,3,3);
        System.out.println(ob.Perimeter());
        System.out.println(ob.Square());
    }
}
