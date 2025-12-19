package com.gugler.sgc.modelo;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesores")
@PrimaryKeyJoinColumn(name = "id")
public class Profesor extends Persona {
    private String cuil; 
    private LocalDate fechaIngreso;

    public Profesor() {
    }
    
    public Profesor(String cuil, LocalDate fechaIngreso, String numeroDocumento, String apellido, String nombres, LocalDate fechaNacimiento, String domicilio, String telefono, String correoElectronico) {
        super(numeroDocumento, apellido, nombres, fechaNacimiento, domicilio, telefono, correoElectronico);
        this.cuil = cuil;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String mostrarInformacion() {
        return this.getNombres() + " " + this.getApellido().toUpperCase() + 
                " - CUIL: " + this.getCuil();
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesor [cuil=" + cuil +
                "fecha Ingreso=" + fechaIngreso + 
                ", " + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.cuil);
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
        final Profesor other = (Profesor) obj;
        return Objects.equals(this.cuil, other.cuil);
    }

    
}
