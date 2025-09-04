/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulamientoconlaclaselibro;

/**
 *
 * @author lauta
 */
public class EncapsulamientoConLaClaseLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro metamorfosis = new Libro();
        
        metamorfosis.setTitulo("la metamorfosis");
        metamorfosis.setAutor("kafka");
        metamorfosis.setAnioPublicacion(1900);
        
        metamorfosis.mostrarInfo();
        metamorfosis.setAnioPublicacion(-10);
        metamorfosis.mostrarInfo();
        metamorfosis.setAnioPublicacion(1950);
        metamorfosis.mostrarInfo();
    }
    
}
