package com.evaluacion.EvaluacionCL1.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "especialidad")

public class Especialidad {
	@Id
	@Column(name ="idesp")
	private String	idesp;
	@Column(name = "nomesp")
	private String nomesp;
	@Column (name = "costo")
	private Double costo;	
	
}
