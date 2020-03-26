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
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "region")
@XmlRootElement
public class Region implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5869091894852718878L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_region")
	private Long id;
	
	@Column(name = "nombre_region")
	private String nombre;
	
	@Column(name = "activo_region")
	private Boolean activo;
	
	@Column(name = "crea_region")
	private Date crea;

	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, targetEntity = Empresa.class)
	@JoinTable(
	        name = "region_has_empresa",
	        joinColumns = {@JoinColumn(name = "region_id_region")},
	        inverseJoinColumns = {@JoinColumn(name="empresa_id_empresa")}
	)	
	@JsonBackReference	
	//@ManyToMany(mappedBy = "listaRegiones",targetEntity = Empresa.class)
	private List<Empresa> listaEmpresas;
	
	@ManyToMany(mappedBy = "listaRegiones",targetEntity = Zona.class)
	private List<Zona> listaZonas;


	
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

	public List<Zona> getListaZonas() {
		return listaZonas;
	}

	public void setListaZonas(List<Zona> listaZonas) {
		this.listaZonas = listaZonas;
	}

	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(List<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}

	
}
