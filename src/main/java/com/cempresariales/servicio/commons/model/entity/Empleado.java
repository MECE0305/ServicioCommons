package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "empleado")
@XmlRootElement
public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 528586178926893185L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private Long id;
		
	@Column(name = "nombre_empleado")
	private String nombre;
	
	@Column(name = "apellido_empleado")
	private String apellido;
	
	@Column(name = "ci_empleado")
	private String ci;
	
	@Column(name = "genero_empleado")
	private String genero;
	
	@Column(name = "telefono_empleado")
	private String telefono;
	
	@Column(name = "foto_empleado")
	private String foto;
	
	@Column(name = "mail_empleado")
	private String mail;

	@Column(name = "activo_empleado")
	private Boolean activo;

	@Column(name = "crea_empleado")
	private Date crea;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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
		
}
