/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "checklist_has_catalogo_pregunta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChecklistHasCatalogoPregunta.findAll", query = "SELECT c FROM ChecklistHasCatalogoPregunta c")
    , @NamedQuery(name = "ChecklistHasCatalogoPregunta.findByChecklistIdChecklist", query = "SELECT c FROM ChecklistHasCatalogoPregunta c WHERE c.checklistHasCatalogoPreguntaPK.checklistIdChecklist = :checklistIdChecklist")
    , @NamedQuery(name = "ChecklistHasCatalogoPregunta.findByCatalogoPreguntaIdCatalogoPregunta", query = "SELECT c FROM ChecklistHasCatalogoPregunta c WHERE c.checklistHasCatalogoPreguntaPK.catalogoPreguntaIdCatalogoPregunta = :catalogoPreguntaIdCatalogoPregunta")
    , @NamedQuery(name = "ChecklistHasCatalogoPregunta.findByActivo", query = "SELECT c FROM ChecklistHasCatalogoPregunta c WHERE c.activo = :activo")})
public class ChecklistHasCatalogoPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ChecklistHasCatalogoPreguntaPK checklistHasCatalogoPreguntaPK;
    @Column(name = "activo")
    private Boolean activo;
    @JoinColumn(name = "catalogo_pregunta_id_catalogo_pregunta", referencedColumnName = "id_catalogo_pregunta", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CatalogoPregunta catalogoPregunta;
    @JoinColumn(name = "checklist_id_checklist", referencedColumnName = "id_checklist", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Checklist checklist;

    public ChecklistHasCatalogoPregunta() {
    }

    public ChecklistHasCatalogoPregunta(ChecklistHasCatalogoPreguntaPK checklistHasCatalogoPreguntaPK) {
        this.checklistHasCatalogoPreguntaPK = checklistHasCatalogoPreguntaPK;
    }

    public ChecklistHasCatalogoPregunta(long checklistIdChecklist, long catalogoPreguntaIdCatalogoPregunta) {
        this.checklistHasCatalogoPreguntaPK = new ChecklistHasCatalogoPreguntaPK(checklistIdChecklist, catalogoPreguntaIdCatalogoPregunta);
    }

    public ChecklistHasCatalogoPreguntaPK getChecklistHasCatalogoPreguntaPK() {
        return checklistHasCatalogoPreguntaPK;
    }

    public void setChecklistHasCatalogoPreguntaPK(ChecklistHasCatalogoPreguntaPK checklistHasCatalogoPreguntaPK) {
        this.checklistHasCatalogoPreguntaPK = checklistHasCatalogoPreguntaPK;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public CatalogoPregunta getCatalogoPregunta() {
        return catalogoPregunta;
    }

    public void setCatalogoPregunta(CatalogoPregunta catalogoPregunta) {
        this.catalogoPregunta = catalogoPregunta;
    }

    public Checklist getChecklist() {
        return checklist;
    }

    public void setChecklist(Checklist checklist) {
        this.checklist = checklist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (checklistHasCatalogoPreguntaPK != null ? checklistHasCatalogoPreguntaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChecklistHasCatalogoPregunta)) {
            return false;
        }
        ChecklistHasCatalogoPregunta other = (ChecklistHasCatalogoPregunta) object;
        if ((this.checklistHasCatalogoPreguntaPK == null && other.checklistHasCatalogoPreguntaPK != null) || (this.checklistHasCatalogoPreguntaPK != null && !this.checklistHasCatalogoPreguntaPK.equals(other.checklistHasCatalogoPreguntaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cempresariales.servicio.commons.model.entity.ChecklistHasCatalogoPregunta[ checklistHasCatalogoPreguntaPK=" + checklistHasCatalogoPreguntaPK + " ]";
    }
    
}
