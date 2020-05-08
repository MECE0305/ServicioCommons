package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class AgenciaRol implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agenciaRol")
	private Long id;
	
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "rol", fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Rol> listaRoles;
	
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "agencia", fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Agencia> listaAgencias;
	
	
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "checklist", fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Checklist> listaChecklist;


	public List<Rol> getListaRoles() {
		return listaRoles;
	}


	public void setListaRoles(List<Rol> listaRoles) {
		this.listaRoles = listaRoles;
	}


	public List<Agencia> getListaAgencias() {
		return listaAgencias;
	}


	public void setListaAgencias(List<Agencia> listaAgencias) {
		this.listaAgencias = listaAgencias;
	}


	public List<Checklist> getListaChecklist() {
		return listaChecklist;
	}


	public void setListaChecklist(List<Checklist> listaChecklist) {
		this.listaChecklist = listaChecklist;
	}

	
	
}
