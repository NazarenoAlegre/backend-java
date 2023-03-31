/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

import java.util.Random;

public class eje4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        llenarMatriz(matriz);
        imprimirMatriz(matriz, "Matriz original:");
        int[][] traspuesta = calcularTraspuesta(matriz);
        imprimirMatriz(traspuesta, "Matriz traspuesta:");
    }

    public static void llenarMatriz(int[][] matriz) {
        Random rand = new Random();
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = rand.nextInt(100);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public static int[][] calcularTraspuesta(int[][] matriz) {
        int[][] traspuesta = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j];// aca esta la magia
            }
        }
        return traspuesta;
    }
}
