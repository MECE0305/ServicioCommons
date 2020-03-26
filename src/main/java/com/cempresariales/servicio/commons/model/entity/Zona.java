package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "zona")
@XmlRootElement
public class Zona implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3368482645814064676L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_zona")
	private Long id;
	
	@Column(name = "nombre_zona")
	private String nombre;
	
	@Column(name = "activo_zona")
	private Boolean activo;
	
	@Column(name = "crea_zona")
	private Date crea;

	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, targetEntity = Region.class)
	@JoinTable(
	        name = "region_has_zona",
	        joinColumns = {@JoinColumn(name = "region_id_region")},
	        inverseJoinColumns = {@JoinColumn(name="zona_id_zona")}
	)	
	@JsonBackReference	
	private List<Region> listaRegiones;
	
	
	@ManyToMany(mappedBy = "listaZonas",targetEntity = Provincia.class)
	private List<Provincia> listaProvincias;
	
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

	public List<Region> getListaRegiones() {
		return listaRegiones;
	}

	public void setListaRegiones(List<Region> listaRegiones) {
		this.listaRegiones = listaRegiones;
	}

	public List<Provincia> getListaProvincias() {
		return listaProvincias;
	}

	public void setListaProvincias(List<Provincia> listaProvincias) {
		this.listaProvincias = listaProvincias;
	}

	
	
}
