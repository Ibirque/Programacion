
package proyectos.ejemplos;

import java.util.Scanner;


public class SEG002 {

    
    public static void main(String[] args) {
        // declaración de variables
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        num = entrada.nextInt();
        //impresión del resultado
        System.out.println("Número introducido: " + num);
        System.out.println("El doble de " + num + " es " + 2 * num);
        System.out.println("El triple de " + num + " es " + 3* num);
    }
    
}
