public class Circulo {
    private Punto centro;
    private float radio; 

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo(centro=" + centro + ", radio=" + radio + ")";
    }

    public void dibujaCirculo() {
        System.out.println("Dibujando círculo con centro " + centro + " y radio " + radio);
    }

    // Ejemplo de uso en un main (opcional)
    public static void main(String[] args) {
        Punto c = new Punto(2, 2);
        Circulo circulo = new Circulo(c, 5.0f);
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}
