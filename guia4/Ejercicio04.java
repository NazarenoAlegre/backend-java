/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg004.guia;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        boolean esPrimo = esNumeroPrimo(numero);
        String mensaje = esPrimo ? "El número " + numero + " es primo." : "El número " + numero + " no es primo.";
        System.out.println(mensaje);
    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
