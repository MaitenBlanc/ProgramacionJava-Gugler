
public class Ejercicio5 {

    public static void main(String[] args) {
        String inicio = javax.swing.JOptionPane.showInputDialog("Ingrese número desde:");
        String fin = javax.swing.JOptionPane.showInputDialog("Ingrese número hasta:");

        int contador = Integer.parseInt(inicio);

        do {
            System.out.println("\nProbando bucle do-while: " + contador);
            contador++;
        } while (contador <= Integer.parseInt(fin));
    }
}
