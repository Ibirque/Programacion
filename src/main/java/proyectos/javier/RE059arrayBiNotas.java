/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.javier;

import java.util.Scanner;

/**
 * Programa que guarda en cada fila las notas de los estudiantes. Calcular la
 * nota final y guardarla en la última columna. Calcular la media de las notas
 * finales.
 *
 * @author javie
 */
public class RE059arrayBiNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 0, c = 0;
        System.out.println("Introduce f");
        f = sc.nextInt();
        System.out.println("Introduce c");
        c = sc.nextInt();

        int a[][] = new int[f][c];
        int sumaFinales = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Notas " + (i + 1) + "º" + "alumno.");
            for (int k = 0; k < a[0].length; k++) {
                System.out.println("Nota " + (k + 1) + "º");
                a[i][k] = sc.nextInt();

            }

        }
        for (int i = 0; i < a.length; i++) {
            int suma = 0;
            for (int k = 0; k < a[i].length; k++) {
                if (k != (a.length - 1)) {
                    suma = suma + a[i][k];

                } else {
                    int notaFinal = suma / a[i].length - 1;
                    a[i][k] = notaFinal;
                    System.out.println("El estudiante " + i + " ha sacado un " + notaFinal);
                    //actualizar la suma de las medias de todos
                    sumaFinales = sumaFinales + notaFinal;
                }

            }
        }
        float mediaFinal = sumaFinales / a.length;
        System.out.println("La nota media del curso es " + mediaFinal);
    }
}
