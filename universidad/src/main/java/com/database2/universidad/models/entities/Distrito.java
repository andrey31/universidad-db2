package com.database2.universidad.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Distrito
 */
@Entity
@Table(name = "distritos")
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String distrito;

    @ManyToOne
    @JoinColumn(name = "fk_canton")
    private Canton canton;


    public Distrito() {
    }

    public Distrito(int id, String distrito, Canton canton) {
        this.id = id;
        this.distrito = distrito;
        this.canton = canton;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrito() {
        return this.distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Canton getCanton() {
        return this.canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }    
}