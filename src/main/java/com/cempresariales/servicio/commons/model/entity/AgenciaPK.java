package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author DIGETBI 05
 */
@Embeddable
public class AgenciaPK implements Serializable {

    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agencia")
    private long idAgencia;
    @Basic(optional = false)
    @Column(name = "zona_estructural_id_ciudad")
    private long zonaEstructuralIdCiudad;
    @Basic(optional = false)
    @Column(name = "zona_estructural_id_zona_estructural")
    private long zonaEstructuralIdZonaEstructural;

    public AgenciaPK() {
    }

    public AgenciaPK(long idAgencia, long zonaEstructuralIdCiudad, long zonaEstructuralIdZonaEstructural) {
        this.idAgencia = idAgencia;
        this.zonaEstructuralIdCiudad = zonaEstructuralIdCiudad;
        this.zonaEstructuralIdZonaEstructural = zonaEstructuralIdZonaEstructural;
    }

    public long getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(long idAgencia) {
        this.idAgencia = idAgencia;
    }

    public long getZonaEstructuralIdCiudad() {
        return zonaEstructuralIdCiudad;
    }

    public void setZonaEstructuralIdCiudad(long zonaEstructuralIdCiudad) {
        this.zonaEstructuralIdCiudad = zonaEstructuralIdCiudad;
    }

    public long getZonaEstructuralIdZonaEstructural() {
        return zonaEstructuralIdZonaEstructural;
    }

    public void setZonaEstructuralIdZonaEstructural(long zonaEstructuralIdZonaEstructural) {
        this.zonaEstructuralIdZonaEstructural = zonaEstructuralIdZonaEstructural;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idAgencia;
        hash += (int) zonaEstructuralIdCiudad;
        hash += (int) zonaEstructuralIdZonaEstructural;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenciaPK)) {
            return false;
        }
        AgenciaPK other = (AgenciaPK) object;
        if (this.idAgencia != other.idAgencia) {
            return false;
        }
        if (this.zonaEstructuralIdCiudad != other.zonaEstructuralIdCiudad) {
            return false;
        }
        if (this.zonaEstructuralIdZonaEstructural != other.zonaEstructuralIdZonaEstructural) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.AgenciaPK[ idAgencia=" + idAgencia + ", zonaEstructuralIdCiudad=" + zonaEstructuralIdCiudad + ", zonaEstructuralIdZonaEstructural=" + zonaEstructuralIdZonaEstructural + " ]";
    }

}
