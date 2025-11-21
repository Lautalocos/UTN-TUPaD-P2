/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author lauta
 */
public class Main {
    public static void main(String[] args) {
        // 1. Crear biblioteca
        System.out.println("=== TAREA 1: Crear biblioteca ===");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca creada: " + biblioteca.getNombre());

        // 2. Crear autores
        System.out.println("\n=== TAREA 2: Crear autores ===");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();

        // 3. Agregar libros
        System.out.println("\n=== TAREA 3: Agregar libros ===");
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("ISBN004", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("ISBN005", "La casa de los espíritus", 1982, autor3);

        // 4. Listar libros
        System.out.println("\n=== TAREA 4: Listar libros ===");
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN
        System.out.println("\n=== TAREA 5: Buscar libro por ISBN ===");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) {
            System.out.println("Libro encontrado:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 6. Filtrar libros por año
        System.out.println("\n=== TAREA 6: Filtrar por año ===");
        biblioteca.filtrarLibrosPorAnio(1949);

        // 7. Eliminar libro
        System.out.println("\n=== TAREA 7: Eliminar libro ===");
        biblioteca.eliminarLibro("ISBN004");
        biblioteca.listarLibros();

        // 8. Cantidad total de libros
        System.out.println("\n=== TAREA 8: Cantidad de libros ===");
        System.out.println("Total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar autores
        System.out.println("\n=== TAREA 9: Listar autores ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}