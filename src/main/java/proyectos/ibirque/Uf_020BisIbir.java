package proyectos.ibirque;

import java.util.Scanner;

public class Uf_020BisIbir {

    public static void main(String[] args) {
        /*Pedir la nota de los alumnos, calcular nota media del grupo
        Mostrar notas superiores a la media
        Numero de alumnos leido por teclado
        tipo double
        3 runs del array*/

        //variables
        int TAM = 0;
        int i = 0;
        double buffer = 0;

        //banderas
        boolean salir = false;
        boolean salir2 = false;

        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos");
        //pedimos el valor de tAM al usuario y lo atrapamos aqui hasta que nos de el correcto
        do {
            if (ent.hasNextInt()) {
                TAM = ent.nextInt();
                salir = true;
            } else {
                System.out.println("Por favor, introduce un numero entero");
                ent.nextLine();
            }
        } while (!salir);

        double array[] = new double[TAM];

        do {
            System.out.println("Introduce las notas de los alumnos");
            if (ent.hasNextInt()) {
                array[i] = ent.nextInt();
                i++;
                if (i >= TAM) {
                    salir2 = true;
                    i = 0;
                }
            } else {
                System.out.println("Solo valores correctos");
                ent.nextLine();
            }
        } while (!salir2);

        for (int j = 0; j < array.length; j++) {
            buffer = buffer + array[j];
        }
        System.out.println("La media es " + (buffer / TAM));
        for (int j = 0; j < array.length; j++) {
            if (array[j] > (buffer / TAM)) {
                System.out.println("El alumno " + (j + 1) + " con nota " + array[j] + " tiene una nota superior a la media");
            }
        }
    }
}
