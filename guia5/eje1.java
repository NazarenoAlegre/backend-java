/*
 .
 */
package guia5;

//import java.util.Scanner;
/**
 * Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 */
public class eje1 {

    public static void main(String[] args) {

        //   Scanner leer= new Scanner(System.in);
        int[] num = new int[100];
        for (int i = 0; i < 100; i++) {
            num[i] = i;
        }
        for (int j = 99; 0 <= j; j--) {
            System.out.print((num[j]+1)+" - ");
            
        }
    }
}
