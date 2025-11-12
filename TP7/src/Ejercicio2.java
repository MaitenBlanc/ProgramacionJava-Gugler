import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los argumentos: ");
        String cadena = scanner.nextLine();
        String[] args1 = cadena.split(" ");
        scanner.close();

        List<String> arguments = new ArrayList<>(Arrays.asList(args1));

        System.out.println("Argumentos originales: " + arguments);

        System.out.println("Argumentos aleatorios: ");
        for (int i = 1; i <= 10; i++) {
            Collections.shuffle(arguments);
            System.out.println(arguments);
        }
    }

}
