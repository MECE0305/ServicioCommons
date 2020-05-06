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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "evaluacion")
@XmlRootElement
public class Evaluacion implements Serializable{

	private static final long serialVersionUID = 6488878724000571976L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evaluacion")
	private Long id;
	
	@Column(name = "puntaje_evaluacion")
	private Float puntaje;
	
	@Column(name = "espera_evaluacion")
	private Integer tEspera;
	
	@Column(name = "contacto_evaluacion")
	private Integer tContacto;
	
	@Column(name = "atencion_evaluacion")
	private Integer tAtencion;
	
	@Column(name = "video_evaluacion")
	private String video;
	
	@Column(name = "promedio_total")
	private String promedioTotal;
	
	@Column(name = "promedio_seccion")
	private String promedioSeccion;
	
	@Column(name = "promedio_pregunta")
	private String promedioPregunta;
	
	@Column(name = "fecha_evaluacion")
	private Date crea;
	
	@Column(name = "activo_evaluacion")
	private Boolean activo;

	@Column(name = "crea_evaluacion")
	private Date creaEV;
	
	@JoinColumn(name = "estado_evaluacion_id_estado", referencedColumnName = "id_estado")
	@ManyToOne
	private EstadoEvaluacion estado;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	        name = "evaluacion_has_categoria",
	        joinColumns = {@JoinColumn(name = "id_evaluacion")},
	        inverseJoinColumns = {@JoinColumn(name="id_categoria")}
	)
	private List<Categoria> listaCategorias;
	
	@JoinColumn(name = "rol_id_rol", referencedColumnName = "id_rol")
	@ManyToOne(optional = false)
	@JsonBackReference
	private Rol rol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Float puntaje) {
		this.puntaje = puntaje;
	}

	public Integer gettEspera() {
		return tEspera;
	}

	public void settEspera(Integer tEspera) {
		this.tEspera = tEspera;
	}

	public Integer gettContacto() {
		return tContacto;
	}

	public void settContacto(Integer tContacto) {
		this.tContacto = tContacto;
	}

	public Integer gettAtencion() {
		return tAtencion;
	}

	public void settAtencion(Integer tAtencion) {
		this.tAtencion = tAtencion;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getPromedioTotal() {
		return promedioTotal;
	}

	public void setPromedioTotal(String promedioTotal) {
		this.promedioTotal = promedioTotal;
	}

	public String getPromedioSeccion() {
		return promedioSeccion;
	}

	public void setPromedioSeccion(String promedioSeccion) {
		this.promedioSeccion = promedioSeccion;
	}

	public String getPromedioPregunta() {
		return promedioPregunta;
	}

	public void setPromedioPregunta(String promedioPregunta) {
		this.promedioPregunta = promedioPregunta;
	}

	public Date getCrea() {
		return crea;
	}

	public void setCrea(Date crea) {
		this.crea = crea;
	}

	public EstadoEvaluacion getEstado() {
		return estado;
	}

	public void setEstado(EstadoEvaluacion estado) {
		this.estado = estado;
	}

	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
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

	public Date getCreaEV() {
		return creaEV;
	}

	public void setCreaEV(Date creaEV) {
		this.creaEV = creaEV;
	}

	
	
	
}
