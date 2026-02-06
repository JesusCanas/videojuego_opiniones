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
public class DatosDao {

    // Instancias de las clases del modelo
    private Videojuego videojuego;
    private Plataforma plataforma;
    private Empresa empresa;
    private Resenya resenya;

    /**
     * Constructor que inicializa todas las instancias
     */
    public DatosDao() {
        inicializarDatos();
    }

    /**
     * Inicializa todas las instancias con datos de prueba
     */
    private void inicializarDatos() {
        // Crear instancias iniciales
        this.videojuego = new Videojuego(444, "Pokemon", 60, Videojuego.Genero.AVENTURA, 
                                         new Date(1997 - 1900, 6, 22));
        this.plataforma = new Plataforma(445, "Nintendo 3DS", Plataforma.Marca.NINTENDO, 
                                         "Azul", 100);
        this.empresa = new Empresa(12212, "Nintendo", 100);
        this.resenya = new Resenya(4.5, "Buenísimo", new Date(2025 - 1900, 6, 22));
    }

    /**
     * Demuestra todos los métodos de la clase Videojuego
     */
    public void demostrarVideojuego() {
        System.out.println("\n========== DEMOSTRACION VIDEOJUEGO ==========");
        System.out.println("--- GETTERS ---");
        System.out.println("Código: " + videojuego.getCodigo());
        System.out.println("Nombre: " + videojuego.getNombre());
        System.out.println("Precio: " + videojuego.getPrecio());
        System.out.println("Género: " + videojuego.getGenero());
        System.out.println("Fecha Lanzamiento: " + videojuego.getFechaLanzamiento());
        System.out.println("Reseñas: " + videojuego.getResenyas());
        System.out.println("Plataformas: " + videojuego.getPlataformas());

        System.out.println("\n--- SETTERS ---");
        videojuego.setCodigo(555);
        System.out.println("Nuevo Código: " + videojuego.getCodigo());

        videojuego.setNombre("Pokemon Rojo");
        System.out.println("Nuevo Nombre: " + videojuego.getNombre());

        videojuego.setPrecio(75.5);
        System.out.println("Nuevo Precio: " + videojuego.getPrecio());

        videojuego.setGenero(Videojuego.Genero.RPG);
        System.out.println("Nuevo Género: " + videojuego.getGenero());

        videojuego.setFechaLanzamiento(new Date(1998 - 1900, 6, 22));
        System.out.println("Nueva Fecha Lanzamiento: " + videojuego.getFechaLanzamiento());

        ArrayList<Resenya> resenyas = new ArrayList<>();
        resenyas.add(resenya);
        videojuego.setResenyas(resenyas);
        System.out.println("Nuevas Reseñas: " + videojuego.getResenyas());

        ArrayList<Plataforma> plataformas = new ArrayList<>();
        plataformas.add(plataforma);
        videojuego.setPlataformas(plataformas);
        System.out.println("Nuevas Plataformas: " + videojuego.getPlataformas());

        System.out.println("\n--- INFORMACIÓN COMPLETA ---");
        System.out.println(videojuego.toString());
    }

    /**
     * Demuestra todos los métodos de la clase Plataforma
     */
    public void demostrarPlataforma() {
        System.out.println("\n========== DEMOSTRACION PLATAFORMA ==========");
        System.out.println("--- GETTERS ---");
        System.out.println("Código: " + plataforma.getCodigo());
        System.out.println("Modelo: " + plataforma.getModelo());
        System.out.println("Marca: " + plataforma.getMarca());
        System.out.println("Color: " + plataforma.getColor());
        System.out.println("Capacidad: " + plataforma.getCapacidad());
        System.out.println("Videojuego: " + plataforma.getVideojuego());

        System.out.println("\n--- SETTERS ---");
        plataforma.setCodigo(556);
        System.out.println("Nuevo Código: " + plataforma.getCodigo());

        plataforma.setModelo("Nintendo Switch");
        System.out.println("Nuevo Modelo: " + plataforma.getModelo());

        plataforma.setMarca(Plataforma.Marca.SONY);
        System.out.println("Nueva Marca: " + plataforma.getMarca());

        plataforma.setColor("Negro");
        System.out.println("Nuevo Color: " + plataforma.getColor());

        plataforma.setCapacidad(500);
        System.out.println("Nueva Capacidad: " + plataforma.getCapacidad());

        plataforma.setVideojuego(videojuego);
        System.out.println("Nuevo Videojuego: " + plataforma.getVideojuego());

        System.out.println("\n--- INFORMACIÓN COMPLETA ---");
        System.out.println(plataforma.toString());
    }

    /**
     * Demuestra todos los métodos de la clase Empresa
     */
    public void demostrarEmpresa() {
        System.out.println("\n========== DEMOSTRACION EMPRESA ==========");
        System.out.println("--- GETTERS ---");
        System.out.println("Código: " + empresa.getCodigo());
        System.out.println("Nombre: " + empresa.getNombre());
        System.out.println("Años de Actividad: " + empresa.getAnyosActividad());
        System.out.println("Videojuegos: " + empresa.getVideojuegos());

        System.out.println("\n--- SETTERS ---");
        empresa.setCodigo(12213);
        System.out.println("Nuevo Código: " + empresa.getCodigo());

        empresa.setNombre("Nintendo Company, Ltd.");
        System.out.println("Nuevo Nombre: " + empresa.getNombre());

        empresa.setAnyosActividad(150);
        System.out.println("Nuevos Años de Actividad: " + empresa.getAnyosActividad());

        ArrayList<Videojuego> videojuegos = new ArrayList<>();
        videojuegos.add(videojuego);
        empresa.setVideojuegos(videojuegos);
        System.out.println("Nuevos Videojuegos: " + empresa.getVideojuegos());

        System.out.println("\n--- INFORMACIÓN COMPLETA ---");
        System.out.println(empresa.toString());
    }

    /**
     * Demuestra todos los métodos de la clase Resenya
     */
    public void demostrarResenya() {
        System.out.println("\n========== DEMOSTRACION RESENYA ==========");
        System.out.println("--- GETTERS ---");
        System.out.println("Puntuación: " + resenya.getPuntuacion());
        System.out.println("Comentarios: " + resenya.getComentarios());
        System.out.println("Fecha: " + resenya.getFecha());

        System.out.println("\n--- SETTERS ---");
        resenya.setPuntuacion(5.0);
        System.out.println("Nueva Puntuación: " + resenya.getPuntuacion());

        resenya.setComentarios("Excelente juego, muy recomendado");
        System.out.println("Nuevos Comentarios: " + resenya.getComentarios());

        resenya.setFecha(new Date(2026 - 1900, 1, 6));
        System.out.println("Nueva Fecha: " + resenya.getFecha());

        System.out.println("\n--- INFORMACIÓN COMPLETA ---");
        System.out.println(resenya.toString());
    }

    /**
     * Ejecuta la demostración de todas las clases
     */
    public void demostrarTodo() {
        demostrarVideojuego();
        demostrarPlataforma();
        demostrarEmpresa();
        demostrarResenya();
    }

    // Getters para acceder a las instancias
    public Videojuego getVideojuego() {
        return videojuego;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Resenya getResenya() {
        return resenya;
    }
}
