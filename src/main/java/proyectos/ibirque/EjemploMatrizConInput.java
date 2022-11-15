package proyectos.ibirque;

import java.util.Scanner;

public class EjemploMatrizConInput {

    public static void main(String[] args) {

        //variables
        final int TAM = 5;
        int n;
        //banderas
        boolean salir = false;

        //input
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el valor 'y' de la matriz");

        do {

            if (entrada.hasNextInt()) {
                n = entrada.nextInt();
                int matriz[][] = new int[TAM][n];
                salir = true;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        matriz[i][j] = (i * matriz.length) + (j + 1);
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println("");
                }

            } else {
                System.out.println("Por favor introduce un numero no otro caracter");
                entrada.nextLine();
            }
        } while (!salir);

    }
}
