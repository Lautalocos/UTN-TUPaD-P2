/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author lauta
 */
import java.util.Scanner;

public class Ejercicio2_ConversionCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERSIÓN DE CADENA A NÚMERO ===\n");

        System.out.print("Ingrese un número: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("\n✅ Conversión exitosa!");
            System.out.println("El número ingresado es: " + numero);
            System.out.println("El doble de ese número es: " + (numero * 2));

        } catch (NumberFormatException e) {
            System.out.println("\n❌ ERROR: El texto ingresado no es un número válido.");
            System.out.println("Texto ingresado: \"" + texto + "\"");
            System.out.println("Detalles técnicos: " + e.getMessage());
        } finally {
            System.out.println("\nProceso de conversión finalizado.");
            scanner.close();
        }
    }
}
