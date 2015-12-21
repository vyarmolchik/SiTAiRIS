/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treug;

public class Main {

    public static void main(String[] args) {
        try {
            Treug trg = new Treug(3, 4, 5);
            System.out.println(trg.perim() + " ");
            System.out.println(trg.plosch());
            trg = new Treug(-3, -4, -5);
            System.out.println(trg.perim() + " ");
            System.out.println(trg.plosch());
            trg = new Treug(11, 3, 4);
            System.out.println(trg.perim() + " ");
            System.out.println(trg.plosch());
        } catch (TreugException e) {
            System.out.println(e.getMessage());
        }
    }

}
