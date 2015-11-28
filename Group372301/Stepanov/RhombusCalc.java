
public class RhombusCalc {
    public double squareByHeight(double height, double side) throws IllegalArgumentException {
        if (height <= 0)
            throw new IllegalArgumentException("Высота меньше или равна нулю");
        if (side <= 0)
            throw new  IllegalArgumentException("Сторона меньше или равна нулю");
        return height*side;
    }

    public double squareByDiagonal(double diagonalMax, double diagonalMin) throws IllegalArgumentException {
        if (diagonalMax <= 0)
            throw new IllegalArgumentException("Большая диагональ меньше или равна нулю");
        if (diagonalMin <= 0)
            throw new  IllegalArgumentException("Меньшая диагональ меньшу или равна нулю");
        return diagonalMax*diagonalMin/2;
    }

    public double perimeter(double side) throws IllegalArgumentException {
        if (side <= 0)
            throw new  IllegalArgumentException("Сторона меньше или равна нулю");
        return 4*side;
    }

}
