package org.palomafp.videojuego_opiniones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.palomafp.videojuegoopiniones.DatosDao;

/**
 * Pruebas básicas para DatosDao
 */
public class DatosDaoTest {

    private DatosDao datosDao;

    @BeforeEach
    public void setUp() {
        datosDao = new DatosDao();
    }

    @Test
    public void testConstructor() {
        assertNotNull(datosDao);
        assertTrue(datosDao instanceof DatosDao);
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
        DatosDao d1 = new DatosDao();
        DatosDao d2 = new DatosDao();
        assertNotNull(d1);
        assertNotNull(d2);
        assertNotSame(d1, d2);
    }

}
