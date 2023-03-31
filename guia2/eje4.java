/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia2;

import java.util.Scanner;


public class eje4 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int C;
        
        System.out.println("Ingrese la temperatura en Grados Centigrados: ");
        C= Leer.nextInt();
        System.out.println("La temperatura en su equivalente en grados Fahrenheit: " + (32+(9*C/5)));
        
    }
    
}
