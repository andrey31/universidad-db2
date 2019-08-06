package com.database2.universidad.models.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CuotasFinanciado
 */
@Entity
@Table(name = "cuotas_financiado")
public class CuotasFinanciado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date fecha;

    private double monto;

    private boolean aplicado;

    @ManyToOne
    @JoinColumn(name = "fk_pago")
    private Pago pago;

    public CuotasFinanciado() {
    }

    public CuotasFinanciado(int id, Date fecha, double monto, boolean aplicado, Pago pago) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.aplicado = aplicado;
        this.pago = pago;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isAplicado() {
        return this.aplicado;
    }

    public boolean getAplicado() {
        return this.aplicado;
    }

    public void setAplicado(boolean aplicado) {
        this.aplicado = aplicado;
    }

    public Pago getPago() {
        return this.pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }    
}