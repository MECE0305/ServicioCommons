package com.cempresariales.servicio.commons.model.entity;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmpleadoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_empleado")
    private long idEmpleado;
    @Basic(optional = false)
    @Column(name = "agencia_id_agencia")
    private long agenciaIdAgencia;
    @Basic(optional = false)
    @Column(name = "agencia_zona_estructural_id_ciudad")
    private long agenciaZonaEstructuralIdCiudad;
    @Basic(optional = false)
    @Column(name = "agencia_zona_estructural_id_zona_estructural")
    private long agenciaZonaEstructuralIdZonaEstructural;

    public EmpleadoPK() {
    }

    public EmpleadoPK(long idEmpleado, long agenciaIdAgencia, long agenciaZonaEstructuralIdCiudad, long agenciaZonaEstructuralIdZonaEstructural) {
        this.idEmpleado = idEmpleado;
        this.agenciaIdAgencia = agenciaIdAgencia;
        this.agenciaZonaEstructuralIdCiudad = agenciaZonaEstructuralIdCiudad;
        this.agenciaZonaEstructuralIdZonaEstructural = agenciaZonaEstructuralIdZonaEstructural;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public long getAgenciaIdAgencia() {
        return agenciaIdAgencia;
    }

    public void setAgenciaIdAgencia(long agenciaIdAgencia) {
        this.agenciaIdAgencia = agenciaIdAgencia;
    }

    public long getAgenciaZonaEstructuralIdCiudad() {
        return agenciaZonaEstructuralIdCiudad;
    }

    public void setAgenciaZonaEstructuralIdCiudad(long agenciaZonaEstructuralIdCiudad) {
        this.agenciaZonaEstructuralIdCiudad = agenciaZonaEstructuralIdCiudad;
    }

    public long getAgenciaZonaEstructuralIdZonaEstructural() {
        return agenciaZonaEstructuralIdZonaEstructural;
    }

    public void setAgenciaZonaEstructuralIdZonaEstructural(long agenciaZonaEstructuralIdZonaEstructural) {
        this.agenciaZonaEstructuralIdZonaEstructural = agenciaZonaEstructuralIdZonaEstructural;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEmpleado;
        hash += (int) agenciaIdAgencia;
        hash += (int) agenciaZonaEstructuralIdCiudad;
        hash += (int) agenciaZonaEstructuralIdZonaEstructural;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoPK)) {
            return false;
        }
        EmpleadoPK other = (EmpleadoPK) object;
        if (this.idEmpleado != other.idEmpleado) {
            return false;
        }
        if (this.agenciaIdAgencia != other.agenciaIdAgencia) {
            return false;
        }
        if (this.agenciaZonaEstructuralIdCiudad != other.agenciaZonaEstructuralIdCiudad) {
            return false;
        }
        if (this.agenciaZonaEstructuralIdZonaEstructural != other.agenciaZonaEstructuralIdZonaEstructural) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.EmpleadoPK[ idEmpleado=" + idEmpleado + ", agenciaIdAgencia=" + agenciaIdAgencia + ", agenciaZonaEstructuralIdCiudad=" + agenciaZonaEstructuralIdCiudad + ", agenciaZonaEstructuralIdZonaEstructural=" + agenciaZonaEstructuralIdZonaEstructural + " ]";
    }

}
