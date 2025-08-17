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
        int num1, num2;
        int divisor = 2;
        
        System.out.println("ingrese un numero: ");
        num1 = input.nextInt();
        
         System.out.println("ingrese otro numero: ");
        num2 = input.nextInt();
        
        System.out.println("resultado num1: " + (num1 / divisor) + "\nresultado num2: " + (num2 / divisor));
        
        System.out.println("resultado num1 casting: " + ((double) num1 / divisor) + "\nresultado num2 casting: " + ((double) num2 / divisor));
        
        
    }
    
}
