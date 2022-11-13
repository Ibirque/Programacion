package proyectos.ejemplos;

import java.util.Scanner;

public class E024doWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        do {
            System.out.println("Pon 0 para salir");
            num = entrada.nextInt();
        } while (num != 0);

        System.out.println("FIN");

    }
}
