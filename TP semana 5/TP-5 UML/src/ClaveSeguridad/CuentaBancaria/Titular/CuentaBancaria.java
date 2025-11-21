/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaveSeguridad.CuentaBancaria.Titular;

/**
 *
 * @author lauta
 */
public class CuentaBancaria {
    String cbu;
    double saldo;
    ClaveSeguridad clave;
    Titular titular;

    public CuentaBancaria(String cbu, double saldo, Titular titular, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        this.clave = clave;
        titular.setCuenta(this);
    }
}
