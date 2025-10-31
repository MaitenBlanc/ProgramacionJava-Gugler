package ej5;
/* Ejercicio 5:
Se pide que diseñe e implemente esta clase Java con sus correspondientes atributos y
métodos. Luego realice una clase que contenga el método main, instancie objetos de tipo
Racional, pruebe realizar las operaciones de esta clase, tales como sumar dos números
racionales, multipliarlos, etc. Por último muestre los resultados obtenidos de aplicar estas
operaciones.
Reescriba el método toString que se hereda de la clase Object en la clase Racional de
forma tal que devuelta la siguiente representación en formato String de un objeto Racional:
“(numerador / denominador)”. */

public class Ejercicio5 {
    public static void main(String[] args) {
        // Instanciar objetos de tipo Racional
        Racional r1 = new Racional(1, 2); 
        Racional r2 = new Racional(1, 3);
        Racional r3 = new Racional(4, 8);

        System.out.println("Valores originales: r1 = " + r1 + ", r2 = " + r2 + ", r3 = " + r3);
        
        System.out.println("Suma: " + r1.sumar(r2));
        System.out.println("Resta: " + r1.restar(r2));
        System.out.println("Multiplicación: " + r1.multiplicacion(r2));
        System.out.println("División: " + r1.division(r2));
    }
}
