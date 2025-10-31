public class Ejercicio3 {
    public static void main(String[] args) {
        double precio = 0.0;

        String numProductoString = javax.swing.JOptionPane
                .showInputDialog("Ingrese el número del producto (1-4) o 0 para salir)");
        int numeroProducto = Integer.parseInt(numProductoString);

        while (numeroProducto != 0) {
            switch (numeroProducto) {
                case 1:
                    precio = 2.98;
                    break;
                case 2:
                    precio = 4.56;
                    break;
                case 3:
                    precio = 9.75;
                    break;
                case 4:
                    precio = 6.24;
                    break;
                default:
                    System.out.println("Número de producto inválido");
                    break;
            }

            String cantidadVendidaString = javax.swing.JOptionPane
                    .showInputDialog("Ingrese la cantidad que se vendió: ");
            int cantidadVendida = Integer.parseInt(cantidadVendidaString);

            numProductoString = javax.swing.JOptionPane
                    .showInputDialog("Ingrese el número del producto (1 a 4 o 0 para salir)");
            numeroProducto = Integer.parseInt(numProductoString);

            double total = precio * cantidadVendida;

            System.out.println("\nPrecio unitario: $" + precio);
            System.out.println("Cantidad vendida: " + cantidadVendida);
            System.out.printf("Monto total: $" + total);
        }

    }

}
