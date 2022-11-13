
package proyectos.ejemplos;

import java.util.Scanner;

public class E007char {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char caracter;
        System.out.println("Introduce una palabra");
        caracter = entrada.next().charAt(2);
        
        System.out.println("El tercer caracter de tu palabra es " + caracter);
    }
    
}
