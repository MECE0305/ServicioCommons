package com.cempresariales.servicio.commons.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "ponderadoporcategoria")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Ponderadoporcategoria.findAll", query = "SELECT p FROM Ponderadoporcategoria p")
        , @NamedQuery(name = "Ponderadoporcategoria.findByIdEvaluacion", query = "SELECT p FROM Ponderadoporcategoria p WHERE p.idEvaluacion = :idEvaluacion")
        , @NamedQuery(name = "Ponderadoporcategoria.findByIdCategoria", query = "SELECT p FROM Ponderadoporcategoria p WHERE p.idCategoria = :idCategoria")
        , @NamedQuery(name = "Ponderadoporcategoria.findByNombreCategoria", query = "SELECT p FROM Ponderadoporcategoria p WHERE p.nombreCategoria = :nombreCategoria")
        , @NamedQuery(name = "Ponderadoporcategoria.findBySuma", query = "SELECT p FROM Ponderadoporcategoria p WHERE p.suma = :suma")})

public class Ponderadoporcategoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic(optional = false)
    @Column(name = "id_evaluacion")
    private long idEvaluacion;
    @Basic(optional = false)
    @Column(name = "id_categoria")
    private long idCategoria;
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "suma")
    private Double suma;

    @Column(name = "peso_respuesta")
    private Double peso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ponderadoporcategoria() {
    }

    public long getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Double getSuma() {
        return suma;
    }

    public void setSuma(Double suma) {
        this.suma = suma;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
