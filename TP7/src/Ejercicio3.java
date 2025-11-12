import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Ejercicio 3:
// Realice un programa que cargue en un objeto que implementa la interfaz List, los
// parámetros recibidos por el programa. Obtenga los valores máximos y mínimos y muéstrelos por
// pantalla.

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese números enteros (separados por espacios): ");
        String nums = scanner.nextLine();
        scanner.close();

        String[] arrayNums = nums.split(" ");
        List<String> arguments = Arrays.asList(arrayNums);

        System.out.println("Lista de números ingresados: " + arguments);

        String min = Collections.min(arguments);
        String max = Collections.max(arguments);

        System.out.println("Valor mínimo: " + min);
        System.out.println("Valor máximo: " + max);
    }
}
