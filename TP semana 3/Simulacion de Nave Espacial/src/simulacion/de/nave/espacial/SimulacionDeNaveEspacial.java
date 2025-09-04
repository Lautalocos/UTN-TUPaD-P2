/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacion.de.nave.espacial;

/**
 *
 * @author lauta
 */
public class SimulacionDeNaveEspacial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("apollo", 50);
        
        nave1.mostrarEstado();
        nave1.despegar();
        nave1.avanzar(70);
        nave1.recargarCombustible(25);
        nave1.avanzar(70);
        nave1.mostrarEstado();
        
    }
    
}
