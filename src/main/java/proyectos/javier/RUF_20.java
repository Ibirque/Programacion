/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.javier;

import java.util.Scanner;

/**
 * Programa que lee por teclado la nota de los alumnos de una clase y calcula la
 * nota media del grupo. También muestra los alumnos con notas superiores a la
 * media.
 *
 * El número de alumnos se lee por teclado.
 *
 * Este programa utiliza un array de elementos de tipo double que contendrá las
 * notas de los alumnos.
 *
 * El tamaño del array será el número de alumnos de la clase, por lo tanto
 * primero se pedirá por teclado el número de alumnos y a continuación se creará
 * el array.
 *
 * Se realizan 3 recorridos sobre el array, el primero para asignar a cada
 * elemento las notas introducidas por teclado, el segundo para sumarlas y
 * calcular la media y el tercero para mostrar los alumnos con notas superiores
 * a la media.
 *
 * @author javier
 */
public class RUF_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos");
        while (!sc.hasNextInt()) {
            System.out.println("Eso no es un nuemero: ");
            sc.next();
        }
        int TAM = sc.nextInt();
        double notas[] = new double[TAM];
        System.out.println("Introduce sus notas");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introdude las notas del alumno " + (i+1));
            while (!sc.hasNextDouble()) {
                System.out.println("Eso no es un nuemero: ");
                sc.next();
            }
            
            notas[i] = sc.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        int cont = 0;
        System.out.println("La media es: " + (suma / TAM));
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < (suma / TAM)) {
                cont++;
            }
        }
        System.out.println("Los alumnos por encima de la media son: " + cont);

    }

}
