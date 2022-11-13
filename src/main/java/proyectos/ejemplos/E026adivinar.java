
package proyectos.ejemplos;

import java.util.Scanner;


public class E026adivinar {

    public static void main(String[] args) {
       //generar número secreto
       int secreto = (int)((Math.random()*9)+1);
        System.out.println("secreto: " + secreto);
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean salir = false;
        do {
            System.out.println("Adivina un número del 1 al 9");
            System.out.println("Pon 0 para salir");
            num = entrada.nextInt();
            if(num==0){
                salir = true;
            } else {
                if(num==secreto){
                    System.out.println("Acertaste!");
                    salir = true;
                } else {
                    System.out.println("Fallaste!");
                }
            }
        }while(!salir);
        System.out.println("FIN");
    }
    
}
