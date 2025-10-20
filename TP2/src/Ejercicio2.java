
/**
 * Clase Ejercicio 2
 * Demuestra la incialización de variables y se muestran por consola.
 *
 * @author Maitén Blanc
 * @version 1.0
 */
public class Ejercicio2 {

    /**
     * Método principal que ejecuta el ejercicio 2.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        char caracter = 'G';

        int decimal = 26;
        int octal = 032;
        int hexadecimal = 0x1A;

        float numFloat = 9.18F;

        double numDouble = 6.4519e0;

        System.out.println("\nCaracter: " + caracter);
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Número flotante simple precisión: " + numFloat);
        System.out.println("Número flotante doble precisión: " + numDouble);
    }
}
