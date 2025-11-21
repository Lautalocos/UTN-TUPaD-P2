/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parte1;

/**
 *
 * @author lauta
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE E-COMMERCE ===\n");

        // 1. Crear productos
        System.out.println("--- Crear productos ---");
        Producto p1 = new Producto("Laptop", 50000);
        Producto p2 = new Producto("Mouse", 1500);
        Producto p3 = new Producto("Teclado", 3000);
        Producto p4 = new Producto("Monitor", 25000);

        System.out.println("Productos creados:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        // 2. Crear cliente
        System.out.println("\n--- Crear cliente ---");
        Cliente cliente1 = new Cliente("Juan Pérez", "juan.perez@email.com");
        cliente1.mostrarInfo();

        // 3. Crear pedido y asociar cliente
        System.out.println("\n--- Crear pedido ---");
        Pedido pedido1 = new Pedido(1001);
        pedido1.setCliente(cliente1);
        
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);
        pedido1.agregarProducto(p3);

        // 4. Mostrar detalle del pedido
        pedido1.mostrarDetalle();

        // 5. Cambiar estado del pedido (esto notifica al cliente)
        System.out.println("\n--- Cambios de estado ---");
        pedido1.cambiarEstado("En Proceso");
        pedido1.cambiarEstado("Enviado");
        pedido1.cambiarEstado("Entregado");

        // 6. Procesar pago con Tarjeta de Crédito
        System.out.println("\n--- Procesar pago ---");
        TarjetaCredito tarjeta = new TarjetaCredito("1234567890123456", "Juan Pérez", 10);
        tarjeta.procesarPago(pedido1.calcularTotal());

        // 7. Crear otro pedido y pagar con PayPal
        System.out.println("\n\n--- Segundo pedido ---");
        Cliente cliente2 = new Cliente("María González", "maria.gonzalez@email.com");
        Pedido pedido2 = new Pedido(1002);
        pedido2.setCliente(cliente2);
        
        pedido2.agregarProducto(p4);
        pedido2.agregarProducto(p2);
        
        pedido2.mostrarDetalle();
        
        pedido2.cambiarEstado("Confirmado");

        PayPal paypal = new PayPal("maria.gonzalez@email.com", 5);
        paypal.procesarPago(pedido2.calcularTotal());

        // 8. Demostrar polimorfismo
        System.out.println("\n\n--- Demostración de Polimorfismo ---");
        Pagable[] elementosPagables = {p1, p2, pedido1, pedido2};
        
        System.out.println("Cálculo de totales usando la interfaz Pagable:");
        for (Pagable elemento : elementosPagables) {
            System.out.println(elemento.getClass().getSimpleName() + ": $" + elemento.calcularTotal());
        }

        // 9. Demostrar diferentes medios de pago
        System.out.println("\n--- Diferentes medios de pago ---");
        PagoConDescuento[] mediosPago = {
            new TarjetaCredito("9876543210987654", "Carlos López", 15),
            new PayPal("carlos.lopez@email.com", 8)
        };

        double montoEjemplo = 10000;
        for (PagoConDescuento medio : mediosPago) {
            medio.procesarPago(montoEjemplo);
        }
    }
}