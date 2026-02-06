package org.palomafp.videojuego_opiniones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.palomafp.videojuegoopiniones.App;

/**
 * Pruebas unitarias para la clase App
 */
public class AppTest {

    @Test
    public void testAppMain() {
        try {
            App.main(new String[] {});
        } catch (Exception e) {
            fail("App.main() no debería lanzar excepción: " + e.getMessage());
        }
    }

}
