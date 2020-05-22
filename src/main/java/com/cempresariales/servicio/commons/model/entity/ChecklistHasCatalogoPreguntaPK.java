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
 * @author ADM-DGIP
 */
@Embeddable
public class ChecklistHasCatalogoPreguntaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "checklist_id_checklist")
    private long checklistIdChecklist;
    @Basic(optional = false)
    @Column(name = "catalogo_pregunta_id_catalogo_pregunta")
    private long catalogoPreguntaIdCatalogoPregunta;

    public ChecklistHasCatalogoPreguntaPK() {
    }

    public ChecklistHasCatalogoPreguntaPK(long checklistIdChecklist, long catalogoPreguntaIdCatalogoPregunta) {
        this.checklistIdChecklist = checklistIdChecklist;
        this.catalogoPreguntaIdCatalogoPregunta = catalogoPreguntaIdCatalogoPregunta;
    }

    public long getChecklistIdChecklist() {
        return checklistIdChecklist;
    }

    public void setChecklistIdChecklist(long checklistIdChecklist) {
        this.checklistIdChecklist = checklistIdChecklist;
    }

    public long getCatalogoPreguntaIdCatalogoPregunta() {
        return catalogoPreguntaIdCatalogoPregunta;
    }

    public void setCatalogoPreguntaIdCatalogoPregunta(long catalogoPreguntaIdCatalogoPregunta) {
        this.catalogoPreguntaIdCatalogoPregunta = catalogoPreguntaIdCatalogoPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) checklistIdChecklist;
        hash += (int) catalogoPreguntaIdCatalogoPregunta;
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
        return true;
    }

    @Override
    public String toString() {
        return "com.cempresariales.servicio.commons.model.entity.ChecklistHasCatalogoPreguntaPK[ checklistIdChecklist=" + checklistIdChecklist + ", catalogoPreguntaIdCatalogoPregunta=" + catalogoPreguntaIdCatalogoPregunta + " ]";
    }
    
}
