package guia5;

import java.util.Scanner;

/**
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
 define su tipo de dato de tal manera que te permita alojar sus nombres más adelante
 */
public class ejeTeoria1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de compañeros del Equipo: ");
        Scanner leer = new Scanner(System.in); 
    	int cant= leer.nextInt();
        String[] equipo = new String[cant];
        cargaVector(cant,equipo);
        System.out.println("Los nombres del miembro del equipo ingresador fueron: ");
        mostrarVector(cant, equipo);            
        }
     
    public static void cargaVector(int df,String[]vector ){
        Scanner leer = new Scanner(System.in); 
        for (int i = 0; i < df; i++) {
            System.out.println("ingrese el nombre del miembro del equipo: ");
            vector[i]= leer.nextLine();
    }
	}
    public static void mostrarVector(int df, String[]vector ){
        
        for (int i = 0; i < df; i++) {
            System.out.println((i+1)+"º "+" "+ vector[i]);
          
    }
	}
          
}

