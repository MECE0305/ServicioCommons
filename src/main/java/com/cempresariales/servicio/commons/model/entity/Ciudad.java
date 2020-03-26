package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ciudad")
@XmlRootElement
public class Ciudad implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5531530191690443983L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ciudad")
	private Long id;
	
	@Column(name = "nombre_ciudad")
	private String nombre;
	
	@Column(name = "activo_ciudad")
	private Boolean activo;
	
	@Column(name = "crea_ciudad")
	private Date crea;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudad")
	private List<Agencia> listaAgencias;
	
	@JoinColumn(name = "provincia_id_provincia", referencedColumnName = "id_provincia")
	@ManyToOne(optional = false)
	@JsonBackReference
	private Provincia provincia;

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

	public List<Agencia> getListaAgencias() {
		return listaAgencias;
	}

	public void setListaAgencias(List<Agencia> listaAgencias) {
		this.listaAgencias = listaAgencias;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	

}
