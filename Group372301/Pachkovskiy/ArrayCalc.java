//10.	 Для массива реализовать поиск максимального и минимального элементов, 
//среднего значения всех элементов массива.

import java.security.InvalidParameterException;

public class ArrayCalc {

    public int maxElement(int[] arr) {

        if (arr.length == 0) {
            throw new InvalidParameterException("null argument");
        }
        int max = arr[0];
        for (int key : arr) {
            if (key > max) {
                max = key;
            }
        }
        return max;
    }

    public int minElement(int[] arr) {

        if (arr.length == 0) {
            throw new InvalidParameterException("null argument");
        }
        int min = arr[0];
        for (int key : arr) {
            if (key < min) {
                min = key;
            }
        }
        return min;
    }

    public double averageValue(int[] arr) {

        if (arr.length == 0) {
            throw new InvalidParameterException("null argument");
        }
        int sum = 0;
        for (int key : arr) {
            sum += key;
        }
        return sum / arr.length;
    }
}
