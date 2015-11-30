import view.Pyramid;

/**
 * Created by έμμΰ on 21.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        System.out.println(pyramid.countVolume(10, 10));
        System.out.println(pyramid.countArea(10, 10));
    }
}
