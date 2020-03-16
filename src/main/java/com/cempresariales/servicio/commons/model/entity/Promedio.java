package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "promedio")
@XmlRootElement
public class Promedio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3734749056929341200L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_promedio")
	private Long id;
	
	@Column(name = "evaluacion_promedio")
	private Float evaluacion;
	
	@Column(name = "categoria_promedio")
	private Float categoria;
	
	@Column(name = "pregunta_promedio")
	private Float pregunta;
	
	@Column(name = "id_evaluacion_promedio")
	private Integer idEvaluacion;
	
	@Column(name = "fecha_inicial_promedio")
	private Date fechaInicial;
	
	@Column(name = "fecha_final_promedio")
	private Date fechaFinal;
	
	
	@JoinColumn(name = "cliente_id_cliente", referencedColumnName = "id_cliente")
	@ManyToOne(optional = false)
	@JsonBackReference
	private Cliente cliente;
	
	


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(Float evaluacion) {
		this.evaluacion = evaluacion;
	}

	public Float getCategoria() {
		return categoria;
	}

	public void setCategoria(Float categoria) {
		this.categoria = categoria;
	}

	public Float getPregunta() {
		return pregunta;
	}

	public void setPregunta(Float pregunta) {
		this.pregunta = pregunta;
	}

	public Integer getIdEvaluacion() {
		return idEvaluacion;
	}

	public void setIdEvaluacion(Integer idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	
	
}
