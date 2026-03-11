package org.palomafp.videojuegoopiniones;

import java.util.Scanner;

/**
 * Aplicación principal para demostrar el modelo de datos de videojuegos
 */
public class App {

    public static void main(String[] args) {
        run(new Scanner(System.in), System.out);
    }

    /**
     * Ejecuta el menú de la aplicación usando un Scanner y un PrintStream proporcionados.
     * Esto facilita las pruebas unitarias sin depender de System.in/System.out.
     */
    public static void run(Scanner sc, java.io.PrintStream out) {
        int menu;
        int id;
        out.println("=== SISTEMA DE OPINIONES DE VIDEOJUEGOS ===");

        // Crear instancia de DatosDao que gestiona todas las entidades
        VideojuegosDAO dao = new VideojuegosDAO();
        
        do {
            System.out.println("\n------------ MENU ------------");
            System.out.println("1. Mostrar videojuego random");
            System.out.println("2. Mostrar videojuego por id");
            System.out.println("3. Mostrar todo los videojuegos.");
            System.out.println("4. Salir");
            System.out.println("------------------------------");
            System.out.print("Seleccione una opción: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    out.print(dao.getVideojuegoRandom());
                    break;
                case 2:
                    out.print("Introduce el id del videojuego:");
                    id=sc.nextInt();
                    out.print(dao.getVideojuegoById(id));
                    break;
                case 3:
                    
                case 4:
                    out.println("Saliendo del programa...");
                    break;

                default:
                    out.println("Opción no válida. Intente de nuevo.");
            }

        } while (menu != 4);
        sc.close();
        out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
