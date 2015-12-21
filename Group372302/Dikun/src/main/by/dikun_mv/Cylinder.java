package by.dikun_mv;

public class Cylinder {
    private double R;
    private double H;

    public Cylinder() {
        this(0D, 0D);
    }

    public Cylinder(double R, double H) {
        this.R = R >= 0 ? R : 0;
        this.H = H >= 0 ? H : 0;
    }

    public double  calculateVolume() {
        return Math.PI * Math.pow(R, 2D) * H;
    }

    public double calculateSideArea() {
        return 2D * Math.PI * R * H;
    }

    public double calculateFullArea() {
        return calculateSideArea() + 2D * Math.PI * Math.pow(R, 2D);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cylinder cylinder = (Cylinder) o;

        if (Double.compare(cylinder.R, R) != 0) return false;
        return Double.compare(cylinder.H, H) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(R);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(H);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "R=" + R +
                ", H=" + H +
                '}';
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }
}
