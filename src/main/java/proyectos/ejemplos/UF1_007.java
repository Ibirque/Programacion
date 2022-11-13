
package proyectos.ejemplos;

import java.util.Scanner;


public class UF1_007 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dividendo, divisor;
        System.out.println("Introduce el dividendo");
        dividendo = entrada.nextDouble();
        System.out.println("Introduce el divisor");
        divisor = entrada.nextDouble();
        
        if(divisor == 0){
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);
            System.out.printf("%.2f / %.2f = %.2f", dividendo, divisor, dividendo/divisor);
        }
    }
    
}
