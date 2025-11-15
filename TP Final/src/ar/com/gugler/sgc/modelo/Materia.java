package ar.com.gugler.sgc.modelo;

import java.util.Objects;

public class Materia extends Asignatura {
    private Integer anio;

    public Materia(Integer anio, Integer codigo, String nombre, Profesor profesores) {
        super(codigo, nombre, profesores);
        this.anio = anio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Materia " + 
                "[anio=" + anio + 
                ", " + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.anio);
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
        final Materia other = (Materia) obj;
        return Objects.equals(this.anio, other.anio);
    }

}
