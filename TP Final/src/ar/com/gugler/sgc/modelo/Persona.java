package ar.com.gugler.sgc.modelo;

import java.util.Date;
import java.util.Objects;

public abstract class Persona {
    private String numeroDocumento;
    private String apellido;
    private String nombres;
    private Date fechaNacimiento;
    private String domicilio;
    private String telefono;
    private String correoElectronico;
    
    public Persona(String numeroDocumento, String apellido, String nombres, Date fechaNacimiento, String domicilio, String telefono, String correoElectronico) {
        this.numeroDocumento = numeroDocumento;
        this.apellido = apellido;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    // Método abstracto 
    public abstract String mostrarInformacion();

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Persona [numeroDocumento=" + numeroDocumento + ", apellido=" + apellido + ", nombres=" + nombres
                + ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + ", telefono=" + telefono
                + ", correoElectronico=" + correoElectronico + "]";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.numeroDocumento);
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.numeroDocumento, other.numeroDocumento);
    }

}
