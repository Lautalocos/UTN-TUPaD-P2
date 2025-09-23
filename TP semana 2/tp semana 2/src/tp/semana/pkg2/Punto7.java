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
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int nota;
         
         
         do {
             System.out.println("ingrese una nota entre 0 y 10: ");
             nota = input.nextInt();
         } while (nota < 0 || nota > 10);
         System.out.println("nota valida");
    }
}
