package com.gugler.sgc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gugler.sgc.modelo.Persona;

public abstract class PersonaServiceImpl<T extends Persona, R extends JpaRepository<T, Long>> implements PersonaService<T> {

    protected final R repository;

    public PersonaServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public T save(T persona) {
        return repository.save(persona);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
