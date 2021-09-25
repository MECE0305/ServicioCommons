/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author ADM-DGIP
 */
@Entity
@Table(name = "zona_estructural_has_ciudad")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "ZonaEstructuralHasCiudad.findAll", query = "SELECT z FROM ZonaEstructuralHasCiudad z")
        , @NamedQuery(name = "ZonaEstructuralHasCiudad.findByActivoZonaEstructuralHasCiudad", query = "SELECT z FROM ZonaEstructuralHasCiudad z WHERE z.activoZonaEstructuralHasCiudad = :activoZonaEstructuralHasCiudad")
        , @NamedQuery(name = "ZonaEstructuralHasCiudad.findByIdZonaCiudad", query = "SELECT z FROM ZonaEstructuralHasCiudad z WHERE z.idZonaCiudad = :idZonaCiudad")})

public class ZonaEstructuralHasCiudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "activo_zona_estructural_has_ciudad")
    private Boolean activoZonaEstructuralHasCiudad;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_zona_ciudad")
    private Long idZonaCiudad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zonaCiudad")
    @JsonIgnore
    private List<Agencia> agenciaList;
    @JoinColumn(name = "zona_estructural_id_ciudad", referencedColumnName = "id_ciudad")
    @ManyToOne(optional = false)
    private Ciudad zonaEstructuralIdCiudad;
    @JoinColumn(name = "zona_estructural_id_zona_estructural", referencedColumnName = "id_zona_estructural")
    @ManyToOne(optional = false)
    private ZonaEstructural zonaEstructuralIdZonaEstructural;

    public ZonaEstructuralHasCiudad() {
    }

    public ZonaEstructuralHasCiudad(Long idZonaCiudad) {
        this.idZonaCiudad = idZonaCiudad;
    }

    public Boolean getActivoZonaEstructuralHasCiudad() {
        return activoZonaEstructuralHasCiudad;
    }

    public void setActivoZonaEstructuralHasCiudad(Boolean activoZonaEstructuralHasCiudad) {
        this.activoZonaEstructuralHasCiudad = activoZonaEstructuralHasCiudad;
    }

    public Long getIdZonaCiudad() {
        return idZonaCiudad;
    }

    public void setIdZonaCiudad(Long idZonaCiudad) {
        this.idZonaCiudad = idZonaCiudad;
    }

    @XmlTransient
    public List<Agencia> getAgenciaList() {
        return agenciaList;
    }

    public void setAgenciaList(List<Agencia> agenciaList) {
        this.agenciaList = agenciaList;
    }

    public Ciudad getZonaEstructuralIdCiudad() {
        return zonaEstructuralIdCiudad;
    }

    public void setZonaEstructuralIdCiudad(Ciudad zonaEstructuralIdCiudad) {
        this.zonaEstructuralIdCiudad = zonaEstructuralIdCiudad;
    }

    public ZonaEstructural getZonaEstructuralIdZonaEstructural() {
        return zonaEstructuralIdZonaEstructural;
    }

    public void setZonaEstructuralIdZonaEstructural(ZonaEstructural zonaEstructuralIdZonaEstructural) {
        this.zonaEstructuralIdZonaEstructural = zonaEstructuralIdZonaEstructural;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idZonaCiudad != null ? idZonaCiudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZonaEstructuralHasCiudad)) {
            return false;
        }
        ZonaEstructuralHasCiudad other = (ZonaEstructuralHasCiudad) object;
        if ((this.idZonaCiudad == null && other.idZonaCiudad != null) || (this.idZonaCiudad != null && !this.idZonaCiudad.equals(other.idZonaCiudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cempresariales.servicio.commons.model.entity.ZonaEstructuralHasCiudad[ idZonaCiudad=" + idZonaCiudad + " ]";
    }
}
