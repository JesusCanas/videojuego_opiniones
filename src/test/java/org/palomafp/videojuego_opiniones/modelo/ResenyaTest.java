package org.palomafp.videojuego_opiniones.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palomafp.videojuegoopiniones.modelo.Resenya;

/**
 * Pruebas unitarias básicas para la clase Resenya
 */
public class ResenyaTest {

    private Resenya resenya;
    private Date fecha;

    @BeforeEach
    public void setUp() {
        fecha = new Date(2025 - 1900, 6, 22);
        resenya = new Resenya(4.5, "Buenísimo", fecha);
    }

    // Pruebas del Constructor
    @Test
    public void testConstructor() {
        assertNotNull(resenya);
        assertEquals(4.5, resenya.getPuntuacion(), 0.0);
        assertEquals("Buenísimo", resenya.getComentarios());
        assertEquals(fecha, resenya.getFecha());
    }

    @Test
    public void testConstructorConDiferentesPuntuaciones() {
        Resenya excelente = new Resenya(5.0, "Perfecto", new Date());
        assertEquals(5.0, excelente.getPuntuacion(), 0.0);
        
        Resenya malo = new Resenya(2.0, "Muy malo", new Date());
        assertEquals(2.0, malo.getPuntuacion(), 0.0);
    }

    // Pruebas de toString
    @Test
    public void testToString() {
        String toStr = resenya.toString();
        assertNotNull(toStr);
        assertTrue(toStr.contains("4.5"));
        assertTrue(toStr.contains("Buenísimo"));
    }

    @Test
    public void testToStringNoVacio() {
        String toStr = resenya.toString();
        assertFalse(toStr.isEmpty());
    }

}
