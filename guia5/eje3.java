package guia5;

import java.util.Scanner;

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1
  dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
public class eje3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese la cantidad de números a procesar
        System.out.print("Ingrese la cantidad de números a procesar: ");
        int n = sc.nextInt();

        // Creamos un contador para cada cantidad de dígitos
        int[] contador = new int[6]; //vercor contador

        // Iteramos sobre los números ingresados por el usuario
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            // Obtenemos la cantidad de dígitos del número
            int digitos = String.valueOf(numero).length();

            // Incrementamos el contador correspondiente
            if (digitos <= 5) {
                contador[digitos]++;
            }
        }

        // Mostramos los resultados
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números de " + i + " dígitos: " + contador[i]);
        }
        System.out.println("Cantidad de números de más de 5 dígitos: " + contador[0]);
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