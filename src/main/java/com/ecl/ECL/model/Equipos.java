package com.ecl.ECL.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Clase Equipos, en la que se guardan los atributos especificos de cada equipo,
 * incluyendo el numero identificador de cada uno de ellos.
 */
@Entity
public class Equipos {                          //Clase Equipos
    private @Id @GeneratedValue Long id;                           //Atributos de Clase Equipos definidos (private)
    private String nombre;
    private String pais;
    private String equipoRivalHistoricamente;
    private String escudo;

    /**
     * Constructor por defecto.
     */

    public Equipos() {}                        //Constructor por defecto (vacío)

    /**
     * Constructor con parámetros obligatorios (sin rival historico).
     *
     * @param nombre
     * @param pais
     * @param escudo
     */

    public Equipos(String nombre, String pais, String escudo) {
        this.nombre = nombre;
        this.pais = pais;
        this.escudo = escudo;
    }

    /**
     * Constructor con todos los parámetros posibles, incluyendo Equipo Rival Históricamente.
     *
     * @param nombre
     * @param pais
     * @param equipoRivalHistoricamente
     * @param escudo
     */

    public Equipos(String nombre, String pais, String equipoRivalHistoricamente, String escudo) {       //Constructor con todos los atributos (incluye rival histórico)
        this.nombre = nombre;
        this.pais = pais;
        this.equipoRivalHistoricamente = equipoRivalHistoricamente;
        this.escudo = escudo; //
    }

    /**
     * Este método devuelve el id de un equipo determinado.
     *
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Este método permite establecer un valor determinado al parámetro id.
     *
     * @param id
     * @return void
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Este método devuelve el nombre de un equipo determinado.
     *
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Este método permite establecer un valor determinado al parámetro nombre.
     *
     * @param nombre
     * @return void
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método devuelve el pais de un equipo determinado.
     *
     * @return pais
     */
    public String getPais() {
        return this.pais;
    }

    /**
     * Este método permite establecer un valor determinado al parámetro pais.
     *
     * @param pais
     * @return void
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Este método devuelve el Equipo Rival Historicamente de un equipo determinado.
     *
     * @return equipoRivalHistoricamente
     */
    public String getEquipoRivalHistoricamente() {
        return this.equipoRivalHistoricamente;
    }

    /**
     * Este método permite establecer un valor determinado al parámetro equipoRivalHistoricamente.
     *
     * @param equipoRivalHistoricamente
     * @return void
     */
    public void setEquipoRivalHistoricamente(String equipoRivalHistoricamente) {
        this.equipoRivalHistoricamente = equipoRivalHistoricamente;
    }

    /**
     * Este método devuelve el escudo de un equipo determinado.
     *
     * @return escudo
     */
    public String getEscudo() {
        return this.escudo;
    }

    /**
     * Este método permite establecer un valor determinado al parámetro escudo.
     *
     * @param escudo
     * @return void
     */
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(!(obj instanceof Equipos))
            return false;
        Equipos equipos = (Equipos) obj;
        return Objects.equals(this.id, equipos.id) && Objects.equals(this.nombre, equipos.nombre)
                && Objects.equals(this.pais, equipos.pais) && Objects.equals(this.equipoRivalHistoricamente,equipos.equipoRivalHistoricamente) && Objects.equals(this.escudo, equipos.escudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.nombre,this.pais,this.equipoRivalHistoricamente,this.escudo);
    }
     */

    /**
     * Este método muestra los datos (id, nombre, pais, equipo rival y escudo) de un equipo determinado.
     * @return String
     */
    @Override
    public String toString() {
        return "Equipos{" +
                "id=" + this.id +
                ", nombre='" + this.nombre + '\'' +
                ", pais='" + this.pais + '\'' +
                ", equipoRivalHistoricamente='" + this.equipoRivalHistoricamente + '\'' +
                ", escudo='" + this.escudo + '\'' +
                '}';
    }
}
