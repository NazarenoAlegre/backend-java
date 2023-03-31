/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg004.guia;

import java.util.Scanner;

/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada
 * de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
 * en la tabla y el resto de los caracteres (incluyendo a las vocales
 * acentuadas) se mantienen sin cambios. a e i o u
 *
 * @ # $ % *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación.
 */
public class guia01 {

    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = entradas.nextLine();
        System.out.println("La frase se escribiría: " + codificar(frase));
    }

    public static String codificar(String entrada) {
        StringBuilder salida = new StringBuilder();

        for (int i = 0; i < entrada.length(); i++) {
            char caracter = entrada.charAt(i);
            switch (caracter) {
                case 'a':
                case 'A':
                    salida.append('@');
                    break;
                case 'e':
                case 'E':
                    salida.append('#');
                    break;
                case 'i':
                case 'I':
                    salida.append('$');
                    break;
                case 'o':
                case 'O':
                    salida.append('%');
                    break;
                case 'u':
                case 'U':
                    salida.append('*');
                    break;
                default:
                    salida.append(caracter);
                    break;
            }
        }

        return salida.toString();
    }

}
