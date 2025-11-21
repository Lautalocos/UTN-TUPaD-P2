/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular.bateria.usuario;

/**
 *
 * @author lauta
 */
public class usuario {
    private String nombre;
    private String dni;
    private celular celular;

    public usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setcelular(celular celular) {
        this.celular = celular;
    }
}
