package com.gugler.sgc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gugler.sgc.dto.AsignaturaDTO;
import com.gugler.sgc.modelo.Curso;
import com.gugler.sgc.modelo.Materia;
import com.gugler.sgc.modelo.Profesor;
import com.gugler.sgc.service.AsignaturaService;
import com.gugler.sgc.service.ProfesorService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/asignaturas")
public class AsignaturaController {
    private AsignaturaService asignaturaService;
    private ProfesorService profesorService;

    @Autowired
    public AsignaturaController(AsignaturaService asignaturaService, ProfesorService profesorService) {
        this.asignaturaService = asignaturaService;
        this.profesorService = profesorService;
    }

    // Cursos
    @Operation(summary = "Listar todos los cursos")
    @GetMapping("/cursos")
    public List<Curso> cursoList() {
        return this.asignaturaService.courseList();
    }

    @Operation(summary = "Obtener un curso por id")
    @GetMapping("/cursos/{id}")
    public ResponseEntity<Curso> findCursoById(@PathVariable Long id) {
        return asignaturaService.findCourseBy(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Crear un curso")
    @PostMapping("/cursos")
    public ResponseEntity<?> createCurso(@RequestBody AsignaturaDTO asignaturaDTO) {
        Curso curso = new Curso();
        curso.setCodigo(asignaturaDTO.codigo);
        curso.setNombre(asignaturaDTO.nombre);
        curso.setCupo(asignaturaDTO.cupo);

        // Asignar profesor
        if (asignaturaDTO.profesorId != null) {
            Optional<Profesor> profesorOpt = profesorService.findById(asignaturaDTO.profesorId);
            if (profesorOpt.isPresent()) {
                curso.setProfesores(profesorOpt.get());
            } else {
                return ResponseEntity.badRequest().body("El profesor con ID " + asignaturaDTO.profesorId + " no encontrado.");
            }
        }

        Curso savedCurso = asignaturaService.saveCourse(curso);
        return ResponseEntity.ok(savedCurso);
    }

    // Materias
    @Operation(summary = "Listar todas las materias")
    @GetMapping("/materias")
    public List<Materia> materiaList() {
        return asignaturaService.subjectList();
    }

    @Operation(summary = "Obtener una materia por id")
    @GetMapping("/materia/{id}")
    public ResponseEntity<Materia> findMateriaById(@PathVariable Long id) {
        return asignaturaService.findSubjectBy(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Crear una materia")
    @PostMapping("/materias")
    public ResponseEntity<?> createMateria(@RequestBody AsignaturaDTO asignaturaDTO) {
        Materia materia = new Materia();
        materia.setCodigo(asignaturaDTO.codigo);
        materia.setNombre(asignaturaDTO.nombre);
        materia.setAnio(asignaturaDTO.anio);

        // Asignar profesor
        if (asignaturaDTO.profesorId != null) {
            Optional<Profesor> profesorOpt = profesorService.findById(asignaturaDTO.profesorId);
            if (profesorOpt.isPresent()) {
                materia.setProfesores(profesorOpt.get());
            } else {
                return ResponseEntity.badRequest().body("El profesor con ID " + asignaturaDTO.profesorId + " no encontrado.");
            }
        }

        Materia savedMateria = asignaturaService.saveSubject(materia);
        return ResponseEntity.ok(savedMateria);
    }

    @Operation(summary = "Inscribir un alumno a un curso o materia")
    @PostMapping("/{tipo}/{asignaturaId}/inscribir/{alumnoId}")
    public ResponseEntity<String> registerStudent(
        @PathVariable String tipo, 
        @PathVariable Long asignaturaId, 
        @PathVariable Long alumnoId) {
        try {
            asignaturaService.registerStudent(asignaturaId, alumnoId, tipo);
            return ResponseEntity.ok("Alumno inscrito correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error:" + e.getMessage());
        }
    }

}
