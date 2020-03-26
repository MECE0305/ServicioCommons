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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "agencia")
@XmlRootElement
public class Agencia implements Serializable{


	private static final long serialVersionUID = -1400927700381934368L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agencia")
	private Long id;
		
	@Column(name = "nombre_agencia")
	private String nombre;

	@Column(name = "activo_agencia")
	private Boolean activo;

	@Column(name = "crea_agencia")
	private Date crea;
	
	@JoinColumn(name = "ciudad_id_ciudad", referencedColumnName = "id_ciudad")
	@ManyToOne(optional = false)
	@JsonBackReference
	private Ciudad ciudad;

	/*
	@ManyToMany(mappedBy = "listaAgencias",targetEntity = Rol.class)
	private List<Rol> listaRoles;*/
	
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

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	/*public List<Rol> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<Rol> listaRoles) {
		this.listaRoles = listaRoles;
	}

	*/
}
