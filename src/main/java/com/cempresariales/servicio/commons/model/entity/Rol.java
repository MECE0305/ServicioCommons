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


@Entity
@Table(name = "rol")
@XmlRootElement
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3331296271611495997L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol")
	private Long id;
		
	@Column(name = "nombre_rol")
	private String nombre;

	@Column(name = "activo_rol")
	private Boolean activo;

	@Column(name = "crea_rol")
	private Date crea;
	
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "rol", fetch = FetchType.LAZY)
	private List<Empleado> listaEmpleados;
	
	@JoinColumn(name = "agenciaRol_id_agenciaRol", referencedColumnName = "id_agenciaRol")
	@ManyToOne(optional = false)
	private AgenciaRol agenciaRol;

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

	
	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public AgenciaRol getAgenciaRol() {
		return agenciaRol;
	}

	public void setAgenciaRol(AgenciaRol agenciaRol) {
		this.agenciaRol = agenciaRol;
	}	

	
}
