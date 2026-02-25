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

        Scanner sc = new Scanner(System.in);
        int menu;
        int id;
        System.out.println("=== SISTEMA DE OPINIONES DE VIDEOJUEGOS ===");

        // Crear instancia de DatosDao que gestiona todas las entidades
        VideojuegosDao dao = new VideojuegosDao();
        
        do {
            System.out.println("\n------------ MENU ------------");
            System.out.println("1. Mostrar videojuegos");
            System.out.println("2. Mostrar plataformas");
            System.out.println("3. Mostrar reseñas");
            System.out.println("4. Mostrar videojuego random");
            System.out.println("5.  Mostrar videojuego por id");
            System.out.println("6. Salir");
            System.out.println("------------------------------");
            System.out.print("Seleccione una opción: ");
            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    for (Videojuego v : dao.videojuegos) {
                        System.out.println(v);
                    }
                    break;

                case 2:
                    for (Plataforma p : dao.plataformas) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    for (Resenya r : dao.resenyas) {
                        System.out.println(r);
                    }
                    break;
                case 4:
                    System.out.print(dao.getVideojuegoRandom());
                    break;
                case 5:
                    System.out.print("Introduce el id del videojuego:");
                    id=sc.nextInt();
                    System.out.print(dao.getVideojuegoById(id));
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (menu != 6);
        sc.close();
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
