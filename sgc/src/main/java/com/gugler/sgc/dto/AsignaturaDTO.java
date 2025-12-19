package com.gugler.sgc.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AsignaturaDTO {
    public Long id;

    @NotNull(message="El código es obligatorio")
    public Integer codigo;

    @NotBlank(message="El nombre es obligatorio")
    public String nombre;
    
    public Long profesorId;

    // De Curso y Materia (lo hago así para facilitar el mapeo)
    public Integer cupo;
    public Integer anio;

    public AsignaturaDTO() {
    }

}
