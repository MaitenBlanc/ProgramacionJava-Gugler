package com.gugler.sgc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gugler.sgc.dao.ProfesorRepository;
import com.gugler.sgc.modelo.Profesor;

@Service
public class ProfesorServiceImpl extends PersonaServiceImpl<Profesor, ProfesorRepository> implements ProfesorService {

    @Autowired
    public ProfesorServiceImpl(ProfesorRepository repository) {
        super(repository);
    }
}
