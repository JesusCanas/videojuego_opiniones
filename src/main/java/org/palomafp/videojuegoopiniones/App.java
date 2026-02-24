package org.palomafp.videojuegoopiniones;

import java.util.Scanner;

import org.palomafp.videojuegoopiniones.modelo.Videojuego;
import org.palomafp.videojuegoopiniones.modelo.Plataforma;
import org.palomafp.videojuegoopiniones.modelo.Resenya;
import org.palomafp.videojuegoopiniones.modelo.Empresa;
import org.palomafp.videojuegoopiniones.VideojuegosDao;

/**
 * Aplicación principal para demostrar el modelo de datos de videojuegos
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu = 0;

        System.out.println("=== SISTEMA DE OPINIONES DE VIDEOJUEGOS ===");

        // Crear instancia de DatosDao que gestiona todas las entidades
        VideojuegosDao lista1 = new VideojuegosDao();

        do {
            System.out.println("\n------------ MENU ------------");
            System.out.println("1. Mostrar videojuegos");
            System.out.println("2. Mostrar plataformas");
            System.out.println("3. Mostrar reseñas");
            System.out.println("4. Salir");
            System.out.println("------------------------------");
            System.out.print("Seleccione una opción: ");

            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    for (Videojuego v : lista1.videojuegos) {
                        System.out.println(v);
                    }
                    break;

                case 2:
                    for (Plataforma p : lista1.plataformas) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    for (Resenya r : lista1.resenyas) {
                        System.out.println(r);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (menu != 5);

        sc.close();
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
