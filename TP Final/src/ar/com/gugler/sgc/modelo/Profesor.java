package ar.com.gugler.sgc.modelo;

import java.util.Date;
import java.util.Objects;

public class Profesor extends Persona {
    private String cuil; 
    private Date fechaIngreso;

    public Profesor(String cuil, Date fechaIngreso, String numeroDocumento, String apellido, String nombres, Date fechaNacimiento, String domicilio, String telefono, String correoElectronico) {
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
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
