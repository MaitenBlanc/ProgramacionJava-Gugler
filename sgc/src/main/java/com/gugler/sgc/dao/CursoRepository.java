package com.gugler.sgc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gugler.sgc.modelo.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
