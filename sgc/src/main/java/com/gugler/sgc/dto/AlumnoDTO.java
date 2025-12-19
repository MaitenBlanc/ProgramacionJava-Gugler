package com.gugler.sgc.dto;

import java.time.LocalDate;

public class AlumnoDTO {
    public Long id;
    public String numeroDocumento;
    public String apellido;
    public String nombres;
    public LocalDate fechaNacimiento;
    public String domicilio;
    public String telefono;
    public String correoElectronico;
    public String legajo;

    public AlumnoDTO() {
    }
}
