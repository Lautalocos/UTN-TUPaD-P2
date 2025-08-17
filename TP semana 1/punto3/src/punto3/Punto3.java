/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto3;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("nombre: " + nombre + "\nedad: " + edad);
                
                
    }
    
}
