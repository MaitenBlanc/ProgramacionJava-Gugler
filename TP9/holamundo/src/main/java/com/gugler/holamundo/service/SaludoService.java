package com.gugler.holamundo.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String obtenerSaludo(){
        return "Hola Mundo desde servicio!";
    }

    public String obtenerSaludoPersonalizado(String nombre) {
        return "Hola " + nombre + "!";
    }
}
