
package proyectos.ejemplos;

import java.util.Scanner;


public class UF1_009 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int H, M, S;
        System.out.println("Introduce una hora");
        H = entrada.nextInt();
        System.out.println("Introduce minutos");
        M = entrada.nextInt();
        System.out.println("Introduce segundos");
        S = entrada.nextInt();
        
        if( H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60){
            System.out.println("Hora correcta");
        }else {
            System.out.println("Qué es eso?");
        }
        
    }
    
}
