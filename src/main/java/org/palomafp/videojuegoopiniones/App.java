package org.palomafp.videojuegoopiniones;

/**
 * Aplicación principal para demostrar el modelo de datos de videojuegos
 */
public class App 
{
    public static void main( String[] args )
    {

        int menu = 0;
        System.out.println("=== SISTEMA DE OPINIONES DE VIDEOJUEGOS ===");

        // Crear instancia de DatosDao que gestiona todas las entidades

        

        do {
            System.out.println("------------Menu------------");
            System.out.println("1. mostrar videojuegos");
            System.out.println("2. mostrar plataformas");
            System.out.println("3. mostrar reseñas");
            System.out.println("4. mostrar Empresas");
            System.out.println("----------------------------");
            
            switch (menu) {
                case 1:
                    
                    break;
            
                case 2:
                    break;

            }
        } while (menu != 5);

        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
