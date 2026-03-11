package org.palomafp.videojuegoopiniones.modelo;

import java.util.ArrayList;

public class Plataforma {
    private int codigo;
    private String modelo;
    public static enum Marca {
        SONY, MICROSOFT, NINTENDO, PC, SEGA
    }
    private Marca marca;
    private String color;
    private int capacidad;
     private ArrayList<Videojuego> videojuegos;

    public Plataforma(int codigo, String modelo, Marca marca, String color, int capacidad) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.capacidad = capacidad;
        this.videojuegos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

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
    public void addVideojuego(Videojuego videojuego) {
        this.videojuegos.add(videojuego);
    }

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
