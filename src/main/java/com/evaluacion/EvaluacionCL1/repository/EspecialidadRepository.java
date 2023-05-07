package com.evaluacion.EvaluacionCL1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.EvaluacionCL1.model.bd.Especialidad;

@Repository
public interface EspecialidadRepository
	extends JpaRepository<Especialidad, String>{

}
