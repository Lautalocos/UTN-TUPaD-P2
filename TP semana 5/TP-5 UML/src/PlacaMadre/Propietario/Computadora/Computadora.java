/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlacaMadre.Propietario.Computadora;

/**
 *
 * @author lauta
 */
public class Computadora {
    String marca;
    String numeroSerie;
    PlacaMadre placa;
    Propietario propietario;

    public Computadora(String marca, String numeroSerie, Propietario propietario, PlacaMadre placa) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        this.placa = placa;
        propietario.setComputadora(this);
    }
}
