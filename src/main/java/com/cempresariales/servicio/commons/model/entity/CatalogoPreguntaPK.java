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
public class CatalogoPreguntaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_catalogo_pregunta")
    private short idCatalogoPregunta;
    @Basic(optional = false)
    @Column(name = "pregunta_id_pregunta")
    private long preguntaIdPregunta;
    @Basic(optional = false)
    @Column(name = "categoria_id_categoria")
    private long categoriaIdCategoria;
    @Basic(optional = false)
    @Column(name = "peso_id_peso")
    private long pesoIdPeso;

    public CatalogoPreguntaPK() {
    }

    public CatalogoPreguntaPK(short idCatalogoPregunta, long preguntaIdPregunta, long categoriaIdCategoria, long pesoIdPeso) {
        this.idCatalogoPregunta = idCatalogoPregunta;
        this.preguntaIdPregunta = preguntaIdPregunta;
        this.categoriaIdCategoria = categoriaIdCategoria;
        this.pesoIdPeso = pesoIdPeso;
    }

    public short getIdCatalogoPregunta() {
        return idCatalogoPregunta;
    }

    public void setIdCatalogoPregunta(short idCatalogoPregunta) {
        this.idCatalogoPregunta = idCatalogoPregunta;
    }

    public long getPreguntaIdPregunta() {
        return preguntaIdPregunta;
    }

    public void setPreguntaIdPregunta(long preguntaIdPregunta) {
        this.preguntaIdPregunta = preguntaIdPregunta;
    }

    public long getCategoriaIdCategoria() {
        return categoriaIdCategoria;
    }

    public void setCategoriaIdCategoria(long categoriaIdCategoria) {
        this.categoriaIdCategoria = categoriaIdCategoria;
    }

    public long getPesoIdPeso() {
        return pesoIdPeso;
    }

    public void setPesoIdPeso(long pesoIdPeso) {
        this.pesoIdPeso = pesoIdPeso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCatalogoPregunta;
        hash += (int) preguntaIdPregunta;
        hash += (int) categoriaIdCategoria;
        hash += (int) pesoIdPeso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoPreguntaPK)) {
            return false;
        }
        CatalogoPreguntaPK other = (CatalogoPreguntaPK) object;
        if (this.idCatalogoPregunta != other.idCatalogoPregunta) {
            return false;
        }
        if (this.preguntaIdPregunta != other.preguntaIdPregunta) {
            return false;
        }
        if (this.categoriaIdCategoria != other.categoriaIdCategoria) {
            return false;
        }
        if (this.pesoIdPeso != other.pesoIdPeso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cempresariales.servicio.commons.model.entity.CatalogoPreguntaPK[ idCatalogoPregunta=" + idCatalogoPregunta + ", preguntaIdPregunta=" + preguntaIdPregunta + ", categoriaIdCategoria=" + categoriaIdCategoria + ", pesoIdPeso=" + pesoIdPeso + " ]";
    }
    
}
