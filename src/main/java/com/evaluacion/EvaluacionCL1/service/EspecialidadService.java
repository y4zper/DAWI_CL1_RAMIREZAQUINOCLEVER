package com.evaluacion.EvaluacionCL1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.EvaluacionCL1.model.bd.Especialidad;
import com.evaluacion.EvaluacionCL1.repository.EspecialidadRepository;

@Service
public class EspecialidadService {
	
	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> listarEspecialidad(){
		return especialidadRepository.findAll();
	}
	
	public void registrarEspecialidad(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}	
}
