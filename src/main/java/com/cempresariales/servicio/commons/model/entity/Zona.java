/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 *
 * @author ADM-DGIP
 */
@Entity
@Table(name = "zona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zona.findAll", query = "SELECT z FROM Zona z")
    , @NamedQuery(name = "Zona.findByIdZona", query = "SELECT z FROM Zona z WHERE z.idZona = :idZona")
    , @NamedQuery(name = "Zona.findByActivoZona", query = "SELECT z FROM Zona z WHERE z.activoZona = :activoZona")
    , @NamedQuery(name = "Zona.findByCreaZona", query = "SELECT z FROM Zona z WHERE z.creaZona = :creaZona")
    , @NamedQuery(name = "Zona.findByNombreZona", query = "SELECT z FROM Zona z WHERE z.nombreZona = :nombreZona")})
public class Zona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_zona")
    private Long idZona;
    @Column(name = "activo_zona")
    private Boolean activoZona;
    @Column(name = "crea_zona")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creaZona;
    @Column(name = "nombre_zona")
    private String nombreZona;
    @JoinTable(name = "zona_has_provincia", joinColumns = {
        @JoinColumn(name = "zona_id_zona", referencedColumnName = "id_zona")}, inverseJoinColumns = {
        @JoinColumn(name = "provincia_id_provincia", referencedColumnName = "id_provincia")})
    @ManyToMany
    private List<Provincia> provinciaList;
    @ManyToMany(mappedBy = "zonaList")
    @JsonBackReference
    private List<Region> regionList;

    public Zona() {
    }

    public Zona(Long idZona) {
        this.idZona = idZona;
    }

    public Long getIdZona() {
        return idZona;
    }

    public void setIdZona(Long idZona) {
        this.idZona = idZona;
    }

    public Boolean getActivoZona() {
        return activoZona;
    }

    public void setActivoZona(Boolean activoZona) {
        this.activoZona = activoZona;
    }

    public Date getCreaZona() {
        return creaZona;
    }

    public void setCreaZona(Date creaZona) {
        this.creaZona = creaZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    @XmlTransient
    public List<Provincia> getProvinciaList() {
        return provinciaList;
    }

    public void setProvinciaList(List<Provincia> provinciaList) {
        this.provinciaList = provinciaList;
    }

    @XmlTransient
    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idZona != null ? idZona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zona)) {
            return false;
        }
        Zona other = (Zona) object;
        if ((this.idZona == null && other.idZona != null) || (this.idZona != null && !this.idZona.equals(other.idZona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Zona[ idZona=" + idZona + " ]";
    }

}
