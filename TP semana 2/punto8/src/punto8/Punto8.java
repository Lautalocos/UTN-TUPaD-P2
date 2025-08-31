/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto8;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Punto8 {
    public static double calcularPrecioFinal(double impuesto, double descuento) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();
        
        impuesto = impuesto / 100;
        descuento = descuento / 100;
        
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;  
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("ingrese el porcentaje del impuesto: ");
        double impuesto = input.nextDouble();
        
        System.out.println("ingrese el porcentaje del descuento: ");
        double descuento = input.nextDouble();
        
        double precioFinal = calcularPrecioFinal(impuesto, descuento);
        System.out.println("el precio final del producto es $" + precioFinal);
    }
    
}
