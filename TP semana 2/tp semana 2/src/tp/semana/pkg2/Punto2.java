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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num1;
         int num2;
         int num3;
         int numMayor;
         
         System.out.println("ingrese el numero 1: ");
         num1 = input.nextInt();
         System.out.println("ingrese el numero 2: ");
         num2 = input.nextInt();
         System.out.println("ingrese el numero 3: ");
         num3 = input.nextInt();
         
         if (num1 >= num2 && num1 >= num3) {
             numMayor = num1;
         } else if (num2 >= num1 && num2 >= num3) {
             numMayor = num2;
         } else {
             numMayor = num3;
         }
         System.out.println("el numero mayor es el numero " + numMayor);
    }
    
}
