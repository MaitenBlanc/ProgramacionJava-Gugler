package com.gugler.sgc.dto;

public class AsignaturaDTO {
    public Long id;
    public Integer codigo;
    public String nombre;
    public Long profesorId;

    // De Curso y Materia (lo hago así para facilitar el mapeo)
    public Integer cupo;
    public Integer anio;

    public AsignaturaDTO() {
    }

}
