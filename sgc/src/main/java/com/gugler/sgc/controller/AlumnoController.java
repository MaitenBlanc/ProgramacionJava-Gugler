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

import com.gugler.sgc.dto.AlumnoDTO;
import com.gugler.sgc.modelo.Alumno;
import com.gugler.sgc.service.AlumnoService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;
    
    @Autowired
    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @Operation(summary = "Listar todos los alumnos")
    @GetMapping
    public List<Alumno> studentList() {
        return alumnoService.findAll();
    }

    @Operation(summary = "Obtener un alumno por id")
    @GetMapping("/{id}")
    public ResponseEntity<Alumno> findStudentById(@PathVariable("id") Long id) {
        return alumnoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Crear un alumno")
    @PostMapping
    public ResponseEntity<Long> createStudent(@Valid @RequestBody AlumnoDTO alumno) {
        Alumno newStudent = new Alumno();
        newStudent.setNumeroDocumento(alumno.numeroDocumento);
        newStudent.setApellido(alumno.apellido);
        newStudent.setNombres(alumno.nombres);
        newStudent.setFechaNacimiento(alumno.fechaNacimiento);
        newStudent.setDomicilio(alumno.domicilio);
        newStudent.setTelefono(alumno.telefono);
        newStudent.setCorreoElectronico(alumno.correoElectronico);
        newStudent.setLegajo(alumno.legajo);

        Alumno saved = this.alumnoService.save(newStudent);
        return ResponseEntity.ok(saved.getId());
    }

    @Operation(summary = "Actualizar un alumno")
    @PutMapping("/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Long id, @Valid @RequestBody AlumnoDTO alumnoDTO) {
        Optional<Alumno> alumnoOpt = alumnoService.findById(id);
        if (alumnoOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Alumno alumnoDb = alumnoOpt.get();
        alumnoDb.setNumeroDocumento(alumnoDTO.numeroDocumento);
        alumnoDb.setApellido(alumnoDTO.apellido);
        alumnoDb.setNombres(alumnoDTO.nombres);
        alumnoDb.setFechaNacimiento(alumnoDTO.fechaNacimiento);
        alumnoDb.setDomicilio(alumnoDTO.domicilio);
        alumnoDb.setTelefono(alumnoDTO.telefono);
        alumnoDb.setCorreoElectronico(alumnoDTO.correoElectronico);
        alumnoDb.setLegajo(alumnoDTO.legajo);

        alumnoService.save(alumnoDb);
        return ResponseEntity.ok("Alumno actualizado correctamente");
    }
}
