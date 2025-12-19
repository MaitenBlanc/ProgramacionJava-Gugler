package com.gugler.sgc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gugler.sgc.modelo.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {

}
