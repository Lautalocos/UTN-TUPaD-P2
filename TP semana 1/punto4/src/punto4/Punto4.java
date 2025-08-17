/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto4;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num1;
        int num2;
        System.out.println("ingrese el valor del primer numero: ");
        num1 = input.nextInt();
        
        System.out.println("ingrese el valor del segundo numero: ");
        num2 = input.nextInt();
        
       
        System.out.println("suma: " + (num1 + num2));
        System.out.println("\nresta: " + (num1 - num2));
        System.out.println("\nmultiplicacion: " + (num1 * num2));
        System.out.println("\ndivision: " + (num1 / num2));
        
        
    }
    
}
