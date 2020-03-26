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
@Table(name = "item")
@XmlRootElement
public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8122974281322465013L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item")
	private Long id;
	
	@Column(name = "nombre_item")
	private String nombre;
	
	@Column(name = "activo_item")
	private Boolean activo;
	
	
	@Column(name = "crea_item")
	private Date crea;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, targetEntity = Pregunta.class)
	@JoinTable(
	        name = "pregunta_has_item",
	        joinColumns = {@JoinColumn(name = "pregunta_id_pregunta")},
	        inverseJoinColumns = {@JoinColumn(name="item_id_item")}
	)	
	@JsonBackReference
	private List<Pregunta> listaPreguntas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pregunta> getListaPreguntas() {
		return listaPreguntas;
	}

	public void setListaPreguntas(List<Pregunta> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}	
	
}
