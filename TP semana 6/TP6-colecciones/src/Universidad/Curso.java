/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author lauta
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        // Si tenía un profesor previo, quitarse de su lista
        if (this.profesor != null && this.profesor != p) {
            this.profesor.getCursos().remove(this);
        }
        
        // Asignar el nuevo profesor
        this.profesor = p;
        
        // Agregar a la lista del nuevo profesor si no está
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        String profesorNombre = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + codigo + " - " + nombre + " | Profesor: " + profesorNombre);
    }
}