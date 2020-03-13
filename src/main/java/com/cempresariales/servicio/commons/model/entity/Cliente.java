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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "cliente")
@XmlRootElement
public class Cliente implements Serializable{
	private static final long serialVersionUID = -7385488079840951957L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long id;
	
	@Column(name = "nombre_cliente")
	private String nombre;
	
	@Column(name = "ci_cliente")
	private String ci;
	
	@Column(name = "telefono_cliente")
	private String telefono;
	
	@Column(name = "mail_cliente")
	private String mail;
	
	@Column(name = "ceo_cliente")
	private String ceo;
	
	@Column(name = "foto_cliente")
	private String foto;
	
	@Column(name = "direccion_cliente")
	private String direccion;
	
	@Column(name = "url_cliente")
	private String ur;
	
	@Column(name = "activo_cliente")
	private Boolean activo;
	
	@Column(name = "crea_cliente")
	private Date crea;
	
	@Column(name = "actualiza_cliente")
	private Date actualiza;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	//@JoinColumn(name = "cliente_id_cliente")
	private List<Empresa> listaEmpresas;
	
	/*@OneToMany
	@JoinColumn(name = "cliente_id_cliente")
	private List<Promedio> listaPromedios;
*/
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

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUr() {
		return ur;
	}

	public void setUr(String ur) {
		this.ur = ur;
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

	public Date getActualiza() {
		return actualiza;
	}

	public void setActualiza(Date actualiza) {
		this.actualiza = actualiza;
	}

	@XmlTransient
	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(List<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}

	/*public List<Promedio> getListaPromedios() {
		return listaPromedios;
	}

	public void setListaPromedios(List<Promedio> listaPromedios) {
		this.listaPromedios = listaPromedios;
	}
*/
	
}
