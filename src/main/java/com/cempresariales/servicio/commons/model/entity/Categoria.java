package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "categoria")
@XmlRootElement
public class Categoria implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8809724731282786776L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private Long id;
	
	@Column(name = "nombre_categoria")
	private String nombre;

	@Column(name = "activo_categoria")
	private Boolean activo;

	@Column(name = "crea_categoria")
	private Date crea;
	
	/*@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "listaCategorias")
	@JsonBackReference
	private List<Evaluacion> listaEvaluaciones;*/
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, targetEntity = Evaluacion.class)
	@JoinTable(
	        name = "evaluacion_has_categoria",
	        joinColumns = {@JoinColumn(name = "id_categoria")},
	        inverseJoinColumns = {@JoinColumn(name="id_evaluacion")}
	)
//	@JsonManagedReference
	private List<Evaluacion> listaEvaluaciones;


	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "listaCategorias")
	@JsonBackReference
	private List<Pregunta> listaPreguntas;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Date getCrea() {
		return crea;
	}

	public void setCrea(Date crea) {
		this.crea = crea;
	}

	public List<Evaluacion> getListaEvaluaciones() {
		return listaEvaluaciones;
	}

	public void setListaEvaluaciones(List<Evaluacion> listaEvaluaciones) {
		this.listaEvaluaciones = listaEvaluaciones;
	}

	public List<Pregunta> getListaPreguntas() {
		return listaPreguntas;
	}

	public void setListaPreguntas(List<Pregunta> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}	
	
}
