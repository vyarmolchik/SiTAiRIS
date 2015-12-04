package triangle;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double square() throws TriangleException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new TriangleException("Стороной треугольника должно быть натуральное число");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new TriangleException("При заданных значениях треугольник не существует");
        }
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public double perimeter() throws TriangleException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new TriangleException("Стороной треугольника должно быть натуральное число");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new TriangleException("При заданных значениях треугольник не существует");
        }
        return sideA + sideB + sideC;
    }
}
