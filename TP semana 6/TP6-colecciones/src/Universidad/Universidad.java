/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author lauta
 */
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
        System.out.println("Profesor agregado: " + p.getNombre());
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
        System.out.println("Curso agregado: " + c.getNombre());
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Profesor " + profesor.getNombre() + 
                             " asignado al curso " + curso.getNombre());
        } else {
            System.out.println("No se pudo realizar la asignación. Verificar IDs.");
        }
    }

    public void listarProfesores() {
        System.out.println("\n=== PROFESORES DE " + nombre + " ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor p : profesores) {
                p.mostrarInfo();
            }
        }
    }

    public void listarCursos() {
        System.out.println("\n=== CURSOS DE " + nombre + " ===");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        } else {
            for (Curso c : cursos) {
                c.mostrarInfo();
            }
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper la relación con su profesor
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null en todos los cursos que dictaba
            List<Curso> cursosACopiar = new ArrayList<>(profesor.getCursos());
            for (Curso c : cursosACopiar) {
                c.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }

    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}
