package ej5;

public class Profesor extends Persona {

    private String catedra;
    private int aniosAntiguedad;

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellido, long edad, String catedra, int aniosAntiguedad) {
        super(nombre, apellido, edad);
        this.catedra = catedra;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public String mostrarInformacion() {
        return "Información del Profesor: \n"
                + super.mostrarInformacion()
                + "\nCatedra: " + this.catedra
                + "\nAnios Antiguedad: " + this.aniosAntiguedad;
    }
}
