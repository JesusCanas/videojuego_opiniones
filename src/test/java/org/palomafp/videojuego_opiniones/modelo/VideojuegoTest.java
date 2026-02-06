package org.palomafp.videojuego_opiniones.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palomafp.videojuegoopiniones.modelo.Videojuego;

/**
 * Pruebas unitarias básicas para la clase Videojuego
 */
public class VideojuegoTest {

    private Videojuego videojuego;
    private Date fechaLanzamiento;

    @BeforeEach
    public void setUp() {
        fechaLanzamiento = new Date(1997 - 1900, 6, 22);
        videojuego = new Videojuego(444, "Pokemon", 60, Videojuego.Genero.AVENTURA, fechaLanzamiento);
    }

    // Pruebas del Constructor
    @Test
    public void testConstructor() {
        assertNotNull(videojuego);
        assertEquals(444, videojuego.getCodigo());
        assertEquals("Pokemon", videojuego.getNombre());
        assertEquals(60, videojuego.getPrecio(), 0.0);
        assertEquals(Videojuego.Genero.AVENTURA, videojuego.getGenero());
        assertEquals(fechaLanzamiento, videojuego.getFechaLanzamiento());
    }

    @Test
    public void testConstructorConDiferentesGeneros() {
        Videojuego videojuegoRPG = new Videojuego(1, "Final Fantasy", 50, Videojuego.Genero.RPG, new Date());
        assertEquals(Videojuego.Genero.RPG, videojuegoRPG.getGenero());
    }

    // Pruebas de toString
    @Test
    public void testToString() {
        String toStr = videojuego.toString();
        assertNotNull(toStr);
        assertTrue(toStr.contains("444"));
        assertTrue(toStr.contains("Pokemon"));
        assertTrue(toStr.contains("AVENTURA"));
    }

    @Test
    public void testToStringNoVacio() {
        String toStr = videojuego.toString();
        assertFalse(toStr.isEmpty());
    }

}
