/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular.bateria.usuario;

/**
 *
 * @author lauta
 */
public class celular {
    private String imei;
    private String marca;
    private String modelo;
    private bateria bateria;
    private usuario usuario;

    public celular(String imei, String marca, String modelo, usuario usuario, bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.usuario = usuario;
        this.bateria = bateria;
        usuario.setcelular(this);
    }
}