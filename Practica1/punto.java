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
    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        System.out.println(p); 

        double[] cartesianas = p.coordCartesiana();
        System.out.println("Coordenadas cartesianas: x=" + cartesianas[0] + ", y=" + cartesianas[1]);

        double[] polares = p.coordPolar();
        System.out.println("Coordenadas polares: r=" + polares[0] + ", theta=" + polares[1]);
    }
}
