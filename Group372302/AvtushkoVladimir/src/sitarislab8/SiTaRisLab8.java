/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitarislab8;

/**
 *
 * @author Vladimir
 */
public class SiTaRisLab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("Создаем уравнение с параметрами a=5, b=-7, c=1");
            Equation eq = new Equation(0, 2, 3);
            int roots = eq.getRootsCount();
            System.out.println("Это уравнение имеет корней: " + roots);
            if (roots >= 0) {
                System.out.println("корень 1 равен " + eq.getX1());
                if (roots > 0) {
                    System.out.println("корень 1 равен " + eq.getX2());
                }
            }
        } catch (EquationException e) {
            System.out.println(e.getMessage());
        }
    }
}
