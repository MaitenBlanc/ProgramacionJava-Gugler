package com.gugler.sgc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gugler.sgc.modelo.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    
}
