package ej2;

public class LanzamientoDados {
    public static void main(String[] args) {
        Dado simulador = new Dado();

        int[] resultados50 = simulador.simularLanzamientos(50);
        simulador.imprimirResultados(resultados50);

        int[] resultados1000 = simulador.simularLanzamientos(1000);
        simulador.imprimirResultados(resultados1000);

    }

}
