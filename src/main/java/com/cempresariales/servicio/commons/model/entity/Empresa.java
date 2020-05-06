package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "empresa")
@XmlRootElement
public class Empresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6792353500044096793L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa")
	private Long id;

	@Column(name = "nombre_empresa")
	private String nombre;

	@Column(name = "activo_empresa")
	private Boolean activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "crea_empresa")
	private Date crea;

		
	@JoinTable(name = "empresa_has_region", joinColumns = {
			@JoinColumn(name = "empresa_id_empresa", referencedColumnName = "id_empresa") }, inverseJoinColumns = {
					@JoinColumn(name = "region_id_region", referencedColumnName = "id_region") })
	@ManyToMany(fetch = FetchType.LAZY)	
	private List<Region> listaRegiones;
	
	@JoinColumn(name = "cliente_id_cliente", referencedColumnName = "id_cliente")
	@ManyToOne(optional = false)
	@JsonBackReference
	private Cliente cliente;

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@XmlTransient
	public List<Region> getListaRegiones() {
		return listaRegiones;
	}

	public void setListaRegiones(List<Region> listaRegiones) {
		this.listaRegiones = listaRegiones;
	}

	

}
