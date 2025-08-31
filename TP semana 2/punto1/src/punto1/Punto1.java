/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto1;

import java.util.Scanner;
/**
 *
 * @author lauta
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int año;
         
         System.out.println("Ingrese un anio: ");
         año = input.nextInt();
         
         boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
         
         if (esBisiesto) {
             System.out.println("el anio " + año + " es bisiesto");
         } else {
             System.out.println("el anio " + año + " no es bisiesto");
    }
    
}
}
