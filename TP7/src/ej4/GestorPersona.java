package ej4;

import java.util.ArrayList;

public class GestorPersona {
    private ArrayList<Persona> listaPersonas;

    public GestorPersona() {
        this.listaPersonas = new ArrayList<>();
    }

    public void mostrarPersonas() {
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }

    public void eliminarPersona(String dni) {
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equals(dni)) {
                listaPersonas.remove(persona);
                System.out.println("Persona eliminada con éxito. DNI: " + dni);
                return;
            }
        }
        System.out.println("No se encontró ninguna persona con el DNI: " + dni);
    }

    public void agregarPersona(Persona persona) {
        if (listaPersonas.contains(persona)) {
            System.out.println("La persona ya existe en la lista.");
        } else {
            listaPersonas.add(persona);
            System.out.println("Persona agregada a la lista: " + persona.getNombre());
        }
    }
}
