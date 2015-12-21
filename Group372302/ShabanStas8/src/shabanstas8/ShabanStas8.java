/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shabanstas8;

/**
 *
 * @author Станислав
 */
public class ShabanStas8 {

    public static double PyramidVolume(int facet, int baseSide) {
        if (facet <= 0) {
            throw new IllegalArgumentException("Недопустимое значение длины грани.");
        } else if (baseSide <= 0) {
            throw new IllegalArgumentException("Недопустимое значение длины стороны основания.");
        } else if (facet * 2 <= baseSide) {
            throw new IllegalArgumentException("Пирамида с такими параметрами не существует.");
        }
        double diagonal = Math.sqrt(2 * Math.pow(baseSide, 2));
        double height = Math.sqrt(Math.pow(facet, 2) - Math.pow(diagonal, 2) / 2);
        double volume = (double) 1 / 3 * height * Math.pow(baseSide, 2);
        volume = Math.round(volume);
        return volume;
    }

    public static double FacetSquare(int facet, int baseSide) {

        int perimetr = baseSide * 4;

        if (perimetr <= 0) {
            throw new IllegalArgumentException("Недопустимое значение периметра основания пирамиды.");
        } else if (facet <= 0) {
            throw new IllegalArgumentException("Недопустимое значение длины грани пирамиды.");
        }
        double SideHeight = (double)1/2 * baseSide * facet;
        double Square = SideHeight * (double)1/2 * perimetr;
        Square = Math.round(Square);
        return Square * 4;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (PyramidVolume(4, 3) == 8.0) {
            System.out.println("Test1 passed");
        } else {
            System.out.println("Test1 failed");
        }
        try {
            double volume = PyramidVolume(4, 3);
            System.out.println("Test2 failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test2 passed");
        }
        try {
            double Square = FacetSquare(5, 0);
            System.out.println("Test3 failed");
        }
        catch(IllegalArgumentException e){
            System.out.println("Test3 passed");
        }
    }

}
