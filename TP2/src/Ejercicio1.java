
/**
 * Clase Ejercicio 1
 * Demuestra la incialización de variables y se muestran por consola.
 *
 * @author Maitén Blanc
 * @version 1.0
 */
public class Ejercicio1 {

    /**
     * Método principal que inicializa las variables y las muestra por consola.
     *
     * @param args Muestra los argumentos de línea de comandos (no se usa en este ejercicio).
     */
    public static void main(String[] args) {
        // Inicialización de variables

        /* int numero; 
            Problema: Variable no inicializada.
            Solución: ponerle un valor de inicio.
         */
        int numero = 5;
        boolean compila = false;
        char cadena = 'c';
        long numeroLong = 12345678;

        /* int numeroInt = numeroLong;
            Problema: No se puede inicializar un long a un int, se podrían perder datos.
            Solución: hacer un casteo explícito.
         */
        int numeroInt = (int) numeroLong;

        double radio = 0.0;

        /* final float PI = 3.1415;
            Problema: No se puede convertir un double a un float, el valor no tiene el sufijo F.
            Solución: agregar el sufijo F.
         */
        final float PI = 3.1415F;

        /* short numeroShort = 1234567;
            Problema: El valor excede el rango de un short (-32768 a 32767).
            Solución: cambiar el tipo de dato a int o long.
         */
        int numeroShort = 1234567;

        // Muevo la variable fuera del bloque para más facilidad a la hora de mostrarla
        byte numeroByte = -128;

        String mensaje = "Inicialización de variables";

        // Bloque de código
        /* System.out.println("numeroByte: " + numeroByte);
        Problema: El valor numeroByte no es visible por estar dentro de un bloque de código, sólo existe en ese bloque y 
        fuera de él no compila.
        Solución: mover la declaración de la variable fuera del bloque o imprimirlo dentro del bloque.
            {
                byte numeroByte = -128;
                System.out.println("numeroByte: " + numeroByte);
            }
         */
        // Mostrar valores
        System.out.println(mensaje);
        System.out.println("Número: " + numero);
        System.out.println("Compila: " + compila);
        System.out.println("Cadena: " + cadena);
        System.out.println("Número Long: " + numeroLong);
        System.out.println("Número Int: " + numeroInt);
        System.out.println("Radio: " + radio);
        System.out.println("Pi: " + PI);
        System.out.println("Número Short: " + numeroShort);
        System.out.println("Número Byte: " + numeroByte);
    }
}
