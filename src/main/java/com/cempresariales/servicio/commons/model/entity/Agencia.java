/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 *
 * @author ADM-DGIP
 */
@Entity
@Table(name = "agencia")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Agencia.findAll", query = "SELECT a FROM Agencia a"),
		@NamedQuery(name = "Agencia.findByIdAgencia", query = "SELECT a FROM Agencia a WHERE a.agenciaPK.idAgencia = :idAgencia"),
		@NamedQuery(name = "Agencia.findByActivoAgencia", query = "SELECT a FROM Agencia a WHERE a.activoAgencia = :activoAgencia"),
		@NamedQuery(name = "Agencia.findByCreaAgencia", query = "SELECT a FROM Agencia a WHERE a.creaAgencia = :creaAgencia"),
		@NamedQuery(name = "Agencia.findByNombreAgencia", query = "SELECT a FROM Agencia a WHERE a.nombreAgencia = :nombreAgencia") })
public class Agencia implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected AgenciaPK agenciaPK;
	@Column(name = "activo_agencia")
	private Boolean activoAgencia;
	@Column(name = "ceo_agencia")
	private String ceoAgencia;
	@Column(name = "crea_agencia")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creaAgencia;
	@Column(name = "direccion_agencia")
	private String direccionAgencia;
	@Column(name = "email_agencia")
	private String emailAgencia;
	@Column(name = "id_zona_estructural")
	private Long idZonaEstructural;
	@Column(name = "nombre_agencia")
	private String nombreAgencia;
	@Column(name = "telefono_agencia")
	private String telefonoAgencia;
	@JoinColumn(name = "empresa_id_empresa", referencedColumnName = "id_empresa")
	@ManyToOne(optional = false)
	private Empresa empresaIdEmpresa;
	@JoinColumns({
			@JoinColumn(name = "zona_estructural_id_ciudad", referencedColumnName = "zona_estructural_id_ciudad", insertable = false, updatable = false)
			, @JoinColumn(name = "zona_estructural_id_zona_estructural", referencedColumnName = "zona_estructural_id_zona_estructural", insertable = false, updatable = false)})
	@ManyToOne(optional = false)
	@NotFound(action= NotFoundAction.IGNORE)
	private ZonaEstructuralHasCiudad zonaEstructuralHasCiudad;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "agencia")
	private List<Empleado> empleadoList;

	public Agencia() {
	}

	public Agencia(AgenciaPK agenciaPK) {
		this.agenciaPK = agenciaPK;
	}

	public Agencia(long idAgencia, long zonaEstructuralIdCiudad, long zonaEstructuralIdZonaEstructural) {
		this.agenciaPK = new AgenciaPK(idAgencia, zonaEstructuralIdCiudad, zonaEstructuralIdZonaEstructural);
	}

	public AgenciaPK getAgenciaPK() {
		return agenciaPK;
	}

	public void setAgenciaPK(AgenciaPK agenciaPK) {
		this.agenciaPK = agenciaPK;
	}

	public Boolean getActivoAgencia() {
		return activoAgencia;
	}

	public void setActivoAgencia(Boolean activoAgencia) {
		this.activoAgencia = activoAgencia;
	}

	public String getCeoAgencia() {
		return ceoAgencia;
	}

	public void setCeoAgencia(String ceoAgencia) {
		this.ceoAgencia = ceoAgencia;
	}

	public Date getCreaAgencia() {
		return creaAgencia;
	}

	public void setCreaAgencia(Date creaAgencia) {
		this.creaAgencia = creaAgencia;
	}

	public String getDireccionAgencia() {
		return direccionAgencia;
	}

	public void setDireccionAgencia(String direccionAgencia) {
		this.direccionAgencia = direccionAgencia;
	}

	public String getEmailAgencia() {
		return emailAgencia;
	}

	public void setEmailAgencia(String emailAgencia) {
		this.emailAgencia = emailAgencia;
	}

	public Long getIdZonaEstructural() {
		return idZonaEstructural;
	}

	public void setIdZonaEstructural(Long idZonaEstructural) {
		this.idZonaEstructural = idZonaEstructural;
	}

	public String getNombreAgencia() {
		return nombreAgencia;
	}

	public void setNombreAgencia(String nombreAgencia) {
		this.nombreAgencia = nombreAgencia;
	}

	public String getTelefonoAgencia() {
		return telefonoAgencia;
	}

	public void setTelefonoAgencia(String telefonoAgencia) {
		this.telefonoAgencia = telefonoAgencia;
	}

	public Empresa getEmpresaIdEmpresa() {
		return empresaIdEmpresa;
	}

	public void setEmpresaIdEmpresa(Empresa empresaIdEmpresa) {
		this.empresaIdEmpresa = empresaIdEmpresa;
	}

	public ZonaEstructuralHasCiudad getZonaEstructuralHasCiudad() {
		return zonaEstructuralHasCiudad;
	}

	public void setZonaEstructuralHasCiudad(ZonaEstructuralHasCiudad zonaEstructuralHasCiudad) {
		this.zonaEstructuralHasCiudad = zonaEstructuralHasCiudad;
	}

	@XmlTransient
	public List<Empleado> getEmpleadoList() {
		return empleadoList;
	}

	public void setEmpleadoList(List<Empleado> empleadoList) {
		this.empleadoList = empleadoList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (agenciaPK != null ? agenciaPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Agencia)) {
			return false;
		}
		Agencia other = (Agencia) object;
		if ((this.agenciaPK == null && other.agenciaPK != null) || (this.agenciaPK != null && !this.agenciaPK.equals(other.agenciaPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.mycompany.mavenproject1.Agencia[ agenciaPK=" + agenciaPK + " ]";
	}

}
