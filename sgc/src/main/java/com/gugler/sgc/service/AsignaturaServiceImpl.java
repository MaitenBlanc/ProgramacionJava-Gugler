package com.gugler.sgc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gugler.sgc.dao.AlumnoRepository;
import com.gugler.sgc.dao.CursoRepository;
import com.gugler.sgc.dao.MateriaRepository;
import com.gugler.sgc.modelo.Alumno;
import com.gugler.sgc.modelo.Asignatura;
import com.gugler.sgc.modelo.Curso;
import com.gugler.sgc.modelo.Materia;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

    private CursoRepository cursoRepository;
    private MateriaRepository materiaRepository;
    private AlumnoRepository alumnoRepository;

    @Autowired
    public AsignaturaServiceImpl(CursoRepository cursoRepository, MateriaRepository materiaRepository, AlumnoRepository alumnoRepository) {
        this.cursoRepository = cursoRepository;
        this.materiaRepository = materiaRepository;
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public List<Curso> courseList() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso saveCourse(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Optional<Curso> findCourseBy(Long id) {
        return cursoRepository.findById(id);
    }

    @Override
    public void deleteCourse(Long id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public List<Materia> subjectList() {
        return materiaRepository.findAll();
    }

    @Override
    public Materia saveSubject(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Optional<Materia> findSubjectBy(Long id) {
        return materiaRepository.findById(id);
    }

    @Override
    public void deleteSubject(Long id) {
        materiaRepository.deleteById(id);
    }

    @Override
    public void registerStudent(Long asignaturaId, Long alumnoId, String tipo) throws Exception {
        // Buscar alumno
        Alumno alumno = alumnoRepository.findById(alumnoId)
            .orElseThrow(() -> new Exception("Alumno no encontrado"));

        Asignatura asignatura = null;

        // Buscar asignatura según el tipo (curso o materia)
        if ("CURSO".equalsIgnoreCase(tipo)) {
            Curso curso = cursoRepository.findById(asignaturaId)
                .orElseThrow(() -> new Exception("Curso no encontrado"));
            
            if (curso.admiteInscripciones()) {
                curso.getAlumnos().add(alumno);
                cursoRepository.save(curso);
                asignatura = curso;
            } else {
                throw new Exception("No hay cupo disponible para este curso");
            }
        } else if ("MATERIA".equalsIgnoreCase(tipo)) {
            asignatura = materiaRepository.findById(asignaturaId)
                .orElseThrow(() -> new Exception("Materia no encontrada"));
        } else {
            throw new Exception("Tipo de asignatura no válido");
        }

        // Validar si alumno está instripto
        if (asignatura.getAlumnos().contains(alumno)) {
            throw new Exception("Alumno ya está inscripto en esta asignatura");
        }
        
        // Agregar alumno
        asignatura.getAlumnos().add(alumno);
        
        if (asignatura instanceof Curso curso) {
            cursoRepository.save(curso);
        } else {
            materiaRepository.save((Materia) asignatura);
        }
    }

}
