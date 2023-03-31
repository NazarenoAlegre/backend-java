package guia5;

import java.util.Random;
import java.util.Scanner;

/**
2.Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
* le pida al usuario un número a buscar en el vector. El programa mostrará dónde se 
* encuentra el numero y si se encuentra repetido
*/
public class eje2 {
    public static void main(String[] args) {
        // Configurar la salida en UTF-8
        System.setProperty("file.encoding", "UTF-8");

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner dato = new Scanner(System.in);
        boolean falto= false;
        // Solicitar al usuario el tamaño del vector y el número a buscar
        System.out.print("Ingrese el tamaño del vector: ");
        int n = dato.nextInt();

        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = dato.nextInt();

        // Crear un vector de tamaño n con valores aleatorios
        int[] vector = new int[n];
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100);
            
            System.out.print( vector[i]+ " - ");
        }

        // Buscar el número en el vector
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] ==numeroBuscado) {
                System.out.println("\nEl número " + numeroBuscado + " se encuentra en la posición " + (i+1) + " del vector.");
                falto= false;
            }else{
                falto=true;            
            }
            
        }
        if (falto){     
        System.out.println("\n mala mia no esta el numero");
    }
    }
}
