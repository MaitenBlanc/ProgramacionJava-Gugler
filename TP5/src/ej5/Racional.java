package ej5;

public class Racional {
    private int numerador;
    private int denominador;
    
    private void verificarDenominador() {
        if (this.denominador == 0) {
            System.out.println("El denominador no puede ser cero.");
        }
        if (this.denominador < 0) {
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }
    }

    private int simplificarResultado(int numerador, int denominador) {
        numerador = Math.abs(numerador);
        denominador = Math.abs(denominador);

        while (denominador != 0) {
            int resto = numerador % denominador;
            numerador = denominador;
            denominador = resto;
        }
        return numerador;
    }

    public Racional(int numerador, int denominador) {
        this.denominador = denominador;
        this.numerador = numerador;

        verificarDenominador();
        int mcd = simplificarResultado(this.numerador, this.denominador);
    
        this.numerador /= mcd;
        this.denominador /= mcd;
    }

    // Fórmula suma: a/b + c/d = (ad + bc) / bd
    public Racional sumar(Racional racional) {
        int newNumerador = this.numerador * racional.getDenominador() + this.denominador * racional.getNumerador();
        int newDenominador = this.denominador * racional.getDenominador();
        return new Racional(newNumerador, newDenominador);
    }

    // Fórmula resta: a/b - c/d = (ad - bc) / bd
    public Racional restar(Racional racional) {
        int newNumerador = (this.numerador * racional.getDenominador()) - (this.denominador * racional.getNumerador());
        int newDenominador = this.denominador * racional.getDenominador();
        return new Racional(newNumerador, newDenominador);
    }

    // Fórmula multiplicación: (a/b) * (c/d) = ac / bd
    public Racional multiplicacion(Racional racional) {
        int newNumerador = this.numerador * racional.getNumerador();
        int newDenominador = this.denominador * racional.getDenominador();
        return new Racional(newNumerador, newDenominador);
    }

    // Fórmula división: (a/b) / (c/d) = ad / bc
    public Racional division(Racional racional) {
        // División por 0 manejada por constructor
        int newNumerador = this.numerador * racional.getDenominador();
        int newDenominador = this.denominador * racional.getNumerador();
        return new Racional(newNumerador, newDenominador);
    }

    // Getters y Setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
