
import java.util.Date;

public class Ejercicio6 {

    public static void main(String[] args) {
        String titulo = "Presione 1 para ver la hora" + "\nPresione 2 para salir";
        String opcion = javax.swing.JOptionPane.showInputDialog(titulo);

        if (Integer.parseInt(opcion) == 1) {
            System.out.println("\n" + new Date());
        }

        if (Integer.parseInt(opcion) == 2) {
            System.exit(0);
        }
    }
}
