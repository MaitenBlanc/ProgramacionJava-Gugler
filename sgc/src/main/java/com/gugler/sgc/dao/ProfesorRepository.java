package com.gugler.sgc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gugler.sgc.modelo.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

}
