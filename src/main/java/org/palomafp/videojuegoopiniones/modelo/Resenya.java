package org.palomafp.videojuegoopiniones.modelo;

import java.util.Date;

public class Resenya {
    private double puntuacion;
    private String comentarios;
    private Date fecha;

    public Resenya(double puntuacion, String comentarios, Date fecha) {
        this.puntuacion = puntuacion;
        this.comentarios = comentarios;
        this.fecha = fecha;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Resenya{" +
                "puntuacion=" + puntuacion +
                ", comentarios='" + comentarios + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
