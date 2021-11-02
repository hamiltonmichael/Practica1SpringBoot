package com.ecl.ECL.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Paises_Admitidos")
public class PaisesAdmitidos {
    @Id
    private long idCompeticion;
    @Id
    private String pais;

    public PaisesAdmitidos() {}

    public PaisesAdmitidos(long idCompeticion, String pais) {
        this.idCompeticion = idCompeticion;
        this.pais = pais;
    }

    public long getIdCompeticion() {
        return idCompeticion;
    }

    public void setIdCompeticion(long idCompeticion) {
        this.idCompeticion = idCompeticion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "PaisesAdmitidos{" +
                "idCompeticion=" + idCompeticion +
                ", pais='" + pais + '\'' +
                '}';
    }

}
