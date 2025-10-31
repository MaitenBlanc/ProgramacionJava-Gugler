public class Ejercicio4 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 0;

        System.out.println("\nValores iniciales: x = " + x + ", y = " + y + ", z = " + z);

        // • Asignar la suma de x e y a z, e incrementar x en 1 unidad después del
        // cálculo. Utilice para esto una sola instrucción.
        z = x++ + y;

        System.out.println("Suma: x + y = " + z);
        System.out.println("Incremento: x = " + x);

        // • Decrementar la variable x en 1, luego de restarla a la variable total. Use
        // una sola instrucción.
        int total = 20;
        total -= x--;

        System.out.println("Resta: total - x = " + total);
        System.out.println("Decremento: x = " + x);

        // • Calcular el resto después de dividir q entre divisor, y asignar el
        // resultado a q.
        int q = 18;
        int divisor = 5;

        System.out.println("Valores iniciales: q = " + q + ", divisor = " + divisor);

        q %= divisor;

        System.out.println("Resto: q % divisor = " + q);

        // • Muestre por pantalla todos los números del 3 al 120, en orden inverso con
        // saltos de a 3.
        System.out.println("\nNúmeros del 3 al 120 en orden inverso con saltos de a 3:");
        for (int i = 120; i >= 3; i -= 3) {
            System.out.println(i);
        }

    }
}
