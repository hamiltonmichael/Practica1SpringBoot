package com.ecl.ECL.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Clase Ganadores, en la que se guardan los equipos que han ganado una competicion determinada (mostrada
 * con el id de la competicion) y la temporada en la que dicho equipo ganó la competición.
 */
@Entity
@IdClass(Ganadores.class)
@Table(name="Equipos_Ganadores")
public class Ganadores implements Serializable {
    @Id
    private long idCompeticion;
    @Id
    private String season;
    @Column(nullable = false)
    private long idEquipo;

    /**
     * Constructor por defecto.
     */
    public Ganadores() {}

    /**
     * Constructor con todos los parámetros incluidos.
     * @param idCompeticion
     * @param season
     * @param idEquipo
     */
    public Ganadores(long idCompeticion, String season, long idEquipo) {
        this.idCompeticion = idCompeticion;
        this.season = season;
        this.idEquipo = idEquipo;
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
     * Este método devuelve la temporada en la que un determinado equipo ganó una determinada competicion.
     * @return season
     */
    public String getSeason() {
        return season;
    }

    /**
     * Este método permite establecer un valor para la temporada en la que
     * un determinado equipo ganó una determinada competicion.
     * @param season
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     * Este método devuelve el id de un equipo determinado.
     * @return idEquipo
     */
    public long getIdEquipo() {
        return idEquipo;
    }

    /**
     * Este método permite establecer un valor para el id de la competicion.
     * @param idEquipo
     */
    public void setIdEquipo(long idEquipo) {
        this.idEquipo = idEquipo;
    }

    /**
     * Este método muestra todos los datos (id de la competición, temporada e id del equipo ganador)
     * del ganador de la competición.
     */
    @Override
    public String toString() {
        return "Ganadores{" +
                "idCompeticion=" + idCompeticion +
                ", season='" + season + '\'' +
                ", idEquipo=" + idEquipo +
                '}';
    }
}
