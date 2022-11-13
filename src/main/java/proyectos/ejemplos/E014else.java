
package proyectos.ejemplos;

import java.util.Scanner;


public class E014else {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        System.out.println("Introduce un número");
        a = entrada.nextInt();
        System.out.println("Introduce otro número");
        b = entrada.nextInt();
        //expresión booleana que hay que evaluar
        if(a > b) {
            System.out.println(a + " es mayor que " + b);
        } else {
            System.out.println(b + " es mayor que " + a);
        }
        //excepto si son iguales
        System.out.println("FIN");
    }
    
}
