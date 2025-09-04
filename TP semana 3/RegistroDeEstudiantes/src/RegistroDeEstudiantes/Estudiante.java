/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroDeEstudiantes;

/**
 *
 * @author lauta
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo() {
        System.out.println("informacion: \n" + apellido + " " + nombre + "\n" + curso + "\n" + calificacion);
    }
    
    public void subirCalificacion(int puntos) {
        int nuevaCalificacion = calificacion + puntos;
        if (nuevaCalificacion <= 10) {
            calificacion = nuevaCalificacion;
        } else {
            calificacion = 10;
        }
    }
    
    public void bajarCalificacion(int puntos) {
        int nuevaCalificacion = calificacion - puntos;
        if (nuevaCalificacion >= 0) {
            calificacion = nuevaCalificacion;
        } else {
            calificacion = 0;
        }
    }
}
