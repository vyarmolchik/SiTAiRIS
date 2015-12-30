package triangle;

/**
 * Created by Uladzislau on 29.12.2015.
 */
public class Triangle {
    public Double square(Double height, Double base) throws UnsupportedValue{
        if(height > 0 && base > 0) {
            return height * base /2;
        }   else {
            throw new UnsupportedValue("unsupported negative value");
        }
    }

    public Double perimeter(Double a, Double b, Double c) throws UnsupportedValue{
        if(a > 0 && b > 0 && c > 0) {
            return a + b + c;
        }   else {
            throw new UnsupportedValue("unsupported negative value");
        }
    }
}
