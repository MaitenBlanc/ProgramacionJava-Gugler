package com.gugler.sgc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gugler.sgc.dao.AlumnoRepository;
import com.gugler.sgc.dao.CursoRepository;
import com.gugler.sgc.dao.ProfesorRepository;
import com.gugler.sgc.dto.CursoDTO;
import com.gugler.sgc.modelo.Alumno;
import com.gugler.sgc.modelo.Curso;
import com.gugler.sgc.modelo.Profesor;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Curso> findAllCourses() {
        return cursoRepository.findAll();
    }

    public Curso saveCourse(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deleteCourse(Long id) {
        cursoRepository.deleteById(id);
    }

    public Curso saveCurso(CursoDTO cursoDTO) {
        Curso curso = new Curso();
        curso.setCodigo(cursoDTO.codigo);
        curso.setNombre(cursoDTO.nombre);
        curso.setCupo(cursoDTO.cupo);

        if (cursoDTO.profesorId != null) {
            Profesor p = profesorRepository.findById(cursoDTO.profesorId).orElse(null);
            curso.setProfesores(p);
        }

        return cursoRepository.save(curso);
    }

    public String registerStudent(Long cursoId, Long alumnoId) {
        Curso curso = cursoRepository.findById(cursoId).orElseThrow();
        Alumno alumno = alumnoRepository.findById(alumnoId).orElseThrow();

        if (curso.admiteInscripciones()) {
            curso.getAlumnos().add(alumno);
            cursoRepository.save(curso);
            return "Inscripción exitosa";
        } else {
            return "No hay cupo disponible para este curso";
        }
    }
}
