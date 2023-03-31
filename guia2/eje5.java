/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
el triple y la raíz cuadrada de ese número.
 */
package guia2;

import java.util.Scanner;

public class eje5 {
    public static void main(String[] args) {
               
        Scanner Leer = new Scanner(System.in);
        int num1;
       
        System.out.println("ingrese un numero: ");
        num1= Leer.nextInt();
        
        System.out.println("El Doble de ese numeros es: " +( num1*2 ));
        System.out.println("El Triple de ese numeros es: " +( num1*3));
        System.out.println("la raiz cuadrada de ese numeros es: " +( Math.sqrt(num1)));
    }
    
}