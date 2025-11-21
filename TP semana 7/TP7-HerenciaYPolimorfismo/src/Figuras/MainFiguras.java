/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;



public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 3)
        };

        for (Figura f : figuras) {
            System.out.println(f.nombre + " - Área: " + f.calcularArea());
        }
    }
}