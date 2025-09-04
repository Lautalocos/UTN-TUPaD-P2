/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondegallinas;

/**
 *
 * @author lauta
 */
public class Gallinas {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallinas(String id, int tiempo) {
        idGallina = id;
        edad = tiempo;
        huevosPuestos = 0;
    }
    
    public void mostrarEstado() {
        System.out.println("gallina: " + idGallina + "\nedad: " + edad + "\nhuevos puestos: " + huevosPuestos + "\n");
    }
    
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("la gallina " + idGallina + " puso un huevo. total: " + huevosPuestos);
    }
    
    public void envejecer() {
        edad++;
        System.out.println("la gallina " + idGallina + " envejecio. tiene " + edad + " anios");
        }
    
}
