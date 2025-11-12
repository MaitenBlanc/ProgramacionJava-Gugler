package ej3;

public class Ejercicio3 {
    public static void main(String[] args) {
        String frase = "Programando en Java...";

        // Cambiar la primera palabra toda a mayúsculas.
        System.out.println("Primera palabra en mayúsculas: ");
        String[] palabras = frase.split(" ");
        System.out.println(palabras[0].toUpperCase() + " " + palabras[1] + " " + palabras[2]);

        // Suprimir los espacios en blanco.
        System.out.println("Suprimir espacios en blanco: ");
        System.out.println(frase.replace(" ", ""));

        // Reemplazar los últimos tres caracteres por asteriscos (*).
        System.out.println("Reemplazar los últimos tres caracteres por asteriscos:");
        System.out.println(frase.replace(".", "*"));

        // Reemplazar la primera letra por la cantidad de letras original de la frase.
        System.out.println("Reemplazando la primera letra por la cantidad de letras original de la frase");
        int cantidadLetras = frase.length();
        frase = cantidadLetras + frase.substring(1);

        // Por último, utilizando la clase System informe la cadena codificada por pantalla.
        System.out.println("Cadena codificada:");
        System.out.println(frase);

    }

}
