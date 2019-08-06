package com.database2.universidad.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Canton
 */
@Entity
@Table(name = "cantones")
public class Canton {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String canton;

    @ManyToOne
    @JoinColumn(name = "fk_provincia")
    private Provincia provincia;


    public Canton() {
    }

    public Canton(int id, String canton, Provincia provincia) {
        this.id = id;
        this.canton = canton;
        this.provincia = provincia;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCanton() {
        return this.canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public Provincia getProvincia() {
        return this.provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }    
}