/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 *
 * @author ADM-DGIP
 */
@Entity
@Table(name = "encabezado")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Encabezado.findAll", query = "SELECT e FROM Encabezado e"),
		@NamedQuery(name = "Encabezado.findByIdEncabezado", query = "SELECT e FROM Encabezado e WHERE e.idEncabezado = :idEncabezado"),
		@NamedQuery(name = "Encabezado.findByNombreEncabezado", query = "SELECT e FROM Encabezado e WHERE e.nombreEncabezado = :nombreEncabezado"),
		@NamedQuery(name = "Encabezado.findByActivoEncabezado", query = "SELECT e FROM Encabezado e WHERE e.activoEncabezado = :activoEncabezado") })
public class Encabezado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "id_encabezado")
	private Integer idEncabezado;
	@Column(name = "nombre_encabezado")
	private String nombreEncabezado;
	@Column(name = "activo_encabezado")
	private Boolean activoEncabezado;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "encabezado")
	@JsonBackReference
	private List<EvaluacionHasEncabezado> evaluacionHasEncabezadoList;

	public Encabezado() {
	}

	public Encabezado(Integer idEncabezado) {
		this.idEncabezado = idEncabezado;
	}

	public Integer getIdEncabezado() {
		return idEncabezado;
	}

	public void setIdEncabezado(Integer idEncabezado) {
		this.idEncabezado = idEncabezado;
	}

	public String getNombreEncabezado() {
		return nombreEncabezado;
	}

	public void setNombreEncabezado(String nombreEncabezado) {
		this.nombreEncabezado = nombreEncabezado;
	}

	public Boolean getActivoEncabezado() {
		return activoEncabezado;
	}

	public void setActivoEncabezado(Boolean activoEncabezado) {
		this.activoEncabezado = activoEncabezado;
	}

	@XmlTransient
	public List<EvaluacionHasEncabezado> getEvaluacionHasEncabezadoList() {
		return evaluacionHasEncabezadoList;
	}

	public void setEvaluacionHasEncabezadoList(List<EvaluacionHasEncabezado> evaluacionHasEncabezadoList) {
		this.evaluacionHasEncabezadoList = evaluacionHasEncabezadoList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idEncabezado != null ? idEncabezado.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Encabezado)) {
			return false;
		}
		Encabezado other = (Encabezado) object;
		if ((this.idEncabezado == null && other.idEncabezado != null)
				|| (this.idEncabezado != null && !this.idEncabezado.equals(other.idEncabezado))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "javaapplication1.Encabezado[ idEncabezado=" + idEncabezado + " ]";
	}

}
