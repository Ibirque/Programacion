
package proyectos.ejemplos;

import java.util.Scanner;


public class SEG003 {

    public static void main(String[] args) {
        // declaración de variables
        double gradosC, gradosF;
        //declaración de Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Grados ºC:");
        gradosC = entrada.nextDouble();
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC + " ºC equivale a " + gradosF + " ºF");
        
        
    }
    
}
