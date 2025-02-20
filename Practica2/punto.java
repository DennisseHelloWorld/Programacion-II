public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] coordCartesiana() {
        return new double[]{ x, y };
    }

    public double[] coordPolar() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        return new double[]{ r, theta };
    }

    @Override
    public String toString() {
        return "Punto(x=" + x + ", y=" + y + ")";
    }
}
