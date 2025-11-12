package ej2;

import java.util.Random;

public class Dado {
    private Random valor;

    public Dado() {
        this.valor = new Random();
    }

    public int[] simularLanzamientos(int cantTiros) {
        int[] resultados = new int[cantTiros];

        for (int i = 0; i < cantTiros; i++) {
            int tiro = valor.nextInt(6) + 1;

            resultados[tiro]++;
        }

        return resultados;
    }

    public void imprimirResultados(int[] resultados) {
        System.out.println("Resultados de " + resultados.length + " tiros: ");
        for (int i = 1; i <= 6; i++) {
            System.out.println("Número " + i + ": " + resultados[i] + " veces.");            
        }
    
    }
}
