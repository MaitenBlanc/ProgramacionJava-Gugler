package com.gugler.sgc.service;

import java.util.List;
import java.util.Optional;

import com.gugler.sgc.modelo.Persona;

public interface PersonaService<T extends Persona> {
    List<T> findAll();
    Optional<T> findById(Long id);
    T save(T persona);
    void delete(Long id);
}
