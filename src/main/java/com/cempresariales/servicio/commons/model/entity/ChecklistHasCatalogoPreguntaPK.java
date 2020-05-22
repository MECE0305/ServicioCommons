/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author DIGETBI 05
 */
@Embeddable
public class ChecklistHasCatalogoPreguntaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "checklist_id_checklist")
    private long checklistIdChecklist;
    @Basic(optional = false)
    @Column(name = "catalogo_pregunta_id_catalogo_pregunta")
    private short catalogoPreguntaIdCatalogoPregunta;
    @Basic(optional = false)
    @Column(name = "catalogo_pregunta_pregunta_id_pregunta")
    private long catalogoPreguntaPreguntaIdPregunta;
    @Basic(optional = false)
    @Column(name = "catalogo_pregunta_categoria_id_categoria")
    private long catalogoPreguntaCategoriaIdCategoria;
    @Basic(optional = false)
    @Column(name = "catalogo_pregunta_peso_id_peso")
    private long catalogoPreguntaPesoIdPeso;

    public ChecklistHasCatalogoPreguntaPK() {
    }

    public ChecklistHasCatalogoPreguntaPK(long checklistIdChecklist, short catalogoPreguntaIdCatalogoPregunta, long catalogoPreguntaPreguntaIdPregunta, long catalogoPreguntaCategoriaIdCategoria, long catalogoPreguntaPesoIdPeso) {
        this.checklistIdChecklist = checklistIdChecklist;
        this.catalogoPreguntaIdCatalogoPregunta = catalogoPreguntaIdCatalogoPregunta;
        this.catalogoPreguntaPreguntaIdPregunta = catalogoPreguntaPreguntaIdPregunta;
        this.catalogoPreguntaCategoriaIdCategoria = catalogoPreguntaCategoriaIdCategoria;
        this.catalogoPreguntaPesoIdPeso = catalogoPreguntaPesoIdPeso;
    }

    public long getChecklistIdChecklist() {
        return checklistIdChecklist;
    }

    public void setChecklistIdChecklist(long checklistIdChecklist) {
        this.checklistIdChecklist = checklistIdChecklist;
    }

    public short getCatalogoPreguntaIdCatalogoPregunta() {
        return catalogoPreguntaIdCatalogoPregunta;
    }

    public void setCatalogoPreguntaIdCatalogoPregunta(short catalogoPreguntaIdCatalogoPregunta) {
        this.catalogoPreguntaIdCatalogoPregunta = catalogoPreguntaIdCatalogoPregunta;
    }

    public long getCatalogoPreguntaPreguntaIdPregunta() {
        return catalogoPreguntaPreguntaIdPregunta;
    }

    public void setCatalogoPreguntaPreguntaIdPregunta(long catalogoPreguntaPreguntaIdPregunta) {
        this.catalogoPreguntaPreguntaIdPregunta = catalogoPreguntaPreguntaIdPregunta;
    }

    public long getCatalogoPreguntaCategoriaIdCategoria() {
        return catalogoPreguntaCategoriaIdCategoria;
    }

    public void setCatalogoPreguntaCategoriaIdCategoria(long catalogoPreguntaCategoriaIdCategoria) {
        this.catalogoPreguntaCategoriaIdCategoria = catalogoPreguntaCategoriaIdCategoria;
    }

    public long getCatalogoPreguntaPesoIdPeso() {
        return catalogoPreguntaPesoIdPeso;
    }

    public void setCatalogoPreguntaPesoIdPeso(long catalogoPreguntaPesoIdPeso) {
        this.catalogoPreguntaPesoIdPeso = catalogoPreguntaPesoIdPeso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) checklistIdChecklist;
        hash += (int) catalogoPreguntaIdCatalogoPregunta;
        hash += (int) catalogoPreguntaPreguntaIdPregunta;
        hash += (int) catalogoPreguntaCategoriaIdCategoria;
        hash += (int) catalogoPreguntaPesoIdPeso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChecklistHasCatalogoPreguntaPK)) {
            return false;
        }
        ChecklistHasCatalogoPreguntaPK other = (ChecklistHasCatalogoPreguntaPK) object;
        if (this.checklistIdChecklist != other.checklistIdChecklist) {
            return false;
        }
        if (this.catalogoPreguntaIdCatalogoPregunta != other.catalogoPreguntaIdCatalogoPregunta) {
            return false;
        }
        if (this.catalogoPreguntaPreguntaIdPregunta != other.catalogoPreguntaPreguntaIdPregunta) {
            return false;
        }
        if (this.catalogoPreguntaCategoriaIdCategoria != other.catalogoPreguntaCategoriaIdCategoria) {
            return false;
        }
        if (this.catalogoPreguntaPesoIdPeso != other.catalogoPreguntaPesoIdPeso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cempresariales.servicio.commons.model.entity.ChecklistHasCatalogoPreguntaPK[ checklistIdChecklist=" + checklistIdChecklist + ", catalogoPreguntaIdCatalogoPregunta=" + catalogoPreguntaIdCatalogoPregunta + ", catalogoPreguntaPreguntaIdPregunta=" + catalogoPreguntaPreguntaIdPregunta + ", catalogoPreguntaCategoriaIdCategoria=" + catalogoPreguntaCategoriaIdCategoria + ", catalogoPreguntaPesoIdPeso=" + catalogoPreguntaPesoIdPeso + " ]";
    }
    
}
