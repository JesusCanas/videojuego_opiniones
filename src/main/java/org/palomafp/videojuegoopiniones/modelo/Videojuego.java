package org.palomafp.videojuegoopiniones.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa un videojuego con sus datos principales.
 */
public class Videojuego {
    private int codigo;
    private String nombre;
    private double precio;

    /**
     * Géneros de videojuegos disponibles.
     */
    public static enum Genero {
        ACCION, AVENTURA, ESTRATEGIA, DEPORTE, PUZZLE, RPG
    }

    private Genero genero;
    private Date fechaLanzamiento;
    private ArrayList<Resenya> resenyas;
    private ArrayList<Plataforma> plataformas;
    private Empresa empresa;

    /**
     * Crea un nuevo videojuego.
     *
     * @param codigo           Identificador único del videojuego.
     * @param nombre           Nombre del videojuego.
     * @param precio           Precio del videojuego.
     * @param genero           Género del videojuego.
     * @param fechaLanzamiento Fecha de lanzamiento del videojuego.
     * @param plataformas      Lista de plataformas donde está disponible.
     * @param resenyas         Lista de reseñas del videojuego.
     * @param empresa          Empresa responsable del videojuego.
     */
    public Videojuego(int codigo, String nombre, int precio, Genero genero, Date fechaLanzamiento, ArrayList<Plataforma> plataformas, ArrayList<Resenya> resenyas, Empresa empresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
        this.fechaLanzamiento = fechaLanzamiento;
        this.resenyas = resenyas;
        this.plataformas = plataformas;
        this.empresa = empresa;
    }

    /**
     * Obtiene el código único del videojuego.
     *
     * @return el código del videojuego.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código único del videojuego.
     *
     * @param codigo el código a asignar.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del videojuego.
     *
     * @return el nombre del videojuego.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del videojuego.
     *
     * @param nombre el nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del videojuego.
     *
     * @return el precio en la moneda utilizada.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del videojuego.
     *
     * @param precio el precio a asignar.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el género del videojuego.
     *
     * @return el género del videojuego.
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Establece el género del videojuego.
     *
     * @param genero el género a asignar.
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la fecha de lanzamiento del videojuego.
     *
     * @return la fecha de lanzamiento.
     */
    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * Establece la fecha de lanzamiento del videojuego.
     *
     * @param fechaLanzamiento la fecha a asignar.
     */
    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * Obtiene la lista de reseñas del videojuego.
     *
     * @return la lista de reseñas.
     */
    public ArrayList<Resenya> getResenyas() {
        return resenyas;
    }

    /**
     * Establece la lista de reseñas del videojuego.
     *
     * @param resenyas la lista de reseñas a asignar.
     */
    public void setResenyas(ArrayList<Resenya> resenyas) {
        this.resenyas = resenyas;
    }

    /**
     * Obtiene la lista de plataformas en las que está disponible el videojuego.
     *
     * @return la lista de plataformas.
     */
    public ArrayList<Plataforma> getPlataformas() {
        return plataformas;
    }

    /**
     * Establece la lista de plataformas en las que está disponible el videojuego.
     *
     * @param plataformas la lista de plataformas a asignar.
     */
    public void setPlataformas(ArrayList<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }
    
    /**
     * Obtiene la empresa responsable del videojuego.
     *
     * @return la empresa creadora del videojuego.
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * Establece la empresa responsable del videojuego.
     *
     * @param empresa la empresa a asignar.
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Genera una representación en texto del videojuego.
     *
     * @return una cadena con los datos principales del videojuego.
     */
    @Override
    public String toString() {
        return "Videojuego{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", genero=" + genero +
                ", fechaLanzamiento=" + fechaLanzamiento +
                "\n Datos de la empresa del videojuego \n" + getEmpresa()+
                " \n Datos de sus plataformas \n" + getPlataformas()+
                "\n Sus reseñas \n" + getResenyas() +
                '}';
    }

}
