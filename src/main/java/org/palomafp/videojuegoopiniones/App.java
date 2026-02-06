package org.palomafp.videojuegoopiniones;

/**
 * Aplicación principal para demostrar el modelo de datos de videojuegos
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("=== SISTEMA DE OPINIONES DE VIDEOJUEGOS ===");
        
        // Crear instancia de DatosDao que gestiona todas las entidades
        DatosDao datosDao = new DatosDao();
        
        // Demostrar todos los métodos de todas las clases del modelo
        datosDao.demostrarTodo();
        
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
