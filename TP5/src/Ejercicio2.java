// Ejercicio 2:
// Cree ahora otra clase llamada Ejercicio2 en el mismo paquete del ejercicio anterior, la
// misma deberá tener un método estático público main.
// Dentro de este método (que será el que se ejecute al correr la clase), mostrar por pantalla,
// mediante una iteración de un bucle while, los números impares del 1 al 20, exceptuando el
// número 13 y 19.


public class Ejercicio2 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 20) {
            if (i != 13 && i != 19 && i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
