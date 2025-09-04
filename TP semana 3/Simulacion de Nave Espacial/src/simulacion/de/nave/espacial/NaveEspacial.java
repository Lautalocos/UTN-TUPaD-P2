/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacion.de.nave.espacial;

/**
 *
 * @author lauta
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private int distanciaRecorrida;
    private boolean despegar;
    
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        distanciaRecorrida = 0;
    }
    
    public boolean despegar() {
        System.out.println("la nave despego!");
        return despegar = true;
    }
    
    public void avanzar(int distancia) {
        if (distancia <= combustible && despegar == true) {
            System.out.println("la nave avanzo " + distancia + " kilometros");
            combustible -= distancia;
            distanciaRecorrida += distancia;
        } else {
            System.out.println("no hay suficiente combustible o no despego la nave");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        int nuevoCombustible = combustible + cantidad;
        if (cantidad > 0 && nuevoCombustible <= 100) {
            combustible += cantidad;
            System.out.println("la nave tiene " + combustible + " combustible");
        } else {
            System.out.println("error! el limite de combustible es de 100 unidades");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("\nestado de nave:\nnombre: " + nombre + "\ncombustible: " + combustible + "\ndistancia recorrida: " + distanciaRecorrida + "\n");
    }
    
    
    
}
