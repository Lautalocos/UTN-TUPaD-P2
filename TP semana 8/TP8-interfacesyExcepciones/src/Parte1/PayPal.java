/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author lauta
 */
public class PayPal implements PagoConDescuento {
    private String email;
    private double porcentajeDescuento;

    public PayPal(String email, double porcentajeDescuento) {
        this.email = email;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("\n--- PAGO CON PAYPAL ---");
        System.out.println("Cuenta: " + email);
        System.out.println("Monto original: $" + monto);
        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.println("Monto final: $" + montoFinal);
        System.out.println("Pago procesado exitosamente.");
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * porcentajeDescuento / 100);
    }
}
