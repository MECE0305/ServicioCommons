package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Checklist implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1069309521297349557L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_checklist")
	private Long id;
	
	@JoinColumn(name = "agenciaRol_id_agenciaRol", referencedColumnName = "id_agenciaRol")
	@ManyToOne(optional = false)
	private AgenciaRol agenciaRol;
	
	@JoinColumn(name = "evaluacion_id_evaluacion", referencedColumnName = "id_evaluacion")
	@ManyToOne(optional = false)
	private Evaluacion evaluacion;
	
	@JoinColumn(name = "categoria_id_categoria", referencedColumnName = "id_categoria")
	@ManyToOne(optional = false)
	private Categoria categoria;
	
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "peso", fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Peso> listaPeso;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "respuesta_id_respuesta", referencedColumnName = "id_respuesta")
    private Respuesta respuesta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AgenciaRol getAgenciaRol() {
		return agenciaRol;
	}

	public void setAgenciaRol(AgenciaRol agenciaRol) {
		this.agenciaRol = agenciaRol;
	}

	public Evaluacion getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Peso> getListaPeso() {
		return listaPeso;
	}

	public void setListaPeso(List<Peso> listaPeso) {
		this.listaPeso = listaPeso;
	}

	public Respuesta getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Respuesta respuesta) {
		this.respuesta = respuesta;
	}
 
	
	
}
