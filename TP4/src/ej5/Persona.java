package ej5;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected long edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, long edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String mostrarInformacion() {
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEdad: " + this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
    }

}
