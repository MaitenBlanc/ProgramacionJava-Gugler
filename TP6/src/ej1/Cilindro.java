package ej1;

public class Cilindro extends Circulo {
    private double volumen;
    private double altura;

    public Cilindro(double altura, double radio) {
        super(radio);
        this.altura = altura;
    }

    public double calcularVolumen() {
        this.volumen = Math.PI * Math.pow(getRadio(), 2) * altura;
        return volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilíndro de altura=" + altura + " y volumen=" + volumen;
    }


}
