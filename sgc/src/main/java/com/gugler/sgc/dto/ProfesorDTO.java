package com.gugler.sgc.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProfesorDTO {
    public Long id;

    @NotBlank(message="El cuil es obligatorio")
    public String cuil;

    @NotNull(message="La fecha de ingreso es obligatoria")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    public LocalDate fechaIngreso;

    @NotBlank(message="El número de documento es obligatorio")
    @Size(min = 7, max = 10, message="El número de documento debe tener entre 7 y 10 caracteres")
    public String numeroDocumento;

    @NotBlank(message="El apellido es obligatorio")
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

    public ProfesorDTO() {
    }
}
