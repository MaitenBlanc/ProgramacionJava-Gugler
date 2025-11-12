package ej1;

public class Circulo {
    private double radio;
    private double area;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        this.area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Cículo de radio=" + radio + " y area=" + area;
    }

}
