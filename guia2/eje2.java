//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
/*
 */
package guia2;

import java.util.Scanner;


/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
*/
public class eje2 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("ingrese un su nombre ");
        nombre= Leer.nextLine();
        System.out.println("SU NOMBRE ES: " + nombre);
        
        
    }
    
}
