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
public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner teclas = new Scanner(System.in);
        System.out.print("Introduce la cantidad de moneda a convertir: ");
        double euros = teclas.nextDouble();
        System.out.print("Introduce la moneda a la que quieres convertir (libra/dolar/yen/pesos): ");
        String moneda = teclas.next();
        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        double resultado = 0;
        String mensaje = "";

        switch (moneda) {
            case "Libra":
            case "libra":
                resultado = euros * 0.86;
                mensaje = euros + " euros son " + resultado + " libras.";
                break;
            case "Dolar":    
            case "dolar":
                resultado = euros * 1.28611;
                mensaje = euros + " euros son " + resultado + " dólares.";
                break;
            case "Yen":
            case "yen":
                resultado = euros * 129.852;
                mensaje = euros + " euros son " + resultado + " yenes.";
                break;
            case "Pesos":
            case "pesos":
                resultado = euros * 408;
                mensaje = euros + " euros son " + resultado + " pesos.";
                break;
            default:
                mensaje = "Moneda no válida. Introduce libras, dólares o yenes.";
        }

        System.out.println(mensaje);
    }
}
