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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author ADM-DGIP
 */
@Entity
@Table(name = "tiempoatencionview")
@XmlRootElement
public class TiempoAtencionView implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	@Basic(optional = false)
	@Column(name = "id_empleado")
	private long idEmpleado;
	@Column(name = "nombre_empleado")
	private String nombreEmpleado;
	@Basic(optional = false)
	@Column(name = "id_area")
	private long idArea;
	@Column(name = "nombre_area")
	private String nombreArea;
	@Basic(optional = false)
	@Column(name = "id_agencia")
	private long idAgencia;
	@Column(name = "atencion")
	private Integer atencion;
	@Column(name = "espera")
	private Integer espera;
	@Column(name = "permanencia")
	private Integer permanencia;


	public TiempoAtencionView() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public long getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(long idAgencia) {
		this.idAgencia = idAgencia;
	}

	public Integer getAtencion() {
		return atencion;
	}

	public void setAtencion(Integer atencion) {
		this.atencion = atencion;
	}

	public Integer getEspera() {
		return espera;
	}

	public void setEspera(Integer espera) {
		this.espera = espera;
	}

	public Integer getPermanencia() {
		return permanencia;
	}

	public void setPermanencia(Integer permanencia) {
		this.permanencia = permanencia;
	}
}
