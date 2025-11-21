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
import java.io.IOException;

public class Ejercicio5_TryWithResources {
    public static void main(String[] args) {
        System.out.println("=== LECTURA DE ARCHIVO CON TRY-WITH-RESOURCES ===\n");

        String nombreArchivo = "datos.txt";

        // try-with-resources cierra automáticamente el BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            
            String linea;
            int numeroLinea = 1;
            int cantidadPalabras = 0;
            int cantidadCaracteres = 0;

            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            System.out.println("-----------------------------------");

            while ((linea = reader.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                
                // Estadísticas
                cantidadPalabras += linea.split("\\s+").length;
                cantidadCaracteres += linea.length();
                numeroLinea++;
            }

            System.out.println("-----------------------------------");
            System.out.println("\n✅ Archivo leído correctamente.");
            System.out.println("\n📊 Estadísticas:");
            System.out.println("   - Total de líneas: " + (numeroLinea - 1));
            System.out.println("   - Total de palabras: " + cantidadPalabras);
            System.out.println("   - Total de caracteres: " + cantidadCaracteres);

        } catch (IOException e) {
            System.out.println("❌ ERROR: No se pudo leer el archivo '" + nombreArchivo + "'");
            System.out.println("Asegúrese de que el archivo existe en la carpeta del programa.");
            System.out.println("Detalles técnicos: " + e.getMessage());
        }

        System.out.println("\nNota: El archivo se cerró automáticamente gracias a try-with-resources.");
    }
}
