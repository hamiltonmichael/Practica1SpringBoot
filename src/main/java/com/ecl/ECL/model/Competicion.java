package com.ecl.ECL.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase Competicion, en la que se guardan los atributos especificos de cada competicion (en este caso,
 * por ahora, solo tenemos definido la Europa Champions League), incluyendo el numero identificador de
 * cada competicion.
 */
@Entity
@Table(name="Competicion")
public class Competicion {
    private @Id @GeneratedValue long idCompeticion;
    private String nombreCompeticion;

    /**
     * Constructor por defecto.
     */
    public Competicion() {}

    /**
     * Constructor con el nombre de la competicion como parámetro, para poder definir dicha competición.
     * @param nombreCompeticion
     */
    public Competicion(String nombreCompeticion) {
        this.nombreCompeticion = nombreCompeticion;
    }

    /**
     * Este método devuelve el id de la competicion.
     * @return idCompeticion
     */
    public long getIdCompeticion() {
        return idCompeticion;
    }

    /**
     * Este método permite establecer un valor especifico al id de la competicion.
     * @param idCompeticion
     */
    public void setIdCompeticion(long idCompeticion) {
        this.idCompeticion = idCompeticion;
    }

    /**
     * Este método devuelve el nombre de la competicion.
     * @return nombreCompeticion
     */
    public String getNombreCompeticion() {
        return nombreCompeticion;
    }

    /**
     * Este método permite establecer un valor (String) al nombre de la competicion
     * @param nombreCompeticion
     */
    public void setNombreCompeticion(String nombreCompeticion) {
        this.nombreCompeticion = nombreCompeticion;
    }

    /**
     * Este método muestra todos los datos (id y nombre) de la competición.
     */
    @Override
    public String toString() {
        return "Competicion{" +
                "idCompeticion=" + idCompeticion +
                ", nombreCompeticion='" + nombreCompeticion + '\'' +
                '}';
    }
}
