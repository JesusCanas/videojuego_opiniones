# Aplicación de Opiniones de Videojuegos y Plataformas

En esta aplicación se trata sobre la visualización de nuevos juegos o plataformas que se han anunciado su lanzamiento. También se podrán visualizar las diferentes reseñas de plataformas o videojuegos anteriormente lanzadas. Otra cosa que se podrá ver en la aplicación es la compañía que los realiza, cada videoconsola y las reseñas que tiene.

## Modelo de dominio

- **Videojuego**: código, nombre, precio, fecha de lanzamiento, género. Referencia a `Resenya`.
- **Plataforma**: código, modelo de la videoconsola, marca, color, capacidad de almacenamiento. Una plataforma puede tener uno o varios videojuegos y un videojuego puede jugarse en una o varias plataformas.
- **Empresa**: nombre de la compañía, años de actividad, número de juegos creados. Una compañía está relacionada con videojuegos y puede hacer varios videojuegos.
- **Resenya**: puntuación, comentarios, fecha de publicación. La reseña se relaciona con videojuegos; hay solo una reseña por videojuego.

## Diagrama de clases (Mermaid)

```mermaid
classDiagram
    class Videojuego {
        +int codigo
        +String nombre
        +double precio
        +Date fechaLanzamiento
        +String genero
        +Resenya resenya
    }

    class Plataforma {
        +int codigo
        +String modelo
        +String marca
        +String color
        +int capacidadAlmacenamiento
    }

    class Empresa {
        +String nombre
        +int anyosActividad
        +int numJuegosCreados
    }

    class Resenya {
        +double puntuacion
        +String comentarios
        +Date fecha
    }

    Videojuego "1" -- "1" Resenya : tiene
    Plataforma "1" o "*" -- "*" Videojuego : permite
    Empresa "1" -- "*" Videojuego : crea
```

> Nota: En lugar de una imagen estática, aquí está el diagrama Mermaid que puede renderizarse con cualquier visor compatible (GitHub, VSCode, Mermaid Live Editor). Si se requiere una captura de pantalla, se recomienda generar el gráfico a partir de este código y guardarlo como imagen.

## Ejecutar pruebas

```bash
mvn test
```

## Estructura del proyecto

- `src/main/java/org/palomafp/videojuegoopiniones/modelo` - Clases de dominio (`Videojuego`, `Plataforma`, `Empresa`, `Resenya`)
- `src/main/java/org/palomafp/videojuegoopiniones` - Lógica de acceso a datos y aplicación (`App`, `VideojuegosDao`)
- `src/test/java/org/palomafp/videojuego_opiniones` - Pruebas unitarias
