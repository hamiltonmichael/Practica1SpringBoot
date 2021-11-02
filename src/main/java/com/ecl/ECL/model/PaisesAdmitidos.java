package com.ecl.ECL.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Clase PaisesAdmitidos, en la que se guardan los paises de los equipos que pueden participar en
 * cada competición. Si un equipo pertenece a un país que no esté incluido en la lista de
 * países que pueden participar en la competición que se desea incluir, este equipo no podrá
 * ser añadido.
 */
@Entity
@IdClass(PaisesAdmitidos.class)
@Table(name="Paises_Admitidos")
public class PaisesAdmitidos implements Serializable {
    @Id
    private long idCompeticion;
    @Id
    private String pais;

    /**
     * Constructor por defecto.
     */
    public PaisesAdmitidos() {}

    /**
     * Constructor con todos los parámetros incluidos.
     * @param idCompeticion
     * @param pais
     */
    public PaisesAdmitidos(long idCompeticion, String pais) {
        this.idCompeticion = idCompeticion;
        this.pais = pais;
    }

    /**
     * Este método devuelve el id de la competicion.
     * @return idCompeticion
     */
    public long getIdCompeticion() {
        return idCompeticion;
    }

    /**
     * Este método permite establecer un valor específico al id de la competición.
     * @param idCompeticion
     */
    public void setIdCompeticion(long idCompeticion) {
        this.idCompeticion = idCompeticion;
    }

    /**
     * Este método devuelve el nombre del país.
     * @return Pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Este método permite establecer un valor específico (String) al parámetro pais.
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Este método muestra todos los datos (id de la competición y país)
     * de los paises admitidos.
     */
    @Override
    public String toString() {
        return "PaisesAdmitidos{" +
                "idCompeticion=" + idCompeticion +
                ", pais='" + pais + '\'' +
                '}';
    }

}
