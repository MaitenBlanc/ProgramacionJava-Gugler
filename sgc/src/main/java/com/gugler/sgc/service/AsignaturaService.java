package com.gugler.sgc.service;

import com.gugler.sgc.modelo.Curso;
import com.gugler.sgc.modelo.Materia;

import java.util.List;
import java.util.Optional;

public interface AsignaturaService {
    List<Curso> courseList();
    Curso saveCourse(Curso curso);
    Optional<Curso> findCourseBy(Long id);
    void deleteCourse(Long id);

    List<Materia> subjectList();
    Materia saveSubject(Materia materia);
    Optional<Materia> findSubjectBy(Long id);
    void deleteSubject(Long id);

    void registerStudent(Long asignaturaId, Long alumnoId, String tipo) throws Exception;
}
