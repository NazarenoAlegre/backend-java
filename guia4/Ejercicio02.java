/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg004.guia;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        String preg = "N"; String nombre1 = ""; int Edad = 0;

        do {
        System.out.println("Ingrese el nombre de una persona:");
        nombre1 = datos.next();
        System.out.println("Escriba la edad de la persona:");
        Edad = datos.nextInt();

        System.out.println("Ingreso " + nombre1 + ", " + Edad);
        CompEdad(Edad);

        System.out.println("¿Desea ingresar otro?");
        preg = datos.next();
        }
        while (!("No".equalsIgnoreCase(preg)));
        System.out.println("Saliendo...");
    }

    public static void CompEdad(int cuantos) {

        if (cuantos < 18) {
            System.out.println("Es menor");
        } else {
            System.out.println("Es mayor");
        }
    }
    
}
