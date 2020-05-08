package com.cempresariales.servicio.commons.model.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "respuesta")
@XmlRootElement
public class Respuesta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7389882994265761648L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_respuesta")
	private Long id;
	
	@Column(name = "id_evaluacion")
	private Long idEvaluacion;
	
	@Column(name = "cumple_respuesta")
	private Boolean cumple;
	
	@OneToOne(mappedBy = "respuesta")
    private Checklist check;
	
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "respuesta", fetch = FetchType.LAZY)
	@JsonBackReference
	private List<RespuestaItems> listaRespuestaItems;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdEvaluacion() {
		return idEvaluacion;
	}

	public void setIdEvaluacion(Long idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}

	public Boolean getCumple() {
		return cumple;
	}

	public void setCumple(Boolean cumple) {
		this.cumple = cumple;
	}

	public Checklist getCheck() {
		return check;
	}

	public void setCheck(Checklist check) {
		this.check = check;
	}

	public List<RespuestaItems> getListaRespuestaItems() {
		return listaRespuestaItems;
	}

	public void setListaRespuestaItems(List<RespuestaItems> listaRespuestaItems) {
		this.listaRespuestaItems = listaRespuestaItems;
	}

	
}
