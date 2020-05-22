/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADM-DGIP
 */
@Entity
@Table(name = "respuesta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Respuesta.findAll", query = "SELECT r FROM Respuesta r")
    , @NamedQuery(name = "Respuesta.findByIdRespuesta", query = "SELECT r FROM Respuesta r WHERE r.idRespuesta = :idRespuesta")
    , @NamedQuery(name = "Respuesta.findByCategoriaIdCategoria", query = "SELECT r FROM Respuesta r WHERE r.categoriaIdCategoria = :categoriaIdCategoria")
    , @NamedQuery(name = "Respuesta.findByCumpleRespuesta", query = "SELECT r FROM Respuesta r WHERE r.cumpleRespuesta = :cumpleRespuesta")
    , @NamedQuery(name = "Respuesta.findByIdCatalogoPregunta", query = "SELECT r FROM Respuesta r WHERE r.idCatalogoPregunta = :idCatalogoPregunta")
    , @NamedQuery(name = "Respuesta.findByObservacionRespuesta", query = "SELECT r FROM Respuesta r WHERE r.observacionRespuesta = :observacionRespuesta")})
public class Respuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_respuesta")
    private Long idRespuesta;
    @Basic(optional = false)
    @Column(name = "categoria_id_categoria")
    private long categoriaIdCategoria;
    @Column(name = "cumple_respuesta")
    private Short cumpleRespuesta;
    @Column(name = "id_catalogo_pregunta")
    private BigInteger idCatalogoPregunta;
    @Column(name = "observacion_respuesta")
    private String observacionRespuesta;
    @JoinColumns({
        @JoinColumn(name = "checklist_has_evaluacion_checklist_id_checklist", referencedColumnName = "checklist_id_checklist")
        , @JoinColumn(name = "checklist_has_evaluacion_evaluacion_id_evaluacion", referencedColumnName = "evaluacion_id_evaluacion")})
    @ManyToOne(optional = false)
    private ChecklistHasEvaluacion checklistHasEvaluacion;

    public Respuesta() {
    }

    public Respuesta(Long idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public Respuesta(Long idRespuesta, long categoriaIdCategoria) {
        this.idRespuesta = idRespuesta;
        this.categoriaIdCategoria = categoriaIdCategoria;
    }

    public Long getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Long idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public long getCategoriaIdCategoria() {
        return categoriaIdCategoria;
    }

    public void setCategoriaIdCategoria(long categoriaIdCategoria) {
        this.categoriaIdCategoria = categoriaIdCategoria;
    }

    public Short getCumpleRespuesta() {
        return cumpleRespuesta;
    }

    public void setCumpleRespuesta(Short cumpleRespuesta) {
        this.cumpleRespuesta = cumpleRespuesta;
    }

    public BigInteger getIdCatalogoPregunta() {
        return idCatalogoPregunta;
    }

    public void setIdCatalogoPregunta(BigInteger idCatalogoPregunta) {
        this.idCatalogoPregunta = idCatalogoPregunta;
    }

    public String getObservacionRespuesta() {
        return observacionRespuesta;
    }

    public void setObservacionRespuesta(String observacionRespuesta) {
        this.observacionRespuesta = observacionRespuesta;
    }

    public ChecklistHasEvaluacion getChecklistHasEvaluacion() {
        return checklistHasEvaluacion;
    }

    public void setChecklistHasEvaluacion(ChecklistHasEvaluacion checklistHasEvaluacion) {
        this.checklistHasEvaluacion = checklistHasEvaluacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRespuesta != null ? idRespuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Respuesta)) {
            return false;
        }
        Respuesta other = (Respuesta) object;
        if ((this.idRespuesta == null && other.idRespuesta != null) || (this.idRespuesta != null && !this.idRespuesta.equals(other.idRespuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cempresariales.servicio.commons.model.entity.Respuesta[ idRespuesta=" + idRespuesta + " ]";
    }
    
}
