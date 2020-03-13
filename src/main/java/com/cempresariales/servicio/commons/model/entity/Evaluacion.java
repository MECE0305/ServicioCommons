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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "evaluacion")
@XmlRootElement
public class Evaluacion implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6488878724000571976L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evaluacion")
	private Long id;
	
	@Column(name = "puntaje_evaluacion")
	private float puntaje;
	
	@Column(name = "espera_evaluacion")
	private int tEspera;
	
	@Column(name = "contacto_evaluacion")
	private int tContacto;
	
	@Column(name = "atencion_evaluacion")
	private int tAtencion;
	
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
	

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "listaEvaluaciones")
	@JsonBackReference
	private List<Categoria> listaCategorias;
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public float getPuntaje() {
		return puntaje;
	}



	public void setPuntaje(float puntaje) {
		this.puntaje = puntaje;
	}



	public int gettEspera() {
		return tEspera;
	}



	public void settEspera(int tEspera) {
		this.tEspera = tEspera;
	}



	public int gettContacto() {
		return tContacto;
	}



	public void settContacto(int tContacto) {
		this.tContacto = tContacto;
	}



	public int gettAtencion() {
		return tAtencion;
	}



	public void settAtencion(int tAtencion) {
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



	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}



	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}
	
}
