package org.palomafp.videojuegoopiniones;

import java.util.Date;

import org.palomafp.videojuegoopiniones.modelo.Empresa;
import org.palomafp.videojuegoopiniones.modelo.Plataforma;
import org.palomafp.videojuegoopiniones.modelo.Resenya;
import org.palomafp.videojuegoopiniones.modelo.Videojuego;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Videojuego videojuego = new Videojuego(444, "Pokemon", 60, Videojuego.Genero.AVENTURA, new Date(1997,06,22));
        Plataforma plataforma = new Plataforma(445, "Nintendo 3ds", Plataforma.Marca.NINTENDO, "Azul", 100);
        Empresa empresa = new Empresa(12212, "Nintendo", 100);
        Resenya resenya = new Resenya(4.5, "Buenisimo", new Date(2025,06,22));
        System.out.println(videojuego);
        System.out.println(plataforma);
        System.out.println(empresa);
        System.out.println(resenya);
    }
}
