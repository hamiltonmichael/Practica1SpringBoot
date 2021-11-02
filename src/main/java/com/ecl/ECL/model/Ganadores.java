package com.ecl.ECL.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Equipos_Ganadores")
public class Ganadores {
    @Id
    private long idCompeticion;
    @Id
    private String season;
    @Column(nullable = false)
    private long idEquipo;

    public Ganadores() {}

    public Ganadores(long idCompeticion, String season, long idEquipo) {
        this.idCompeticion = idCompeticion;
        this.season = season;
        this.idEquipo = idEquipo;
    }

    public long getIdCompeticion() {
        return idCompeticion;
    }

    public void setIdCompeticion(long idCompeticion) {
        this.idCompeticion = idCompeticion;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(long idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public String toString() {
        return "Ganadores{" +
                "idCompeticion=" + idCompeticion +
                ", season='" + season + '\'' +
                ", idEquipo=" + idEquipo +
                '}';
    }
}
