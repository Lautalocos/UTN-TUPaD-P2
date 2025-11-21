/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author lauta
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        System.out.println("\n=== LIBROS DE LA BIBLIOTECA " + nombre + " ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado: " + libro.getTitulo());
        } else {
            System.out.println("Libro con ISBN " + isbn + " no encontrado.");
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros publicados en ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\n=== AUTORES EN LA BIBLIOTECA ===");
        List<String> autoresMostrados = new ArrayList<>();
        for (Libro libro : libros) {
            String autorNombre = libro.getAutor().getNombre();
            if (!autoresMostrados.contains(autorNombre)) {
                libro.getAutor().mostrarInfo();
                autoresMostrados.add(autorNombre);
            }
        }
    }
}
