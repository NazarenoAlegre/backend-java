/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package guia2;

import java.util.Scanner;


public class eje1 {

 
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int num1, num2, suma;
        
        System.out.println("ingrese un numero: ");
        num1= Leer.nextInt();
        System.out.println("ingrese Otro numero: ");
        num2= Leer.nextInt();  
       //suma= num1+num2;
        System.out.println("Su suma es: " +( num1+num2));
    }
    
}
