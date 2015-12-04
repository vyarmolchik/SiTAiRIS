/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ITriangleCountsImpl implements ITriangleCounts {
    private double a;
    private double b;
    private double c;
    public ITriangleCountsImpl(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public boolean setSides (double a, double b, double c){
        if (a*b*c == 0)
            return false;
        if (a<0 || b<0 || c<0)
            return false;
        double p=(a+b+c)/2;
        p=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if (p == 0)
            return false;
        this.a=a;
        this.b=b;
        this.c=c;
        return true;
    }
    @Override
    public double countPrimeter(){
        if (a*b*c == 0)
            return -1;
        if (a<0 || b<0 || c<0)
            return -1;
        return a+b+c;
    }
    
    @Override
    public double countSquare (){
        double p=countPrimeter()/2;
        if (p<0)
            return -1;
        p=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if (p == 0){
            return -1;
        }
        return p;
    }
    public static void main (String args[]){
        ITriangleCountsImpl b=new ITriangleCountsImpl(1, 2 , 3);
        System.out.println(b.countPrimeter());
        double lk=b.countSquare();
    }
}
