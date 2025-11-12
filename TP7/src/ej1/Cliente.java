package ej1;

public class Cliente implements Comparable<Cliente> {
    private String nombre;
    private int dni;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
    }

    @Override
    public int compareTo(Cliente o) {
        return Integer.compare(this.dni, o.getDni());
    }

    
}
