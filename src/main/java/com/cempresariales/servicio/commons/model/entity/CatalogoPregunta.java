/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DIGETBI 05
 */
@Entity
@Table(name = "catalogo_pregunta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoPregunta.findAll", query = "SELECT c FROM CatalogoPregunta c")
    , @NamedQuery(name = "CatalogoPregunta.findByIdCatalogoPregunta", query = "SELECT c FROM CatalogoPregunta c WHERE c.catalogoPreguntaPK.idCatalogoPregunta = :idCatalogoPregunta")
    , @NamedQuery(name = "CatalogoPregunta.findByPreguntaIdPregunta", query = "SELECT c FROM CatalogoPregunta c WHERE c.catalogoPreguntaPK.preguntaIdPregunta = :preguntaIdPregunta")
    , @NamedQuery(name = "CatalogoPregunta.findByCategoriaIdCategoria", query = "SELECT c FROM CatalogoPregunta c WHERE c.catalogoPreguntaPK.categoriaIdCategoria = :categoriaIdCategoria")
    , @NamedQuery(name = "CatalogoPregunta.findByPesoIdPeso", query = "SELECT c FROM CatalogoPregunta c WHERE c.catalogoPreguntaPK.pesoIdPeso = :pesoIdPeso")
    , @NamedQuery(name = "CatalogoPregunta.findByActivoCatalogoPregunta", query = "SELECT c FROM CatalogoPregunta c WHERE c.activoCatalogoPregunta = :activoCatalogoPregunta")})
public class CatalogoPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CatalogoPreguntaPK catalogoPreguntaPK;
    @Column(name = "activo_catalogo_pregunta")
    private Short activoCatalogoPregunta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catalogoPregunta")
    private List<ChecklistHasCatalogoPregunta> checklistHasCatalogoPreguntaList;
    @JoinColumn(name = "categoria_id_categoria", referencedColumnName = "id_categoria", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Categoria categoria;
    @JoinColumn(name = "peso_id_peso", referencedColumnName = "id_peso", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Peso peso;
    @JoinColumn(name = "pregunta_id_pregunta", referencedColumnName = "id_pregunta", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pregunta pregunta;

    public CatalogoPregunta() {
    }

    public CatalogoPregunta(CatalogoPreguntaPK catalogoPreguntaPK) {
        this.catalogoPreguntaPK = catalogoPreguntaPK;
    }

    public CatalogoPregunta(short idCatalogoPregunta, long preguntaIdPregunta, long categoriaIdCategoria, long pesoIdPeso) {
        this.catalogoPreguntaPK = new CatalogoPreguntaPK(idCatalogoPregunta, preguntaIdPregunta, categoriaIdCategoria, pesoIdPeso);
    }

    public CatalogoPreguntaPK getCatalogoPreguntaPK() {
        return catalogoPreguntaPK;
    }

    public void setCatalogoPreguntaPK(CatalogoPreguntaPK catalogoPreguntaPK) {
        this.catalogoPreguntaPK = catalogoPreguntaPK;
    }

    public Short getActivoCatalogoPregunta() {
        return activoCatalogoPregunta;
    }

    public void setActivoCatalogoPregunta(Short activoCatalogoPregunta) {
        this.activoCatalogoPregunta = activoCatalogoPregunta;
    }

    @XmlTransient
    public List<ChecklistHasCatalogoPregunta> getChecklistHasCatalogoPreguntaList() {
        return checklistHasCatalogoPreguntaList;
    }

    public void setChecklistHasCatalogoPreguntaList(List<ChecklistHasCatalogoPregunta> checklistHasCatalogoPreguntaList) {
        this.checklistHasCatalogoPreguntaList = checklistHasCatalogoPreguntaList;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catalogoPreguntaPK != null ? catalogoPreguntaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoPregunta)) {
            return false;
        }
        CatalogoPregunta other = (CatalogoPregunta) object;
        if ((this.catalogoPreguntaPK == null && other.catalogoPreguntaPK != null) || (this.catalogoPreguntaPK != null && !this.catalogoPreguntaPK.equals(other.catalogoPreguntaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cempresariales.servicio.commons.model.entity.CatalogoPregunta[ catalogoPreguntaPK=" + catalogoPreguntaPK + " ]";
    }
    
}
