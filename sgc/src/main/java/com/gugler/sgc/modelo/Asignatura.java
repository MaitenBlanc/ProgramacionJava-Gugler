package com.gugler.sgc.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "asignaturas")
public class Asignatura {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long id;

    private Integer codigo;
    private String nombre;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
        name = "asignatura_alumnos",
        joinColumns = @JoinColumn(name = "asignatura_id"),
        inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    private List<Alumno> alumnos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesores;

    public Asignatura() {
    }

    public Asignatura(Integer codigo, String nombre, Profesor profesores) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.profesores = profesores;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Profesor getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return "Asignatura " +
                "[codigo=" + codigo + 
                ", nombre=" + nombre + 
                ", alumnos=" + alumnos.size() + 
                ", profesores=" + profesores + "]";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.codigo);
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
        final Asignatura other = (Asignatura) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

}
