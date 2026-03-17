package org.palomafp.videojuegoopiniones.modelo;

import java.util.ArrayList;

/**
 * Modelo que representa una empresa desarrolladora o editora de videojuegos.
 *
 * <p>Incluye los datos básicos de identificación y la lista de videojuegos asociados.</p>
 */
public class Empresa {
    /** Identificador único de la empresa. */
    private int codigo;
    /** Nombre de la empresa. */
    private String nombre;
    /** Años de actividad de la empresa. */
    private int anyosActividad;
    /** Videojuegos asociados a la empresa. */
    private ArrayList<Videojuego> videojuegos;

    /**
     * Constructor de empresa.
     *
     * @param codigo Identificador único
     * @param nombre Nombre de la empresa
     * @param anyosActividad Años que lleva activa
     */
    public Empresa(int codigo, String nombre, int anyosActividad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anyosActividad = anyosActividad;
        this.videojuegos = new ArrayList<>();
    }

    /**
     * Obtiene el código de la empresa.
     *
     * @return código actual
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código de la empresa.
     *
     * @param codigo nuevo identificador
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre de la empresa.
     *
     * @return nombre actual
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la empresa.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los años de actividad de la empresa.
     *
     * @return años en actividad
     */
    public int getAnyosActividad() {
        return anyosActividad;
    }

    /**
     * Establece los años de actividad de la empresa.
     *
     * @param anyosActividad años en actividad
     */
    public void setAnyosActividad(int anyosActividad) {
        this.anyosActividad = anyosActividad;
    }

    /**
     * Obtiene la lista de videojuegos asociados.
     *
     * @return lista de videojuegos
     */
    public ArrayList<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    /**
     * Establece la lista de videojuegos asociados.
     *
     * @param videojuegos lista de videojuegos
     */
    public void setVideojuegos(ArrayList<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    /**
     * Añade un videojuego a la empresa.
     *
     * @param videojuego videojuego a añadir
     */
    public void addVideojuego(Videojuego videojuego) {
        this.videojuegos.add(videojuego);
    }

    /**
     * Representación textual de la empresa.
     *
     * @return cadena con campos principales
     */
    @Override
    public String toString() {
        return "Empresa{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", anyosActividad=" + anyosActividad +
                '}';
    }
}
