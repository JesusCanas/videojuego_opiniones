package org.palomafp.videojuego_opiniones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.palomafp.videojuegoopiniones.VideojuegosDao;

/**
 * Pruebas básicas para DatosDao
 */
public class DatosDaoTest {

    private VideojuegosDao datosDao;

    @BeforeEach
    public void setUp() {
        datosDao = new VideojuegosDao();
    }

    @Test
    public void testConstructor() {
        assertNotNull(datosDao);
        assertTrue(datosDao instanceof VideojuegosDao);
    }

    @Test
    public void testDemostrarTodoNoLanzaExcepcion() {
        assertDoesNotThrow(() -> datosDao.demostrarTodo());
    }

    @Test
    public void testDemostrarVideojuegoNoLanzaExcepcion() {
        assertDoesNotThrow(() -> datosDao.demostrarVideojuego());
    }

    @Test
    public void testDemostrarPlataformaNoLanzaExcepcion() {
        assertDoesNotThrow(() -> datosDao.demostrarPlataforma());
    }

    @Test
    public void testMultiplesInstancias() {
        VideojuegosDao d1 = new VideojuegosDao();
        VideojuegosDao d2 = new VideojuegosDao();
        assertNotNull(d1);
        assertNotNull(d2);
        assertNotSame(d1, d2);
    }

}
