/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.semana.pkg2;

/**
 *
 * @author lauta
 */
public class Punto13 {
    public static void imprimirPrecios(double[] precios, int i) {
        if (i >= precios.length) {
            return; 
        }
        System.out.println("precio: $" + precios[i]);
        imprimirPrecios(precios, i + 1); 
    }
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);
        
        precios[2] = 129.99; 
        
        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios, 0);
        
    }
    
}
