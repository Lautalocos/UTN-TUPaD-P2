/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrodemascotas;

/**
 *
 * @author lauta
 */
public class RegistroDeMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota test = new Mascota();
        
        test.setNombre("simon");
        test.setEspecie("perro");
        test.setEdad(13);
        
        test.mostrarInfo();
        test.cumplirAnios(3);
        test.mostrarInfo();
    }
    
}
