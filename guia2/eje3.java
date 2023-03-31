/*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
*/
package guia2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class eje3 {
    public static void main(String[] args) {
        
    
    Scanner Leer = new Scanner(System.in);
        String frase;
        
        System.out.println("ingrese una Frase: ");
        frase= Leer.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
    }    
}
