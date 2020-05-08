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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "pregunta")
@XmlRootElement
public class Pregunta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1079974159784869781L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pregunta")
	private Long id;
	
	@Column(name = "nombre_pregunta")
	private String nombre;
		
	@Column(name = "respuesta_pregunta")
	private String respuesta;
	
	
	
	@Column(name = "activo_pregunta")
	private Boolean activo;
	
	
	@Column(name = "crea_pregunta")
	private Date crea;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	        name = "pregunta_has_item",
	        joinColumns = {@JoinColumn(name = "pregunta_id_pregunta")},
	        inverseJoinColumns = {@JoinColumn(name="item_id_item")}
	)
	private List<Item> listaItems;
	
	@ManyToMany(mappedBy = "listaPreguntas",fetch = FetchType.LAZY)
    @JsonBackReference
	private List<Categoria> listaCategorias;

	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "pregunta", fetch = FetchType.LAZY)	
	private List<Respuesta> listaRespuestas;
	
	
	@JoinColumn(name = "peso_id_peso", referencedColumnName = "id_peso")
	@ManyToOne(optional = false)
	private Peso peso;

	
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


	public String getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
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


	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}


	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}


	public List<Item> getListaItems() {
		return listaItems;
	}


	public void setListaItems(List<Item> listaItems) {
		this.listaItems = listaItems;
	}


}
