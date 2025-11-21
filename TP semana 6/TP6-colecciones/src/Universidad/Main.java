/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Universidad;

/**
 *
 * @author lauta
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Crear profesores y cursos
        System.out.println("=== TAREA 1: Crear profesores y cursos ===");
        Profesor prof1 = new Profesor("P001", "Dr. Juan Pérez", "Matemáticas");
        Profesor prof2 = new Profesor("P002", "Dra. María López", "Programación");
        Profesor prof3 = new Profesor("P003", "Ing. Carlos Díaz", "Bases de Datos");

        Curso curso1 = new Curso("C001", "Algoritmos");
        Curso curso2 = new Curso("C002", "Estructura de Datos");
        Curso curso3 = new Curso("C003", "Base de Datos I");
        Curso curso4 = new Curso("C004", "Cálculo I");
        Curso curso5 = new Curso("C005", "Programación II");

        // 2. Crear universidad y agregar
        System.out.println("\n=== TAREA 2: Agregar a universidad ===");
        Universidad universidad = new Universidad("Universidad Tecnológica");
        
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        // 3. Asignar profesores a cursos
        System.out.println("\n=== TAREA 3: Asignar profesores ===");
        universidad.asignarProfesorACurso("C001", "P002");
        universidad.asignarProfesorACurso("C002", "P002");
        universidad.asignarProfesorACurso("C003", "P003");
        universidad.asignarProfesorACurso("C004", "P001");
        universidad.asignarProfesorACurso("C005", "P002");

        // 4. Listar cursos y profesores
        System.out.println("\n=== TAREA 4: Listar cursos con profesores ===");
        universidad.listarCursos();
        
        System.out.println("\n=== Listar profesores con sus cursos ===");
        universidad.listarProfesores();
        for (Profesor p : List.of(prof1, prof2, prof3)) {
            p.listarCursos();
            System.out.println();
        }

        // 5. Cambiar profesor de un curso
        System.out.println("\n=== TAREA 5: Cambiar profesor ===");
        System.out.println("Cambiando profesor de Algoritmos...");
        universidad.asignarProfesorACurso("C001", "P001");
        curso1.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();

        // 6. Remover un curso
        System.out.println("\n=== TAREA 6: Eliminar curso ===");
        universidad.eliminarCurso("C004");
        prof1.listarCursos();

        // 7. Remover un profesor
        System.out.println("\n=== TAREA 7: Eliminar profesor ===");
        universidad.eliminarProfesor("P003");
        universidad.listarCursos();

        // 8. Mostrar reporte
        System.out.println("\n=== TAREA 8: Reporte ===");
        universidad.mostrarReporteCursosPorProfesor();
    }
}