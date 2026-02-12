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
    private Videojuego videojuego;
    private Plataforma plataforma;
    private Empresa empresa;
    private Resenya resenya;
    private ArrayList <Plataforma> plataformas = new ArrayList ();
    private ArrayList <Resenya> resenyas = new ArrayList ();
    private ArrayList<Videojuego> videojuegos =  new ArrayList ();
    private ArrayList <VideojuegosDao> videojuegosDaos=new ArrayList ();

    public VideojuegosDao(){
        // Crear instancias iniciales
        this.plataformas.add(this.plataforma);
        this. resenyas.add(this.resenya);
        this.videojuegos.add(this.videojuego);
        
        this.videojuego = new Videojuego(444, "Pokemon", 60, Videojuego.Genero.AVENTURA, new Date(),this.plataformas,this.resenyas);
        this.plataforma = new Plataforma(445, "Nintendo 3DS", Plataforma.Marca.NINTENDO,"Azul", 100,videojuego);
        this.empresa = new Empresa(12212, "Nintendo", 100,this.videojuegos);
        this.resenya = new Resenya(4.5, "Buenísimo", new Date()); 
    }
        

    

}
