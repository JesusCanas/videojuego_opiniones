package org.palomafp.videojuego_opiniones;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.palomafp.videojuegoopiniones.App;
import org.palomafp.videojuegoopiniones.VideojuegosDao;
import org.palomafp.videojuegoopiniones.modelo.Videojuego;

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
    public void testConstructorInicializaListas() {
        assertNotNull(datosDao);
        assertTrue(datosDao instanceof VideojuegosDao);

        assertNotNull(datosDao.getVideojuegos());
        assertEquals(3, datosDao.getVideojuegos().size(), "Debe inicializar 3 videojuegos por defecto");

        boolean todosSonVideojuegos = true;
        for (Object elemento : datosDao.getVideojuegos()) {
            if (!(elemento instanceof Videojuego)) {
                todosSonVideojuegos = false;
                break;
            }
        }
        assertTrue(todosSonVideojuegos, "Todos los elementos devueltos deben ser instancia de Videojuego");
    }

    @Test
    public void testGetVideojuegoByIdFunciona() {
        Videojuego videojuego = datosDao.getVideojuegoById(444);
        assertNotNull(videojuego, "Debe encontrar el videojuego con id 444");
        assertEquals(444, videojuego.getCodigo());
        assertEquals("Pokemon", videojuego.getNombre());

        Videojuego noExiste = datosDao.getVideojuegoById(-1);
        assertNull(noExiste, "Debe devolver null para un id que no existe");
    }

    @Test
    public void testGetVideojuegoRandomDevuelveElementoValido() {
        Videojuego random = datosDao.getVideojuegoRandom();
        assertNotNull(random, "El método debe devolver un videojuego no nulo");

        boolean encontrado = false;
        for (Videojuego v : datosDao.getVideojuegos()) {
            if (v.getCodigo() == random.getCodigo()) {
                encontrado = true;
                break;
            }
        }
        assertTrue(encontrado, "El videojuego aleatorio debe pertenecer a la lista de videojuegos");
    }

    @Test
    public void testMultiplesInstanciasIndependientes() {
        VideojuegosDao d1 = new VideojuegosDao();
        VideojuegosDao d2 = new VideojuegosDao();
        assertNotNull(d1);
        assertNotNull(d2);
        assertNotSame(d1, d2);

        // Asegurar que cada instancia tiene su propia lista de videojuegos
        assertNotSame(d1.getVideojuegos(), d2.getVideojuegos());
        assertEquals(d1.getVideojuegos().size(), d2.getVideojuegos().size());
    }

    @Test
    public void testAppMainNoLanzaExcepcionYSaleCorrectamente() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bufferOut = new ByteArrayOutputStream();

        try {
            System.setIn(new ByteArrayInputStream("6\n".getBytes()));
            System.setOut(new PrintStream(bufferOut));

            App.main(new String[0]);

            String output = bufferOut.toString();
            assertTrue(output.contains("=== SISTEMA DE OPINIONES DE VIDEOJUEGOS ==="));
            assertTrue(output.contains("Saliendo del programa"), "Debe mostrar mensaje de salida");
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

}
