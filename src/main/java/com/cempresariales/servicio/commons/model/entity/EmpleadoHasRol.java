/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author ADM-DGIP
 */
@Entity
@Table(name = "empleado_has_rol")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EmpleadoHasRol.findAll", query = "SELECT c FROM ChecklistHasEvaluacion c"),
		@NamedQuery(name = "EmpleadoHasRol.findByEmpleadoIdEmpleado", query = "SELECT c FROM EmpleadoHasRol c WHERE c.empleadoHasRolPK.empleadoIdEmpleado = :empleadoIdEmpleado"),
		@NamedQuery(name = "EmpleadoHasRol.findByRolIdRol", query = "SELECT c FROM EmpleadoHasRol c WHERE c.empleadoHasRolPK.rolIdRol = :rolIdRol") })
public class EmpleadoHasRol implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected EmpleadoHasRolPK empleadoHasRolPK;
	@JoinColumn(name = "empleado_id_empleado", referencedColumnName = "id_empleado", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	@JsonIgnore
	private Empleado empleado;
	@JoinColumn(name = "rol_id_rol", referencedColumnName = "id_rol", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	@JsonIgnore
	private Rol rol;
	@Column(name = "activo")
	private Boolean activo;

	public EmpleadoHasRolPK getEmpleadoHasRolPK() {
		return empleadoHasRolPK;
	}

	public void setEmpleadoHasRolPK(EmpleadoHasRolPK empleadoHasRolPK) {
		this.empleadoHasRolPK = empleadoHasRolPK;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (empleadoHasRolPK != null ? empleadoHasRolPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof EmpleadoHasRol)) {
			return false;
		}
		EmpleadoHasRol other = (EmpleadoHasRol) object;
		if ((this.empleadoHasRolPK == null && other.empleadoHasRolPK != null)
				|| (this.empleadoHasRolPK != null && !this.empleadoHasRolPK.equals(other.empleadoHasRolPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EmpleadoHasRol[ EmpleadoHasRolPK=" + empleadoHasRolPK + " ]";
	}

}
