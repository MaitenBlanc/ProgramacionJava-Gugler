package ej5;

public class Principal {

    public static void main(String[] args) {
        // Instancias alumno
        Alumno alumno1 = new Alumno("Juan", "Perez", 20, 123456, 2022);
        Alumno alumno2 = new Alumno("Maria", "Gomez", 22, 654321, 2024);

        // Instancia profesor
        Profesor profesor1 = new Profesor("Pedro", "Lopez", 3, "Programacion", 5);

        Visor.mostrarInformacion(alumno1);
        Visor.mostrarInformacion(alumno2);
        Visor.mostrarInformacion(profesor1);
    }
}
