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

import com.gugler.sgc.dto.ProfesorDTO;
import com.gugler.sgc.modelo.Profesor;
import com.gugler.sgc.service.ProfesorService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @Operation(summary = "Listar todos los profesores")
    @GetMapping
    public List<Profesor> profesorList() {
        return this.profesorService.findAll();
    }

    @Operation(summary = "Obtener un profesor por id")
    @GetMapping("/{id}")
    public Optional<Profesor> findProfesorById(@PathVariable("id") Long id) {
        return this.profesorService.findById(id);
    }

    @Operation(summary = "Crear un profesor")
    @PostMapping
    public ResponseEntity<Profesor> crear(@RequestBody ProfesorDTO profesorDTO) {
        Profesor p = new Profesor();
        p.setNombres(profesorDTO.nombres);
        p.setApellido(profesorDTO.apellido);
        p.setNumeroDocumento(profesorDTO.numeroDocumento);
        p.setFechaNacimiento(profesorDTO.fechaNacimiento);
        p.setDomicilio(profesorDTO.domicilio);
        p.setTelefono(profesorDTO.telefono);
        p.setCorreoElectronico(profesorDTO.correoElectronico);
        p.setCuil(profesorDTO.cuil);
        p.setFechaIngreso(profesorDTO.fechaIngreso);

        Profesor guardado = profesorService.save(p);
        return ResponseEntity.ok(guardado);
    }

    @Operation(summary = "Actualizar un profesor")
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody ProfesorDTO profesorDTO) {
        Optional<Profesor> profesorOpt = profesorService.findById(id);
        if (profesorOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Profesor p = profesorOpt.get();
        p.setNumeroDocumento(profesorDTO.numeroDocumento);
        p.setApellido(profesorDTO.apellido);
        p.setNombres(profesorDTO.nombres);
        p.setFechaNacimiento(profesorDTO.fechaNacimiento);
        p.setDomicilio(profesorDTO.domicilio);
        p.setTelefono(profesorDTO.telefono);
        p.setCorreoElectronico(profesorDTO.correoElectronico);
        p.setCuil(profesorDTO.cuil);
        p.setFechaIngreso(profesorDTO.fechaIngreso);

        profesorService.save(p);
        return ResponseEntity.ok("Profesor actualizado");
    }
}
