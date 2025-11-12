package ej1;

public class PruebaCirculo {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(3);

        Cilindro cilindro1 = new Cilindro(5, 3);
        Cilindro cilindro2 = new Cilindro(4, 2);

        circulo1.calcularArea();
        circulo2.calcularArea();

        cilindro1.calcularVolumen();
        cilindro2.calcularVolumen();

        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(cilindro1);
        System.out.println(cilindro2);
    }
}
