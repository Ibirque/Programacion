
package proyectos.ejemplos;

import java.util.Scanner;


public class E013mayor {

   
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
        }
        //fuera de la expresión
        System.out.println("Ya está, no hay nada más que hacer");
    }
    
}
