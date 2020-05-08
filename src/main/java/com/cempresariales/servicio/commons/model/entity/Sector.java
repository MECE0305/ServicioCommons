package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Sector implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3206361673653902900L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_area")
	private Long id;

	@Column(name = "nombre_area")
	private String nombre;
	
	@Column(name = "descripcion_area")
	private String descripcion;
	
	@Column(name = "crea_area")
	private Date crea;

	@Column(name = "actualiza_area")
	private Date actualiza;	
	
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "sector", fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Empresa> listaEmpresas;

}
