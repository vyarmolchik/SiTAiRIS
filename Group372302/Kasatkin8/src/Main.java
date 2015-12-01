

public class Main {

    public static void main(String[] args) {
        if(args.length!=1)
            example();
        else {
            QuadraticEquation Equation = new QuadraticEquation(args[0]);
            if(Equation.verify())
                System.out.println(Equation.solve());
            else
                example();
        }
    }
    
     public static void example(){
         System.out.println("Пример запуска пограммы: QuadraticEquation 5x^2+3.4x=1\nУравнение должно иметь вид Ax^2+Bx=C");   
     }

}

