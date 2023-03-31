/*
 Recorrer un vector de N enteros contabilizando cuántos números 
son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5;

import java.util.Scanner;

public class eje3ConNumeros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese los numero a procesar: ");
        
        int cantidad = leer.nextInt();

        int [] digitos= new int[6];
       
        int num=0;
        
        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("ingresa un numero de hasta cinco digitos: ");
            System.out.println(" Ingrese el número " + (i + 1) + ": ");

            do {
                 num = leer.nextInt();
                 
            } while (contarDigitos(num)>6);
            digitos[contarDigitos(num)]++;
              }
         for (int j = 0; j <= 5; j++) {
            System.out.println( "\n Cantidad de números de "+j+" dígitos: " + digitos[j] );
        }
    }

    
    public static int contarDigitos(int num) {
        int digitos = 0;
        while (num != 0) {
            digitos++;
            num /= 10;
        }
        return digitos;
    }
  
}
