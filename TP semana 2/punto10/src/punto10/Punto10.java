/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto10;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Punto10 {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingrese el stock actual: ");
        int stockActual = input.nextInt();
        System.out.println("ingrese el stock vendido: ");
        int cantidadVendida = input.nextInt();
        System.out.println("ingrese el stock recibido: ");
        int cantidadRecibida = input.nextInt();
        
        int stock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("el nuevo stock es: " + stock);
        
    }
    
}
