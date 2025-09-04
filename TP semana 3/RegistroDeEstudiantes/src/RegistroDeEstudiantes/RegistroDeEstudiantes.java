/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RegistroDeEstudiantes;

/**
 *
 * @author lauta
 */
public class RegistroDeEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante alumno = new Estudiante();
        
        alumno.setNombre("lautaro");
        alumno.setApellido("laner");
        alumno.setCurso("comision 3");
        alumno.setCalificacion(7);
        
        alumno.mostrarInfo();
        alumno.subirCalificacion(1);
        alumno.mostrarInfo();
        alumno.bajarCalificacion(7);
        alumno.mostrarInfo();
    }
    
}
