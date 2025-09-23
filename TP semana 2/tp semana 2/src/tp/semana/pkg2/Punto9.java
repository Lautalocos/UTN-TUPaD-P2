/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.semana.pkg2;

import java.util.Scanner;

public class Punto9 {
    
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        
        if (zona.equalsIgnoreCase("nacional")) {
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("internacional")) {
            costoEnvio = peso * 10;
        } else {
            System.out.println("zona invalida, ingrese 'nacional' o 'internacional' ");
        }
        
        return costoEnvio;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingrese el tipo de envio (nacional/internacional): ");
        String zona = input.nextLine();
        
        System.out.println("ingrese el peso del paquete (kg): ");
        double peso = input.nextDouble();
        
        System.out.println("ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("precio del producto: $" + precioProducto);
        System.out.println("costo del envio: $" + costoEnvio);
        System.out.println("total a pagar: $" + total);
    }
    
}
