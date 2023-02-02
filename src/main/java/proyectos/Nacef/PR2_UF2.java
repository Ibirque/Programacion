package proyectos.Nacef;

import java.util.Scanner;

public class PR2_UF2 {
     public int factores() {
        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        int p = 2;

        boolean salir = false;

        System.out.print("Introduce un numero entero: ");
        do {

            if (entrada.hasNextInt()) {

                numero = entrada.nextInt();

                if (numero <= 1) {

                    System.out.print("Intoduce un numero superior a 1 : ");

                } else {

                    salir = true;

                }

            } else {

                System.out.print("Introduce un numero entero: ");

                entrada.nextLine();

            }

        } while (!salir);

        int numeroInt = numero;

        System.out.print("Los factores del numero introducido es/son: ");

        while (numeroInt != 1) {
            if (numeroInt % p == 0) {
                System.out.print(p + " | ");

                primoNum(p, numeroInt, numero);

                numeroInt = numeroInt / p;

            } else {
                p++;
            }
        }
        return numero;
    }

    public void primoNum(int p, int numeroInt, int numero) {
        if (numeroInt == numero && numero == p) {
            System.out.println("y el numero " + p + " es un numero primo");
        }

    }
}
