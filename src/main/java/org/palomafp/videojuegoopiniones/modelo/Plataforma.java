package org.palomafp.videojuegoopiniones.modelo;

import java.util.ArrayList;
/**
 * Clase que tienen los datos de la plataforma que hace los videojuegos
 * @author Jesús Cañas Y Miguel Martin 
 */
public class Plataforma {
    private int codigo;
    private String modelo;
    /**
     * emun de las marcas de las videojuegos
     */
    public static enum Marca {
        SONY, MICROSOFT, NINTENDO, PC, SEGA
    }
    private Marca marca;
    private String color;
    private int capacidad;
     private ArrayList<Videojuego> videojuegos;
    /**
     * constructor de la clase plataforma
     * @param codigo instancia el codigo de  la plataforma
     * @param modelo instancia el modelo
     * @param marca instancia el color
     * @param color
     * @param capacidad
     */
    public Plataforma(int codigo, String modelo, Marca marca, String color, int capacidad) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.capacidad = capacidad;
        this.videojuegos = new ArrayList<>(); // inicializamos el arrayList de videojuegos pero no lo ponermos en el constructor
    }
     /**
     * Obtiene el código único de plataforma.
     *
     * @return el código de plataforma.
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Obtiene el modelo de plataforma.
     *
     * @return el modelo de plataforma.
     */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Obtiene la marca de plataforma.
     *
     * @return la marca de plataforma.
     */
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Videojuego>  getVideojuego() {
        return videojuegos;
    }

    public void setVideojuego(ArrayList<Videojuego> videojuego) {
        this.videojuegos = videojuego;
    }
    /**
     * Añade el objeto videojuego al arraylist
     * @param videojuego parametro del objeto videojuego
     */
    public void addVideojuego(Videojuego videojuego) {
        this.videojuegos.add(videojuego);
    }
    /**
     * muestra la informacion de la plataforma
     */
    @Override
    public String toString() {
        return "Plataforma{" +
                "codigo=" + codigo +
                ", modelo='" + modelo + '\'' +
                ", marca=" + marca +
                ", color='" + color + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
