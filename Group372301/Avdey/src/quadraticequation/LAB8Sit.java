package quadraticequation;
public class LAB8Sit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length!=1)
            help();
        else {
            Kvadratnoe_uravnenie Equation = new Kvadratnoe_uravnenie(args[0]);
            if(Equation.verifyEquation())
                System.out.println(Equation.solve());
            else
                help();
        }
    }
    
     public static void help(){
         System.out.println("Пример запуска пограммы: QuadraticEquation 10x^2+5.2x=-7");
         System.out.println("Уравнение должно иметь вид Ax^2+Bx=C");    
     }

}

