
package proyectos.ejemplos;

import java.util.Scanner;


public class SEG000 {

   
    public static void main(String[] args) {
        // declaración de variables
        int num1, num2;
        //declaración del Scanner
        Scanner entrada = new Scanner(System.in);
        //leer el primer número
        System.out.println("Introduce un número entero:");
        num1 = entrada.nextInt();
        //leer el segundo número
        System.out.println("Introduce otro número entero:");
        num2 = entrada.nextInt();
        //imprimir el resultado
        System.out.println("Has introducido los números: " + num1 + " y " + num2 );
    }
    
}
