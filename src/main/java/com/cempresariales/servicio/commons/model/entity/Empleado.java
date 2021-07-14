/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cempresariales.servicio.commons.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADM-DGIP
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByActivoEmpleado", query = "SELECT e FROM Empleado e WHERE e.activoEmpleado = :activoEmpleado")
    , @NamedQuery(name = "Empleado.findByApellidoEmpleado", query = "SELECT e FROM Empleado e WHERE e.apellidoEmpleado = :apellidoEmpleado")
    , @NamedQuery(name = "Empleado.findByCiEmpleado", query = "SELECT e FROM Empleado e WHERE e.ciEmpleado = :ciEmpleado")
    , @NamedQuery(name = "Empleado.findByCreaEmpleado", query = "SELECT e FROM Empleado e WHERE e.creaEmpleado = :creaEmpleado")
    , @NamedQuery(name = "Empleado.findByFotoEmpleado", query = "SELECT e FROM Empleado e WHERE e.fotoEmpleado = :fotoEmpleado")
    , @NamedQuery(name = "Empleado.findByGeneroEmpleado", query = "SELECT e FROM Empleado e WHERE e.generoEmpleado = :generoEmpleado")
    , @NamedQuery(name = "Empleado.findByMailEmpleado", query = "SELECT e FROM Empleado e WHERE e.mailEmpleado = :mailEmpleado")
    , @NamedQuery(name = "Empleado.findByNombreEmpleado", query = "SELECT e FROM Empleado e WHERE e.nombreEmpleado = :nombreEmpleado")
    , @NamedQuery(name = "Empleado.findByTelefonoEmpleado", query = "SELECT e FROM Empleado e WHERE e.telefonoEmpleado = :telefonoEmpleado")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmpleadoPK empleadoPK;
    @Column(name = "activo_empleado")
    private Boolean activoEmpleado;
    @Column(name = "apellido_empleado")
    private String apellidoEmpleado;
    @Column(name = "ci_empleado")
    private String ciEmpleado;
    @Column(name = "crea_empleado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creaEmpleado;
    @Column(name = "foto_empleado")
    private String fotoEmpleado;
    @Column(name = "genero_empleado")
    private String generoEmpleado;
    @Column(name = "mail_empleado")
    private String mailEmpleado;
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    @Column(name = "telefono_empleado")
    private String telefonoEmpleado;
    @JoinColumns({
            @JoinColumn(name = "agencia_id_agencia", referencedColumnName = "id_agencia", insertable = false, updatable = false)
            , @JoinColumn(name = "agencia_zona_estructural_id_ciudad", referencedColumnName = "zona_estructural_id_ciudad", insertable = false, updatable = false)
            , @JoinColumn(name = "agencia_zona_estructural_id_zona_estructural", referencedColumnName = "zona_estructural_id_zona_estructural", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    @JsonIgnore
    @NotFound(action= NotFoundAction.IGNORE)
    private Agencia agencia;
    @OneToMany(mappedBy = "empleado")
    private List<RolHasEmpleado> rolHasEmpleadoList;

    public Empleado() {
    }

    public Empleado(EmpleadoPK empleadoPK) {
        this.empleadoPK = empleadoPK;
    }

    public Empleado(long idEmpleado, long agenciaIdAgencia, long agenciaZonaEstructuralIdCiudad, long agenciaZonaEstructuralIdZonaEstructural) {
        this.empleadoPK = new EmpleadoPK(idEmpleado, agenciaIdAgencia, agenciaZonaEstructuralIdCiudad, agenciaZonaEstructuralIdZonaEstructural);
    }

    public EmpleadoPK getEmpleadoPK() {
        return empleadoPK;
    }

    public void setEmpleadoPK(EmpleadoPK empleadoPK) {
        this.empleadoPK = empleadoPK;
    }

    public Boolean getActivoEmpleado() {
        return activoEmpleado;
    }

    public void setActivoEmpleado(Boolean activoEmpleado) {
        this.activoEmpleado = activoEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getCiEmpleado() {
        return ciEmpleado;
    }

    public void setCiEmpleado(String ciEmpleado) {
        this.ciEmpleado = ciEmpleado;
    }

    public Date getCreaEmpleado() {
        return creaEmpleado;
    }

    public void setCreaEmpleado(Date creaEmpleado) {
        this.creaEmpleado = creaEmpleado;
    }

    public String getFotoEmpleado() {
        return fotoEmpleado;
    }

    public void setFotoEmpleado(String fotoEmpleado) {
        this.fotoEmpleado = fotoEmpleado;
    }

    public String getGeneroEmpleado() {
        return generoEmpleado;
    }

    public void setGeneroEmpleado(String generoEmpleado) {
        this.generoEmpleado = generoEmpleado;
    }

    public String getMailEmpleado() {
        return mailEmpleado;
    }

    public void setMailEmpleado(String mailEmpleado) {
        this.mailEmpleado = mailEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @XmlTransient
    public List<RolHasEmpleado> getRolHasEmpleadoList() {
        return rolHasEmpleadoList;
    }

    public void setRolHasEmpleadoList(List<RolHasEmpleado> rolHasEmpleadoList) {
        this.rolHasEmpleadoList = rolHasEmpleadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empleadoPK != null ? empleadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.empleadoPK == null && other.empleadoPK != null) || (this.empleadoPK != null && !this.empleadoPK.equals(other.empleadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Empleado[ empleadoPK=" + empleadoPK + " ]";
    }

}
