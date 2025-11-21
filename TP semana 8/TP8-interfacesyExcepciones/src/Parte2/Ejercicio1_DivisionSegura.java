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

public class Ejercicio1_DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== DIVISIÓN SEGURA ===\n");

        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;

            System.out.println("\nResultado: " + dividendo + " / " + divisor + " = " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("\n❌ ERROR: No se puede dividir por cero.");
            System.out.println("Detalles técnicos: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\n❌ ERROR: Entrada inválida. Debe ingresar números enteros.");
            System.out.println("Detalles técnicos: " + e.getMessage());
        } finally {
            System.out.println("\nOperación finalizada.");
            scanner.close();
        }
    }
}
