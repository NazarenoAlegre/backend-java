/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg004.guia;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        double resultado;

        System.out.println("Ingresar dos números:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        System.out.println("Ingresar opcion de 1 a 4:\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = restar(num1, num2);
                System.out.println("La resta es: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("La multiplicacion es: " + resultado);
                break;
            case 4:
                resultado = dividir(num1, num2);
                System.out.println("La division es: " + resultado);
                break;
            default:
                System.out.println("De 1 a 4 solamente.");
        }
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
