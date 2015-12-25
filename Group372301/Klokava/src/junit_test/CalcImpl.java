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
public class CalcImpl implements Calc{
    
    public double FindMax(double mas[]) throws NotSuchMarkException{
        if(mas.length==0) throw new NotSuchMarkException("Пустой массив");
        else{
            double max=mas[0];

            for(int i=1; i<mas.length; i++){
                if(mas[i]>max)
                    max=mas[i];
            }
            return max;
        }
    }
    
    public double FindMin(double mas[]) throws NotSuchMarkException{
        if(mas.length==0) throw new NotSuchMarkException("Пустой массив");
        else{
            double max=mas[0];

            for(int i=1; i<mas.length; i++){
                if(mas[i]<max)
                    max=mas[i];
            }
            return max;
        }
    }
    
    public double CalcAverage(double mas[]) throws NotSuchMarkException{
        if(mas.length==0) throw new NotSuchMarkException("Пустой массив");
        else{
            double max, sum=0;

            for(int i=0; i<mas.length; i++){
                sum+=mas[i];
            }
            
            max=sum/mas.length;
            return max;
        }
    }

}
