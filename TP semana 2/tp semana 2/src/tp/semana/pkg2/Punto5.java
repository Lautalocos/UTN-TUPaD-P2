/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.semana.pkg2;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num;
         int suma = 0;
         
         System.out.println(" -- sumador de numeros pares -- \n ingrese numeros pares para sumar. ingrese el numero 0 para ver la suma de ellos: ");
         num = input.nextInt();
         
         while (num != 0) {
             if (num % 2 == 0) {
                suma += num;
                 System.out.println(" numero par. ingrese otro numero: ");
                num = input.nextInt();
             } else {
                 System.out.println(" numero impar. ingrese otro numero: ");
                 num = input.nextInt();
             }
         } 
         System.out.println(" la suma de los numeros pares es: " + suma);
    }
    
}
