package ar.com.gugler.examenFinal;

public class Persona {
    private int dni;
    private String apellido;
    private String nombre;

    public Persona(int dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + "]";
    }

}
