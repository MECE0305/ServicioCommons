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
	
	@Column(name = "peso")
	private String peso;	
	
	@Column(name = "porcentaje")
	private String porcentaje;
	
	@Column(name = "valor")
	private String valor;
	
	@Column(name = "activo_pregunta")
	private Boolean activo;
	
	
	@Column(name = "crea_pregunta")
	private Date crea;
	
	
	@ManyToMany(mappedBy = "listaPreguntas",targetEntity = Item.class)
	private List<Item> listaItems;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, targetEntity = Categoria.class)
	@JoinTable(
	        name = "categoria_has_pregunta",
	        joinColumns = {@JoinColumn(name = "categoria_id_categoria")},
	        inverseJoinColumns = {@JoinColumn(name="pregunta_id_pregunta")}
	)	
	@JsonBackReference
	private List<Categoria> listaCategorias;

	
	/*@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "listaPreguntas")
	private List<Categoria> listaCategoria;

	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, targetEntity = Categoria.class)
	@JoinTable(
	        name = "categoria_has_pregunta",
	        joinColumns = {@JoinColumn(name = "categoria_id_categoria")},
	        inverseJoinColumns = {@JoinColumn(name="pregunta_id_pregunta")}
	)
	@JsonManagedReference
	private List<Categoria	> listaCategorias;
	
	@OneToMany
	@JoinColumn(name = "pregunta_id_pregunta")
	private List<Respuesta> listaRespuestas;
	*/
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pregunta")
	private List<Respuesta> listaRespuestas;
	
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


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
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


	public List<Item> getListaItems() {
		return listaItems;
	}


	public void setListaItems(List<Item> listaItems) {
		this.listaItems = listaItems;
	}


	public List<Respuesta> getListaRespuestas() {
		return listaRespuestas;
	}


	public void setListaRespuestas(List<Respuesta> listaRespuestas) {
		this.listaRespuestas = listaRespuestas;
	}


	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}


	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}


	
	
	/*
	 
	  public List<Respuesta> getListaRespuestas() {
		return listaRespuestas;
	}

	public void setListaRespuestas(List<Respuesta> listaRespuestas) {
		this.listaRespuestas = listaRespuestas;
	}
	
	 public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}


	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}*/


	

	
}
