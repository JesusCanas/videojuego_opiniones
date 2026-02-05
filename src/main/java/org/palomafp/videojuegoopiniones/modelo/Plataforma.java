package org.palomafp.videojuegoopiniones.modelo;

public class Plataforma {
    private int codigo;
    private String modelo;
    public static enum Marca {
        SONY, MICROSOFT, NINTENDO, PC, SEGA
    }
    private Marca marca;
    private String color;
    private int capacidad;
    private Videojuego videojuego;

    public Plataforma(int codigo, String modelo, Marca marca, String color, int capacidad) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.capacidad = capacidad;
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

    public Videojuego getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(Videojuego videojuego) {
        this.videojuego = videojuego;
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
