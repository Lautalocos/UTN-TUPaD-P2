/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemaDeStock;

/**
 *
 * @author lauta
 */
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos
        System.out.println("=== TAREA 1: Crear y agregar productos ===");
        Producto p1 = new Producto("P001", "Arroz", 1500, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Notebook", 80000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 2500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Lámpara", 3500, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Fideos", 800, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos
        System.out.println("\n=== TAREA 2: Listar productos ===");
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\n=== TAREA 3: Buscar producto por ID ===");
        Producto encontrado = inventario.buscarProductoPorId("P002");
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            encontrado.mostrarInfo();
        }

        // 4. Filtrar por categoría
        System.out.println("\n=== TAREA 4: Filtrar por categoría ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5. Eliminar un producto
        System.out.println("\n=== TAREA 5: Eliminar producto ===");
        inventario.eliminarProducto("P003");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n=== TAREA 6: Actualizar stock ===");
        inventario.actualizarStock("P001", 75);

        // 7. Mostrar total de stock
        System.out.println("\n=== TAREA 7: Total de stock ===");
        System.out.println("Total de productos en stock: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n=== TAREA 8: Producto con mayor stock ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            System.out.println("Producto con mayor stock:");
            mayor.mostrarInfo();
        }

        // 9. Filtrar por rango de precios
        System.out.println("\n=== TAREA 9: Filtrar por precio ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles
        System.out.println("\n=== TAREA 10: Categorías disponibles ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
    

