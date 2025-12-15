package com.gugler.sgc.modelo;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn(name = "id")
public class Alumno extends Persona {
    private String legajo;

    public Alumno() {
    }
    
    public Alumno(String legajo, String numeroDocumento, String apellido, String nombres, Date fechaNacimiento, String domicilio, String telefono, String correoElectronico) {
        super(numeroDocumento, apellido, nombres, fechaNacimiento, domicilio, telefono, correoElectronico);
        this.legajo = legajo;
    }
    
    @Override
    public String mostrarInformacion() {
        return this.getNombres() + " " + this.getApellido() + 
                " - DNI: " + this.getNumeroDocumento();
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Alumno [" + 
                "legajo=" + legajo + 
                ", " + super.toString() +
                "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.legajo);
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
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.legajo, other.legajo);
    }

    
}
