/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto11;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Punto11 {
    
    static double descuentoGlobal = 0.10;
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoGlobal;
        
        System.out.println("el descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("el precio final con descuento es: " + (precio - descuentoAplicado));
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese el precio del producto: $");
        double precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }
    
}
