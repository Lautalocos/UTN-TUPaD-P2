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

public class Ejercicio4_ExcepcionPersonalizada {
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa. Valor ingresado: " + edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 años. Valor ingresado: " + edad);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== VALIDACIÓN DE EDAD ===\n");

        System.out.print("Ingrese su edad: ");

        try {
            int edad = scanner.nextInt();
            
            validarEdad(edad);
            
            System.out.println("\n✅ Edad válida: " + edad + " años");
            
            if (edad >= 18) {
                System.out.println("Usted es mayor de edad.");
            } else {
                System.out.println("Usted es menor de edad.");
            }

        } catch (EdadInvalidaException e) {
            System.out.println("\n❌ ERROR DE VALIDACIÓN: " + e.getMessage());
            System.out.println("Por favor, ingrese una edad válida (entre 0 y 120).");

        } catch (Exception e) {
            System.out.println("\n❌ ERROR: Debe ingresar un número entero.");
            System.out.println("Detalles técnicos: " + e.getMessage());

        } finally {
            System.out.println("\nProceso de validación finalizado.");
            scanner.close();
        }
    }
}
