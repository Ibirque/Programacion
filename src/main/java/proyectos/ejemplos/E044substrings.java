/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class E044substrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase");

        String frase = entrada.nextLine();
        int inicio = frase.indexOf(' ');
        int fin = frase.lastIndexOf(' ');
        System.out.println("La frase sin la primera palabra ni la ultima es:  ");
        if (inicio == fin) {
            System.out.println("No hay nada que escribir");
        } else {
            String nueva = frase.substring(inicio + 1, fin);
            System.out.println(nueva);
        }
    }

}
