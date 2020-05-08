package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class RespuestaItems implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 441988472830741405L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_respuesta_item")
	private Long id;
	
	@Column(name = "item_item")
	private String item;
	
	@Column(name = "valor_item")
	private Boolean valor;
	
	@JoinColumn(name = "respuesta_item_id_respuesta_item", referencedColumnName = "id_respuesta_item")
	@ManyToOne(optional = false)
	private Respuesta respuesta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Boolean getValor() {
		return valor;
	}

	public void setValor(Boolean valor) {
		this.valor = valor;
	}

	public Respuesta getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Respuesta respuesta) {
		this.respuesta = respuesta;
	}
	
	
}

