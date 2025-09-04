/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondegallinas;

/**
 *
 * @author lauta
 */
public class GestionDeGallinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallinas gallinaA = new Gallinas("turuleca", 2);
        Gallinas gallinaB = new Gallinas("tata", 4);
        
        gallinaA.mostrarEstado();
        gallinaB.mostrarEstado();
        
        gallinaA.envejecer();
        gallinaA.envejecer();
        gallinaA.ponerHuevo();
        
        gallinaB.envejecer();
        gallinaB.ponerHuevo();
        gallinaB.ponerHuevo();
        
        gallinaA.mostrarEstado();
        gallinaB.mostrarEstado();
    }
    
}
