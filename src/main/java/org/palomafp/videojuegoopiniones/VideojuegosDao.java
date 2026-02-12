package org.palomafp.videojuegoopiniones;


import java.util.ArrayList;
import java.util.Date;

import org.palomafp.videojuegoopiniones.modelo.Empresa;
import org.palomafp.videojuegoopiniones.modelo.Plataforma;
import org.palomafp.videojuegoopiniones.modelo.Resenya;
import org.palomafp.videojuegoopiniones.modelo.Videojuego;

/**
 * Clase DatosDao que gestiona la creación y manipulación de todas las entidades del modelo
 */
public class VideojuegosDao {


    private ArrayList <VideojuegosDao> videojuegosDaos=null;
    private ArrayList <Plataforma> plataformas = new ArrayList <Plataforma>();
    private ArrayList <Resenya> resenyas = new ArrayList <Resenya> ();
    private ArrayList<Videojuego> videojuegos=  new ArrayList <Videojuego>();


    /**
     * 
     */
    public VideojuegosDao(){
        // Crear instancias iniciales
       
        
       Videojuego videojuego1 = new Videojuego(444, "Pokemon", 60, Videojuego.Genero.AVENTURA, new Date(),this.plataformas,this.resenyas);
       Plataforma plataforma1 = new Plataforma(445, "Nintendo 3DS", Plataforma.Marca.NINTENDO,"Azul", 1000,videojuego1);
       Empresa empresa1 = new Empresa(12212, "Nintendo", 100,this.videojuegos);
       Resenya resenya1 = new Resenya(4.5, "Buenísimo", new Date()); 
       this.plataformas.add(plataforma1);
       this. resenyas.add(resenya1);
       this.videojuegos.add(videojuego1);
       
      Videojuego videojuego2 = new Videojuego(434, "Super Mario 3D", 60, Videojuego.Genero.AVENTURA, new Date(),this.plataformas,this.resenyas);
      Resenya resenya2 = new Resenya(4.5, "Que gran Juego", new Date());

       Videojuego videojuego3 = new Videojuego(222, "GodOfWar", 60, Videojuego.Genero.ACCION, new Date(),this.plataformas,this.resenyas);
       Plataforma plataforma3 = new Plataforma(555, "Play 5", Plataforma.Marca.SONY,"Blanco", 2000,videojuego3);
       Empresa empresa3 = new Empresa(12212, "Sony", 37,this.videojuegos);
       Resenya resenya3 = new Resenya(4.5, "Buenísimo", new Date());
       this.videojuegos.add(videojuego3);
       this.plataformas.add(plataforma3);
        this.resenyas.add(resenya3);
    }   
    public Videojuego getVideojuegoRandom(){
        return this.videojuegos.get(0);
    }
    public Resenya getResenyaRandom(){
        return this.resenyas.get(0);
    }

}
