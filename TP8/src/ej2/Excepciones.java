package ej2;

public class Excepciones {
    public static void main(String[] args) {
        String n = "afg";

        // a) Asignar una variable de tipo entero, la conversión de un objeto String a entero
        try {
            Integer.parseInt(n);
        } catch (NumberFormatException e) {
            System.out.println("Excepcion: No es un numero");
        }

        // b) Intentar realizar una división sobre cero.
        try {
            int b = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Excepcion: Division entre 0");
        }

        // c) Acceder fuera de los límites definidos por un arreglo estático de elementos flotantes
        try {
            double[] arr = new double[5];
            arr[7] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepcion: Fuera de los limites del arreglo");
        }

    }
}
