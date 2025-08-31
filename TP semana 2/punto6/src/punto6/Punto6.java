/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto6;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int positivos = 0;
         int negativos = 0;
         int ceros = 0;
         int num;
         
         System.out.println("ingrese 10 numeros enteros: ");
         
         for (int i = 1; i <= 10; i++) {
             System.out.println("numero " + i + ": ");
             num = input.nextInt();
             
             if (num > 0) {
                 positivos++;
             } else if (num < 0) {
                 negativos++;
             } else {
                 ceros++;
             }
         }
         System.out.println("positivos: " + positivos + "\nnegativos: " + negativos + "\nceros: " + ceros);
         
    }
    
}
