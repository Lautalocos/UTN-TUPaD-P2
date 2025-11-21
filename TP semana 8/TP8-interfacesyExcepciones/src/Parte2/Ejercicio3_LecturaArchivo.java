/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author lauta
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3_LecturaArchivo {
    public static void main(String[] args) {
        System.out.println("=== LECTURA DE ARCHIVO ===\n");

        String nombreArchivo = "datos.txt";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            int numeroLinea = 1;

            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            System.out.println("-----------------------------------");

            while ((linea = reader.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                numeroLinea++;
            }

            System.out.println("-----------------------------------");
            System.out.println("\n✅ Archivo leído correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("❌ ERROR: El archivo '" + nombreArchivo + "' no existe.");
            System.out.println("Por favor, cree el archivo en la misma carpeta que el programa.");
            System.out.println("Detalles técnicos: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("❌ ERROR: Ocurrió un problema al leer el archivo.");
            System.out.println("Detalles técnicos: " + e.getMessage());

        } finally {
            // Cerrar el archivo en el bloque finally
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Archivo cerrado correctamente.");
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }
}
