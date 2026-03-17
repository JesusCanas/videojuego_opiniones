package org.palomafp.videojuegoopiniones.modelo;

import java.util.Date;

/**
 * Modelo que representa una reseña de videojuego.
 *
 * <p>Contiene información de la puntuación, los comentarios del usuario y la fecha
 * en que se creó la reseña.</p>
 */
public class Resenya {
    /** Valor numérico de la valoración, típicamente en un rango 0.0-10.0 u otro definido. */
    private double puntuacion;
    /** Comentarios textuales que proporciona el usuario junto con la puntuación. */
    private String comentarios;
    /** Fecha en que se realizó la reseña. */
    private Date fecha;

    /**
     * Constructor principal de Resenya.
     *
     * @param puntuacion Valoración numérica de la reseña
     * @param comentarios Texto del comentario del usuario
     * @param fecha Fecha de creación de la reseña
     */
    public Resenya(double puntuacion, String comentarios, Date fecha) {
        this.puntuacion = puntuacion;
        this.comentarios = comentarios;
        this.fecha = fecha;
    }

    /**
     * Obtener la puntuación de la reseña.
     *
     * @return puntuación actual
     */
    public double getPuntuacion() {
        return puntuacion;
    }

    /**
     * Establecer una nueva puntuación para la reseña.
     *
     * @param puntuacion nueva puntuación
     */
    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Obtener los comentarios de la reseña.
     *
     * @return texto de comentarios
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Establecer los comentarios de la reseña.
     *
     * @param comentarios texto de comentarios
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * Obtener la fecha de la reseña.
     *
     * @return fecha de la reseña
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establecer la fecha de la reseña.
     *
     * @param fecha fecha de creación o publicación
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve representación de texto de la reseña.
     *
     * @return cadena con los campos de la reseña
     */
    @Override
    public String toString() {
        return "Resenya{" +
                "puntuacion=" + puntuacion +
                ", comentarios='" + comentarios + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
