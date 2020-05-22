
package begun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author tbegu_000
 */
public class Triangle {
    private int a=0,b=0,c=0;
    public static void main(String[] args) throws IOException, MyException {
        Triangle triangle = new Triangle();
        triangle.input();
    }
    
    public void input() throws IOException, MyException{
        
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in,"Cp1251"));
        System.out.println("Введите стороны треугольника:\n");
        boolean flagA = true, flagB = true, flagC = true;
        while(flagA || flagB || flagC){
            try{
                while(flagA){
                    System.out.println("a= ");
                    String s = stdin.readLine();
                    a = inputSide(s);
                    error(a);
                    flagA = false;
                }                 
                while(flagB){
                    System.out.println("b= ");
                    String s = stdin.readLine();
                    b = inputSide(s);
                    error(b);
                    flagB = false;
                }                
                while(flagC){
                    System.out.println("c= ");                
                    String s = stdin.readLine();
                    c = inputSide(s);
                    error(c);
                    flagC = false;
                }                
            }
            catch(MyException e){
                System.out.println(e.getMessage());
            }
            catch(NumberFormatException e){ 
                System.out.println("Ошибка ввода!\nТребуется ввести числовое значение!");
            }
        }
        
        System.out.println("Периметр треугольника = "+perimetr(a,b,c));
        System.out.println("Площадь треугольника = "+area(a,b,c));
    }
    
    public int inputSide(String side){
        int m = -200;
                m= new Integer(side);  
        NumberFormatException e = new NumberFormatException();
        
        if (m == -200)
            throw e;
        
        return m;
    }
    
    public void error(int k) throws MyException{
        if(k < 0)
            throw new MyException("Ошибка ввода!\nСторона должна быть больше нуля!");
        if(k == 0)
            throw new MyException("Ошибка ввода!\nСторона не может быть равна нулю!");
}
    
    public int perimetr(int a,int b, int c){
        return a+b+c;
    }
    
    public double area(int a,int b, int c){
        double p = perimetr(a,b,c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
