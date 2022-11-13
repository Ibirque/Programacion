package proyectos.ejemplos;

import java.util.Scanner;

public class E018notas {

    //pasar una nota cuantitativa a cualitativa
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué nota has sacado?");

        if (entrada.hasNextFloat()) {
            float nota = entrada.nextFloat();
            //Estructura de selección múltiple
            if ((nota >= 9) && (nota <= 10)) {
                System.out.println("Excelente");
            } else if ((nota >= 6.5) && (nota < 9)) {
                System.out.println("Notable");
            } else if ((nota >= 5) && (nota < 6.5)) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Suspendido");
            }
        } else {
            System.out.println("Esto no es una nota");
        }

    }

}
