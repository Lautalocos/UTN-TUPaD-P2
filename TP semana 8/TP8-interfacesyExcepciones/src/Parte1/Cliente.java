/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author lauta
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("\n📧 NOTIFICACIÓN para " + nombre + " (" + email + "):");
        System.out.println("   " + mensaje);
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " | Email: " + email);
    }
}