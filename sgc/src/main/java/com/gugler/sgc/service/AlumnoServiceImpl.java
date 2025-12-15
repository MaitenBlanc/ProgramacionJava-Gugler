package com.gugler.sgc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gugler.sgc.dao.AlumnoRepository;
import com.gugler.sgc.modelo.Alumno;

@Service
public class AlumnoServiceImpl extends PersonaServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {
    
    @Autowired
    public AlumnoServiceImpl(AlumnoRepository repository) {
        super(repository);
    }

}
