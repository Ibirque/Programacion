
package proyectos.ejemplos;

import java.util.Scanner;


public class SEG001 {

   
    public static void main(String[] args) {
        // declaración de variables
        String nombre;
        //declaración de Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        nombre = entrada.nextLine();
        //imprimir el resultado
        System.out.println("Buenos días " + nombre);
    }
    
}
