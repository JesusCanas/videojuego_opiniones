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

    // Instancias de las clases del modelo
   
    private ArrayList <VideojuegosDao> videojuegosDaos=new ArrayList  <VideojuegosDao> ();
    private ArrayList <Plataforma> plataformas = new ArrayList <Plataforma>();
    private ArrayList <Resenya> resenyas = new ArrayList <Resenya> ();
    private ArrayList<VideojuegosDao> videojuegos =  new ArrayList <VideojuegosDao>();
     private ArrayList <Plataforma> plataformas2 = new ArrayList <Plataforma>();
    private ArrayList <Resenya> resenyas2 = new ArrayList <Resenya> ();
    private ArrayList<Videojuego> videojuegos2 =  new ArrayList <Videojuego>();
   



    public VideojuegosDao(){
        // Crear instancias iniciales
      
        
        Videojuego videojuego1 = new Videojuego(444, "Pokemon", 60, Videojuego.Genero.AVENTURA, new Date(),this.plataformas,this.resenyas);
        Plataforma plataforma1 = new Plataforma(445, "Nintendo 3DS", Plataforma.Marca.NINTENDO,"Azul", 100,videojuego1);
        this.plataformas.add(plataforma1);
        Empresa empresa1 = new Empresa(12212, "Nintendo", 100,this.videojuegos);
        Resenya resenya1 = new Resenya(4.5, "Buenísimo", new Date()); 
        
        this. resenyas.add(resenya1);
        videojuegos.add(videojuego1);
       
        
        this.videojuegos.add(videojuego2);
        Videojuego videojuego2 = new Videojuego(434, "Super Mario 3D", 60, Videojuego.Genero.AVENTURA, new Date(),this.plataformas,this.resenyas);
       Resenya resenya2 = new Resenya(4.5, "Que gran Juego", new Date());
        this.videojuegosDaos.add(VideojuegosDao);

    }
    public VideojuegosDao getVideojuegosDao(){
    }    
}
