/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
*Se dice que una matriz A es antisimétrica cuando ésta es igual a su
*propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
*A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
*obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;


public class eje5 {
    public static void main(String[] args) {
         int[][] matriz = {{0, 1, 2},
                          {-1, 0, 3},
                          {-2,-3, 0}};
        imprimirMatriz(matriz, "Matriz:");
        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
    
    public static boolean esAntisimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[" + matriz1[j] + "] ");
            }
            System.out.println();
        }
    }
    }
  
