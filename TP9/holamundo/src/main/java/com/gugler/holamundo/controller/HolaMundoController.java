package com.gugler.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gugler.holamundo.dto.SaludoRequest;
import com.gugler.holamundo.service.SaludoService;

@RestController
public class HolaMundoController {
    private final SaludoService saludoService;

    // Inyección de dependencias en el constructor
    public HolaMundoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/hola")
    public String decirHola() {
        return saludoService.obtenerSaludo();
    }

    @PostMapping("/hola")
    public String saludarConNombre(@RequestBody SaludoRequest request) {
        return saludoService.obtenerSaludoPersonalizado(request.getNombre());
    }
}
