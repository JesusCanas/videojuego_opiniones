package org.palomafp.videojuegoopiniones;

import java.util.Scanner;

import org.palomafp.videojuegoopiniones.modelo.Plataforma;
import org.palomafp.videojuegoopiniones.modelo.Resenya;
import org.palomafp.videojuegoopiniones.modelo.Videojuego;

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
        VideojuegosDao dao = new VideojuegosDao();
        
        do {
            out.println("\n------------ MENU ------------");
            out.println("1. Mostrar videojuegos");
            out.println("2. Mostrar plataformas");
            out.println("3. Mostrar reseñas");
            out.println("4. Mostrar videojuego random");
            out.println("5.  Mostrar videojuego por id");
            out.println("6. Salir");
            out.println("------------------------------");
            out.print("Seleccione una opción: ");
            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    for (Videojuego v : dao.videojuegos) {
                        out.println(v);
                    }
                    break;

                case 2:
                    for (Plataforma p : dao.plataformas) {
                        out.println(p);
                    }
                    break;

                case 3:
                    for (Resenya r : dao.resenyas) {
                        out.println(r);
                    }
                    break;
                case 4:
                    out.print(dao.getVideojuegoRandom());
                    break;
                case 5:
                    out.print("Introduce el id del videojuego:");
                    id=sc.nextInt();
                    out.print(dao.getVideojuegoById(id));
                    break;
                case 6:
                    out.println("Saliendo del programa...");
                    break;

                default:
                    out.println("Opción no válida. Intente de nuevo.");
            }

        } while (menu != 6);
        sc.close();
        out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
