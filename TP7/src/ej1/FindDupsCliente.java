package ej1;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class FindDupsCliente {
    public static void main(String[] args) {
        SortedSet<Cliente> s = new TreeSet<Cliente>();

        List<Cliente> clientesEntrada = Arrays.asList(
            new Cliente("Ana", 30123456),
            new Cliente("Juan", 25789101),
            new Cliente("Ana Garcia", 30123456), // DNI Duplicado
            new Cliente("Pedro", 28111222),
            new Cliente("Maria", 25789101),     // DNI Duplicado
            new Cliente("Luis", 32000111)
        );

        for (Cliente c : clientesEntrada) {
            if (!s.add(c)) {
                System.out.println("Duplicado detectado por DNI: " + c);
            }
        }
        
        System.out.println("\nResultado Final ordenado por DNI:");
        System.out.println(s.size() + " clientes distintos (por DNI):");
        
        for (Cliente c : s) {
            System.out.println(c);
        }
    }

}
