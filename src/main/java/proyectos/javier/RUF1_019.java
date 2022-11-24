/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.javier;

import java.util.Scanner;

/**
 * Programa Java que lea 10 números enteros por teclado y los guarde en un
 * array. Calcula y muestra la media de los números que estén en las posiciones
 * pares del array. Considera la primera posición del array (posición 0) como
 * par.
 *
 * @author javie
 */
public class RUF1_019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        System.out.println("Introduce los datos " + n.length);
        for (int i = 0; i < n.length; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Introduce un numero");
                sc.nextLine();
            }

            n[i] = sc.nextInt();

        }

        int aux = 0;

        for (int i = 0; i < n.length; i += 2) {
            aux += n[i];
            System.out.println(aux + "c");
        }
        System.out.println("La media es: " + (aux / (10 / 2)));
    }

}
