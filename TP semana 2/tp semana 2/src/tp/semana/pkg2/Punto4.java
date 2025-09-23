/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.semana.pkg2;
import java.util.Scanner;
/**
 *
 * @author lauta
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double precio;
         char categoria;
         
         System.out.println("ingrese el precio del producto: ");
         precio = Double.parseDouble(input.nextLine());
         System.out.println("ingrese la categoria (a, b o c): ");
         categoria = input.nextLine().charAt(0);
         
         switch (categoria) {
             case 'a':
                  System.out.println("el precio original es " + precio + ", el descuento es del 10%, y el precio final es " + ((precio / 100) * 90));
                  break;
             case 'b':
                  System.out.println("el precio original es " + precio + ", el descuento es del 15%, y el precio final es " + ((precio / 100) * 85));
                  break;
             case 'c':
                  System.out.println("el precio original es " + precio + ", el descuento es del 20%, y el precio final es " + ((precio / 100) * 80));
                  break;
             default:
                 System.out.println("caracter invalido");
         }
         
    }
    
}
