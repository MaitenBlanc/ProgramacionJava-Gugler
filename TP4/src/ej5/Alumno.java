package ej5;

public class Alumno extends Persona {

    private long nroLegajo;
    private int anioInscripcion;

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String apellido, long edad, long nroLegajo, int anioInscripcion) {
        super(nombre, apellido, edad);
        this.nroLegajo = nroLegajo;
        this.anioInscripcion = anioInscripcion;
    }

    public long getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(long nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public int getAnioInscripcion() {
        return anioInscripcion;
    }

    public void setAnioInscripcion(int anioInscripcion) {
        this.anioInscripcion = anioInscripcion;
    }

    @Override
    public String mostrarInformacion() {

        return "Información del Alumno: \n"
                + super.mostrarInformacion()
                + "\nNúmero de legajo: " + this.nroLegajo
                + "\nAño de inscripción: " + this.anioInscripcion;
    }

}
