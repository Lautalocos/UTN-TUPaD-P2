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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int edad;
         
         System.out.println("ingrese su edad: ");
         edad = input.nextInt();
         
         if (edad < 12) {
             System.out.println("ninio");
         } else if (edad >= 12 && edad < 18) {
             System.out.println("adolescente");
         } else if (edad >= 18 && edad < 60) {
             System.out.println("adulto");
         } else {
             System.out.println("adulto mayor");
         }
    }
    
}
