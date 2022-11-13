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
public class E047acronimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Itroduce una frase");
        String frase = entrada.nextLine();
        String[] palabras = frase.split(" ");
        System.out.println("El acronimo es ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i].toUpperCase().charAt(0));
        }

    }
}
