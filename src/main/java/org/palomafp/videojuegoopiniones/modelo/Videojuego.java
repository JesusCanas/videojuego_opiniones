package org.palomafp.videojuegoopiniones.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Videojuego {
    private int codigo;
    private String nombre;
    private double precio;
    public static enum Genero {
        ACCION, AVENTURA, ESTRATEGIA, DEPORTE, PUZZLE, RPG
    }
    private Genero genero;
    private Date fechaLanzamiento;
    private ArrayList<Resenya> resenyas;
    private ArrayList<Plataforma> plataformas;

    public Videojuego(int codigo, String nombre, int precio, Genero genero, Date fechaLanzamiento,ArrayList<Plataforma> plataformas, ArrayList<Resenya> resenyas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
        this.fechaLanzamiento = fechaLanzamiento;
        this.resenyas = resenyas;
        this.plataformas = plataformas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public ArrayList<Resenya> getResenyas() {
        return resenyas;
    }

    public void setResenyas(ArrayList<Resenya> resenyas) {
        this.resenyas = resenyas;
    }

    public ArrayList<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(ArrayList<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", genero=" + genero +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}';
    }
}
