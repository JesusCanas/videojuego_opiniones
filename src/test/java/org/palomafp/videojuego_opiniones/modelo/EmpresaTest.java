package org.palomafp.videojuego_opiniones.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palomafp.videojuegoopiniones.modelo.Empresa;

/**
 * Pruebas unitarias básicas para la clase Empresa
 */
public class EmpresaTest {

    private Empresa empresa;

    @BeforeEach
    public void setUp() {
        empresa = new Empresa(12212, "Nintendo", 100, null);
    }

    // Pruebas del Constructor
    @Test
    public void testConstructor() {
        assertNotNull(empresa);
        assertEquals(12212, empresa.getCodigo());
        assertEquals("Nintendo", empresa.getNombre());
        assertEquals(100, empresa.getAnyosActividad());
    }

    @Test
    public void testConstructorConDiferentesEmpresas() {
        Empresa sony = new Empresa(1, "Sony", 75, null);
        assertEquals("Sony", sony.getNombre());
        assertEquals(75, sony.getAnyosActividad());
        
        Empresa microsoft = new Empresa(2, "Microsoft", 50, null);
        assertEquals("Microsoft", microsoft.getNombre());
        assertEquals(50, microsoft.getAnyosActividad());
    }

    // Pruebas de toString
    @Test
    public void testToString() {
        String toStr = empresa.toString();
        assertNotNull(toStr);
        assertTrue(toStr.contains("12212"));
        assertTrue(toStr.contains("Nintendo"));
        assertTrue(toStr.contains("100"));
    }

    @Test
    public void testToStringNoVacio() {
        String toStr = empresa.toString();
        assertFalse(toStr.isEmpty());
    }

}
