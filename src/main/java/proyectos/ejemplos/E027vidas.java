package proyectos.ejemplos;

import java.util.Scanner;

public class E027vidas {

    public static void main(String[] args) {
        int secreto = (int) ((Math.random() * 9) + 1);
        System.out.println("secreto: " + secreto);
        Scanner entrada = new Scanner(System.in);
        int num;
        int vidas = 3;
        boolean salir = false;

        do {
            System.out.println("Adivina un número del 1 al 9");
            System.out.println("Tienes " + vidas + " vidas");
            System.out.println("Pon 0 para salir");
            
            num = entrada.nextInt();
            if (num == 0) {
                salir = true;
            } else {
                if (num == secreto) {
                    System.out.println("Acertaste!");
                    salir = true;
                } else {
                    System.out.println("Fallaste!");
                    vidas--;
                    if (num > secreto) {
                        System.out.println("El número secreto es menor");
                    } else {
                        System.out.println("El número secreto es mayor");
                    }
                    if (vidas <= 0) {
                        salir = true;
                        //System.out.println("GAME OVER");
                    }

                }
            }
        } while (!salir);

        System.out.println("FIN");

    }

}
