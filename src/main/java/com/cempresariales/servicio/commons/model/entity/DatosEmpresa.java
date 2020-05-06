package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;

public class DatosEmpresa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4097542793520151078L;

	
	private String cliente;
	private String empresa;
	
	

	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
}
