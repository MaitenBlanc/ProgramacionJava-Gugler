package ar.com.gugler.sgc.modelo;

import java.util.Objects;

public class Curso extends Asignatura implements Administrable {
    private Integer cupo;

    public Curso(Integer cupo, Integer codigo, String nombre, Profesor profesores) {
        super(codigo, nombre, profesores);
        this.cupo = cupo;
    }

    public void agregarAlumno(Alumno alumno) {
        this.getAlumnos().add(alumno);    
    }

    public void eliminarAlumno(Alumno alumno) {
        this.getAlumnos().remove(alumno);    
    }

    public Integer getCupo() {
        return cupo;
    }

    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    @Override
    public String toString() {
        return "Curso " + 
                "[cupo=" + cupo + 
                ", " + super.toString() +"]";
    }

    @Override
    public boolean admiteInscripciones() {
        return this.getAlumnos().size() < this.cupo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.cupo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        return Objects.equals(this.cupo, other.cupo);
    }
    

}
