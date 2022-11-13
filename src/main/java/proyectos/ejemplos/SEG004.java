

package proyectos.ejemplos;

import java.util.Scanner;



public class SEG004 {

    
    public static void main(String[] args) {
        // declaración de variables
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero de 5 dígitos:");
        num = entrada.nextInt();
        System.out.println(num / 10000);
        System.out.println(num / 1000);
        System.out.println(num / 100);
        System.out.println(num / 10);
        System.out.println(num);
    }
    
}
