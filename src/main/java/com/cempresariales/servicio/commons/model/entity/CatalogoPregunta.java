/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @author ADM-DGIP
 */
@Entity
@Table(name = "catalogo_pregunta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoPregunta.findAll", query = "SELECT c FROM CatalogoPregunta c")
    , @NamedQuery(name = "CatalogoPregunta.findByIdCatalogoPregunta", query = "SELECT c FROM CatalogoPregunta c WHERE c.idCatalogoPregunta = :idCatalogoPregunta")
    , @NamedQuery(name = "CatalogoPregunta.findByActivoCatalogoPregunta", query = "SELECT c FROM CatalogoPregunta c WHERE c.activoCatalogoPregunta = :activoCatalogoPregunta")})
public class CatalogoPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_catalogo_pregunta")
    private Long idCatalogoPregunta;
    @Column(name = "activo_catalogo_pregunta")
    private Short activoCatalogoPregunta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catalogoPregunta")
    private List<ChecklistHasCatalogoPregunta> checklistHasCatalogoPreguntaList;
    @JoinColumn(name = "categoria_id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false)
    private Categoria categoriaIdCategoria;
    @JoinColumn(name = "peso_id_peso", referencedColumnName = "id_peso")
    @ManyToOne(optional = false)
    private Peso pesoIdPeso;
    @JoinColumn(name = "pregunta_id_pregunta", referencedColumnName = "id_pregunta")
    @ManyToOne(optional = false)
    private Pregunta preguntaIdPregunta;

    public CatalogoPregunta() {
    }

    public CatalogoPregunta(Long idCatalogoPregunta) {
        this.idCatalogoPregunta = idCatalogoPregunta;
    }

    public Long getIdCatalogoPregunta() {
        return idCatalogoPregunta;
    }

    public void setIdCatalogoPregunta(Long idCatalogoPregunta) {
        this.idCatalogoPregunta = idCatalogoPregunta;
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

    public Categoria getCategoriaIdCategoria() {
        return categoriaIdCategoria;
    }

    public void setCategoriaIdCategoria(Categoria categoriaIdCategoria) {
        this.categoriaIdCategoria = categoriaIdCategoria;
    }

    public Peso getPesoIdPeso() {
        return pesoIdPeso;
    }

    public void setPesoIdPeso(Peso pesoIdPeso) {
        this.pesoIdPeso = pesoIdPeso;
    }

    public Pregunta getPreguntaIdPregunta() {
        return preguntaIdPregunta;
    }

    public void setPreguntaIdPregunta(Pregunta preguntaIdPregunta) {
        this.preguntaIdPregunta = preguntaIdPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoPregunta != null ? idCatalogoPregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoPregunta)) {
            return false;
        }
        CatalogoPregunta other = (CatalogoPregunta) object;
        if ((this.idCatalogoPregunta == null && other.idCatalogoPregunta != null) || (this.idCatalogoPregunta != null && !this.idCatalogoPregunta.equals(other.idCatalogoPregunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cempresariales.servicio.commons.model.entity.CatalogoPregunta[ idCatalogoPregunta=" + idCatalogoPregunta + " ]";
    }
    
}
