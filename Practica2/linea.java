public class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Linea(p1=" + p1 + ", p2=" + p2 + ")";
    }

    public void dibujaLinea() {
        System.out.println("Dibujando línea desde " + p1 + " hasta " + p2);
    }

    // Ejemplo de uso en un main (opcional)
    public static void main(String[] args) {
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(3, 4);
        Linea linea = new Linea(punto1, punto2);
        System.out.println(linea);
        linea.dibujaLinea();
    }
}
