package com.database2.universidad.models.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Pago
 */
@Entity
@Table(name = "pagos")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double montoMatricula;

    private double montoMaterias;
    
    private double descuentoMatricula;

    private boolean financiado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_matricula")
    @JsonIgnore
    private Matricula matricula;

    @ManyToOne
    @JoinColumn(name = "fk_metodo_pago")
    private MetodoPago metodoPago;

    @OneToMany(mappedBy = "pago")
    private List<CuotasFinanciado> cuotasFinanciado;


    public Pago() {
    }

    public Pago(int id, double montoMatricula, double montoMaterias, double descuentoMatricula, boolean financiado, Matricula matricula, MetodoPago metodoPago, List<CuotasFinanciado> cuotasFinanciado) {
        this.id = id;
        this.montoMatricula = montoMatricula;
        this.montoMaterias = montoMaterias;
        this.descuentoMatricula = descuentoMatricula;
        this.financiado = financiado;
        this.matricula = matricula;
        this.metodoPago = metodoPago;
        this.cuotasFinanciado = cuotasFinanciado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontoMatricula() {
        return this.montoMatricula;
    }

    public void setMontoMatricula(double montoMatricula) {
        this.montoMatricula = montoMatricula;
    }

    public double getMontoMaterias() {
        return this.montoMaterias;
    }

    public void setMontoMaterias(double montoMaterias) {
        this.montoMaterias = montoMaterias;
    }

    public double getDescuentoMatricula() {
        return this.descuentoMatricula;
    }

    public void setDescuentoMatricula(double descuentoMatricula) {
        this.descuentoMatricula = descuentoMatricula;
    }

    public boolean isFinanciado() {
        return this.financiado;
    }

    public boolean getFinanciado() {
        return this.financiado;
    }

    public void setFinanciado(boolean financiado) {
        this.financiado = financiado;
    }

    public Matricula getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public MetodoPago getMetodoPago() {
        return this.metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<CuotasFinanciado> getCuotasFinanciado() {
        return this.cuotasFinanciado;
    }

    public void setCuotasFinanciado(List<CuotasFinanciado> cuotasFinanciado) {
        this.cuotasFinanciado = cuotasFinanciado;
    }
}