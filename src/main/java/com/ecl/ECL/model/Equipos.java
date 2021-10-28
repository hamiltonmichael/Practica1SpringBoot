package com.ecl.ECL.model;

/**
 *
 */

public class Equipos {                          //Clase Equipos
    private int id = 0;                           //Atributos de Clase Equipos definidos (private)
    private static int contadorid = 0;
    private String nombre;
    private String pais;
    private String equipoRivalHistoricamente;
    private String escudo;

    /**
     * Constructor por defecto.
     */

    public Equipos() {                          //Constructor por defecto (vacío)
        contadorid++;
        this.id = contadorid;
    }

    /**
     * Constructor con parámetros obligatorios.
     *
     * @param nombre
     * @param pais
     * @param escudo
     */

    public Equipos(String nombre, String pais, String escudo) {     //Constructor con atributos obligatorios (sin rival histórico)
        contadorid++;
        this.id = contadorid;
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
        contadorid++;
        this.id = contadorid;
        this.nombre = nombre;
        this.pais = pais;
        this.equipoRivalHistoricamente = equipoRivalHistoricamente;
        this.escudo = escudo;
    }

    /**
     * Este método devuelve el id de un equipo determinado.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Este método permite establecer un valor determinado al parámetro id.
     *
     * @param id
     * @return void
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Este método devuelve el nombre de un equipo determinado.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
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
        return pais;
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
        return equipoRivalHistoricamente;
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
        return escudo;
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

}
