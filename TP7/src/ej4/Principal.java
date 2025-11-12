package ej4;

public class Principal {
    public static void main(String[] args) {
        // Creo el gestor
        GestorPersona gestor = new GestorPersona();

        // Creo las personas
        Persona persona1 = new Persona("Juan", "Pérez", "12345678", 30);
        Persona persona2 = new Persona("María", "Gómez", "87654321", 25);
        Persona persona3 = new Persona("Luis", "López", "11111111", 40);

        // Agrego personas al gestor
        gestor.agregarPersona(persona1);
        gestor.agregarPersona(persona2);
        gestor.agregarPersona(persona3);

        // Muestro la lista
        System.out.println("Lista de personas:");
        gestor.mostrarPersonas();

        // Pruebo agregar dni duplicado
        Persona persona4 = new Persona("Ana", "Martínez", "12345678", 28);  
        gestor.agregarPersona(persona4);

        // Muestro lista para ver que no cambió
        System.out.println("\nLista de personas después de agregar persona duplicada:");
        gestor.mostrarPersonas();

        // Pruebo eliminar persona
        gestor.eliminarPersona("12345678");

        // Muestro lista para ver que cambió
        System.out.println("\nLista de personas después de eliminar persona:");
        gestor.mostrarPersonas();

        // Elimino persona que no existe
        gestor.eliminarPersona("99999999");

    }
}
