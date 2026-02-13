package org.palomafp.videojuego_opiniones.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palomafp.videojuegoopiniones.modelo.Plataforma;

/**
 * Pruebas unitarias básicas para la clase Plataforma
 */
public class PlataformaTest {

    private Plataforma plataforma;

    @BeforeEach
    public void setUp() {
        plataforma = new Plataforma(445, "Nintendo 3DS", Plataforma.Marca.NINTENDO, "Azul", 100, null);
    }

    // Pruebas del Constructor
    @Test
    public void testConstructor() {
        assertNotNull(plataforma);
        assertEquals(445, plataforma.getCodigo());
        assertEquals("Nintendo 3DS", plataforma.getModelo());
        assertEquals(Plataforma.Marca.NINTENDO, plataforma.getMarca());
        assertEquals("Azul", plataforma.getColor());
        assertEquals(100, plataforma.getCapacidad());
    }

    @Test
    public void testConstructorConDiferentesMarcas() {
        Plataforma ps4 = new Plataforma(1, "PS4", Plataforma.Marca.SONY, "Negra", 500, null);
        assertEquals(Plataforma.Marca.SONY, ps4.getMarca());
        
        Plataforma xbox = new Plataforma(2, "Xbox One", Plataforma.Marca.MICROSOFT, "Negra", 1000, null);
        assertEquals(Plataforma.Marca.MICROSOFT, xbox.getMarca());
    }

    // Pruebas de toString
    @Test
    public void testToString() {
        String toStr = plataforma.toString();
        assertNotNull(toStr);
        assertTrue(toStr.contains("445"));
        assertTrue(toStr.contains("Nintendo 3DS"));
        assertTrue(toStr.contains("NINTENDO"));
        assertTrue(toStr.contains("Azul"));
        assertTrue(toStr.contains("100"));
    }

    @Test
    public void testToStringNoVacio() {
        String toStr = plataforma.toString();
        assertFalse(toStr.isEmpty());
    }

}
