/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.semana.pkg4;

/**
 *
 * @author lauta
 */
public class TPSemana4 {

    
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "ana", "IT", 80000);
        Empleado e2 = new Empleado("carlos", "tester");
        Empleado e3 = new Empleado("maria", "analista");

        e1.actualizarSalario(10.0);   // aumento porcentaje
        e2.actualizarSalario(5000); // aumento fijo

        // empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
