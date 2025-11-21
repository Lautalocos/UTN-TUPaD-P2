/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author lauta
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private int numeroPedido;
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
        this.cliente = null;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado del pedido #" + numeroPedido + " cambiado a: " + estado);
        
        // Notificar al cliente si está asociado
        if (cliente != null) {
            cliente.notificar("Su pedido #" + numeroPedido + " cambió a estado: " + estado);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void mostrarDetalle() {
        System.out.println("\n=== PEDIDO #" + numeroPedido + " ===");
        System.out.println("Estado: " + estado);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println("  - " + p);
        }
        System.out.println("Total: $" + calcularTotal());
    }
}
