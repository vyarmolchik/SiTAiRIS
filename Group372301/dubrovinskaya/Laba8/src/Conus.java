public class Conus {
    private int l;
    private int r;

    public void Conus(){
        this.l = 0;
        this.r = 0;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double findH(int l, int r){
        return Math.sqrt(l * l - r * r);
    }

    public double squareSide(int l, int r){
        if (l < 0)
            l *= (-1);
        if (r < 0)
            r *= (-1);
        return 3.14 * r * l;
    }

    public double squareBase(int r){
        return 3.14 * r * r;
    }

    public double squareAll(double squareSide, double squareBase){
        return squareBase + squareSide;
    }

    public double volume(double h, int r){
        return 3.14 * h * r * r / 3;
    }
}
