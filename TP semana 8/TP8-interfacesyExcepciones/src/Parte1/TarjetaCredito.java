/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author lauta
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;
    private double porcentajeDescuento;

    public TarjetaCredito(String numeroTarjeta, String titular, double porcentajeDescuento) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("\n--- PAGO CON TARJETA DE CRÉDITO ---");
        System.out.println("Titular: " + titular);
        System.out.println("Tarjeta: ****-****-****-" + numeroTarjeta.substring(numeroTarjeta.length() - 4));
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
