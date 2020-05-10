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
public class EmpleadoHasRolPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "empleado_id_empleado")
    private long empleadoIdEmpleado;
    @Basic(optional = false)
    @Column(name = "rol_id_rol")
    private long rolIdRol;

    public EmpleadoHasRolPK() {
    }

    public EmpleadoHasRolPK(long empleadoIdEmpleado, long rolIdRol) {
        this.empleadoIdEmpleado = empleadoIdEmpleado;
        this.rolIdRol = rolIdRol;
    }

    public long getChecklistIdChecklist() {
        return empleadoIdEmpleado;
    }

    public void setChecklistIdChecklist(long empleadoIdEmpleado) {
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }

    public long getEvaluacionIdEvaluacion() {
        return rolIdRol;
    }

    public void setEvaluacionIdEvaluacion(long rolIdRol) {
        this.rolIdRol = rolIdRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) empleadoIdEmpleado;
        hash += (int) rolIdRol;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoHasRolPK)) {
            return false;
        }
        EmpleadoHasRolPK other = (EmpleadoHasRolPK) object;
        if (this.empleadoIdEmpleado != other.empleadoIdEmpleado) {
            return false;
        }
        if (this.rolIdRol != other.rolIdRol) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmpleadoHasRolPK[ empleadoIdEmpleado=" + empleadoIdEmpleado + ", rolIdRol=" + rolIdRol + " ]";
    }
    
}
