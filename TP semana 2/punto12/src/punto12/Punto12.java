/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto12;



/**
 *
 * @author lauta
 */
public class Punto12 {
    
    public static void arrayPrecio(double[] precios) {
        
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Precio: $" + precios[i] + "\n");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
        
        System.out.println("precios originales: ");
        arrayPrecio(precios);
        
        precios[3] = 1001.4;
        System.out.println("\nprecios modificados: ");
        arrayPrecio(precios);
        }
    }
    

