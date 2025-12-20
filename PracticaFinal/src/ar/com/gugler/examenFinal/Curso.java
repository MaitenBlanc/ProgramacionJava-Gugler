package ar.com.gugler.examenFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Alumno> alumnos;

    public Curso(String nombre, List<Alumno> alumnos) {
        this.nombre = nombre;

        if (alumnos == null) {
            this.alumnos = new ArrayList<>();
        } else {
            this.alumnos = alumnos;
        }
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

    public void addStudent(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void deleteStudent(Alumno alumno) {
        this.alumnos.remove(alumno);
    }

    // metodo que permite mostar los alumnos ordenados por promedio
    public void listarAlumnosPorPromedio() {
        List<Alumno> orderedlist = new ArrayList<>(this.alumnos);

        Collections.sort(orderedlist, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                try {
                    return Double.compare(a2.getPromedio(), a1.getPromedio());
                } catch (Exception e) {
                    return 0;
                }
            }
        });

        for (Alumno a : orderedlist) {
            try {
                System.out.println(a.toString() + " - Promedio " + a.getPromedio());
            } catch (Exception e) {
                System.out.println(a.toString() + " - " + e.getMessage());
            }
            
        }
    }

    // método que permite saber los alumnos aprobados y desaprobados, teniendo en cuenta que se aprueba con un promedio de 80 y todos los parciales mayores a 70
    public void ListarAlumnosAprobados() {
        System.out.println("Alumnos aprobados: ");
        for (Alumno a : alumnos) {
            if (a.isApproved()) {
                System.out.println(a.toString());
            }
        }
    }

    public void ListarAlumnosDesaprobados() {
        System.out.println("Alumnos desaprobados: ");
        for (Alumno a : alumnos) {
            if (!a.isApproved()) {
                System.out.println(a.toString());
            } 
        }
    }
}
