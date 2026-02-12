package org.palomafp.videojuegoopiniones.modelo;

import java.util.ArrayList;

public class Empresa {
    private int codigo;
    private String nombre;
    private int anyosActividad;
    private ArrayList<Videojuego> videojuegos;

    public Empresa(int codigo, String nombre, int anyosActividad,ArrayList<Videojuego> videojuegos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anyosActividad = anyosActividad;
        this.videojuegos = videojuegos;
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

    public int getAnyosActividad() {
        return anyosActividad;
    }

    public void setAnyosActividad(int anyosActividad) {
        this.anyosActividad = anyosActividad;
    }

    public ArrayList<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(ArrayList<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", anyosActividad=" + anyosActividad +
                '}';
    }
}
