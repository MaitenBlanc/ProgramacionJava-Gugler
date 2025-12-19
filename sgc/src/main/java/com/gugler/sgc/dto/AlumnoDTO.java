package com.gugler.sgc.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AlumnoDTO {
    public Long id;

    @NotBlank(message="El número de documento es obligatorio")
    @Size(min = 7, max = 10, message="El número de documento debe tener entre 7 y 10 caracteres")
    public String numeroDocumento;

    @NotBlank(message="El apellido es obligatorio")
    @Size(min = 2, max = 50, message = "El apellido debe tener entre 2 y 50 caracteres")
    public String apellido;

    @NotBlank(message="Los nombres son obligatorios")
    public String nombres;

    @NotNull(message="La fecha de nacimiento es obligatoria")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    public LocalDate fechaNacimiento;

    public String domicilio;
    public String telefono;

    @Email(message = "Debe ingresar un formato de correo válido")
    public String correoElectronico;

    @NotBlank(message="El legajo es obligatorio")
    public String legajo;

    public AlumnoDTO() {
    }
}
