package com.ecl.ECL.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Competicion")
public class Competicion {
    private @Id @GeneratedValue long idCompeticion;
    private String nameCompeticion;

    public Competicion() {}

    public Competicion(String nameCompeticion) {
        this.nameCompeticion = nameCompeticion;
    }

    public long getIdCompeticion() {
        return idCompeticion;
    }

    public void setIdCompeticion(long idCompeticion) {
        this.idCompeticion = idCompeticion;
    }

    public String getNameCompeticion() {
        return nameCompeticion;
    }

    public void setNameCompeticion(String nameCompeticion) {
        this.nameCompeticion = nameCompeticion;
    }

    @Override
    public String toString() {
        return "Competicion{" +
                "idCompeticion=" + idCompeticion +
                ", nameCompeticion='" + nameCompeticion + '\'' +
                '}';
    }
}
