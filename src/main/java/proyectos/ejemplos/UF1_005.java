
package proyectos.ejemplos;

import java.util.Scanner;


public class UF1_005 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 100");
        
        
        int num = entrada.nextInt();
        
        if(num > 0 && num < 101){
            if(num%2==0) {
                System.out.println("El número " + num + " es par");
            } else {
                System.out.println("El número " + num + " es impar");
            }
        } else {
            System.out.println(num + " no es un número del 1 al 100");
        }
    }
    
}
