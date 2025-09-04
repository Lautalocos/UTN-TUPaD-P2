/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodemascotas;

/**
 *
 * @author lauta
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("informacion de mascota: \nnombre: " + nombre + "\nespecie: " + especie + "\nedad: " + edad +"\n");
    }
    
    public void cumplirAnios(int anios) {
        if (anios >= 0) {
            edad += anios;
        }
    }
    
}
