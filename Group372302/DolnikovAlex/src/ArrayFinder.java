/**
 * Created by User-PC on 24.11.2015.
 */
public class ArrayFinder implements IArrayFinder {
    private int[] array;

    public ArrayFinder() {
        array = null;
    }

    public ArrayFinder(int[] array) {
        this.array = array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int FindMin() throws NullPointerException {
        int tmp = array[0];
        for(int i = 1; i < array.length; i++) {
            if(tmp > array[i]) {
                tmp = array[i];
            }
        }
        return tmp;
    }

    public int FindMax() throws NullPointerException {
        int tmp = array[0];
        for(int i = 1; i < array.length; i++) {
            if(tmp < array[i]) {
                tmp = array[i];
            }
        }
        return tmp;
    }

    public double FindAverage() throws NullPointerException {
        double tmp = 0;
        for(int i = 0; i < array.length; i++) {
            tmp += array[i];
        }
        tmp /= array.length;
        return tmp;
    }
}
