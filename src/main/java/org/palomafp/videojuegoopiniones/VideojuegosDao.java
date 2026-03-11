package org.palomafp.videojuegoopiniones;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.palomafp.videojuegoopiniones.modelo.Empresa;
import org.palomafp.videojuegoopiniones.modelo.Plataforma;
import org.palomafp.videojuegoopiniones.modelo.Resenya;
import org.palomafp.videojuegoopiniones.modelo.Videojuego;

/**
 * Clase DatosDao que gestiona la creación y manipulación de todas las entidades del modelo
 */
public class VideojuegosDAO {


    // private ArrayList<VideojuegosDao> videojuegosDaos= new ArrayList<>();
   List<Videojuego> videojuegos=  new ArrayList <Videojuego>();


    /**
     * 
     */
    public VideojuegosDAO(){
        // Crear instancias iniciales

        Plataforma plataforma1 = new Plataforma(445, "Nintendo 3DS", Plataforma.Marca.NINTENDO,"Azul", 1000);
        ArrayList<Plataforma> plataformas = new ArrayList <Plataforma>();
        plataformas.add(plataforma1);
        
        Resenya resenya1 = new Resenya(4.5, "Buenísimo", new Date());
        ArrayList<Resenya> resenyas = new ArrayList <Resenya> ();
        resenyas.add(resenya1);
        
        
        Empresa empresa1 = new Empresa(12212, "Nintendo", 100);
        Videojuego videojuego1 = new Videojuego(444, "Pokemon", 60, Videojuego.Genero.AVENTURA, new Date(), plataformas, resenyas, empresa1);
        empresa1.addVideojuego(videojuego1);
        
        Resenya resenya2 = new Resenya(4.5, "Que gran Juego", new Date());
        resenyas.add(resenya2);
        Videojuego videojuego2 = new Videojuego(434, "Super Mario 3D", 60, Videojuego.Genero.AVENTURA, new Date(),plataformas,resenyas, empresa1);
        videojuegos.add(videojuego2);

        
        Plataforma plataforma3 = new Plataforma(555, "Play 5", Plataforma.Marca.SONY,"Blanco", 2000);
        plataformas.add(plataforma3);
        Empresa empresa2 = new Empresa(12212, "Sony", 37);
         Resenya resenya3 = new Resenya(4.5, "Buenísimo", new Date());
        resenyas.add(resenya3);
        Videojuego videojuego3 = new Videojuego(222, "GodOfWar", 60, Videojuego.Genero.ACCION, new Date(),plataformas,resenyas, empresa2);
        videojuegos.add(videojuego3);
    }   
    public Videojuego getVideojuegoRandom(){
        return this.videojuegos.get( (int)(Math.random() * this.videojuegos.size()) );
    }

    public Videojuego getVideojuegoById(int id){
        for (Videojuego v : this.videojuegos) {
        if (v.getCodigo() == id) {
            return v;
        }
        }
    return null; // si no existe
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }



}
