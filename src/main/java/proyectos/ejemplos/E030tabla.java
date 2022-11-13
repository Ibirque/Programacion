
package proyectos.ejemplos;

import java.util.Scanner;

public class E030tabla {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué tabla quieres imprimir?");
        int n = entrada.nextInt();
        System.out.println("Tabla del " + n);
        System.out.println("***************");
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " X " + n + " = " + i*n);
        }
        System.out.println("FIN");
    }
    
}
