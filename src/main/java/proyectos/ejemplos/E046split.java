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
public class E046split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Itroduce una frase");
        String frase = entrada.nextLine();
        String[] palabras = frase.split(" ");
        System.out.println("El texto a la inviersa es ");
        //System.out.println("Las palabras de la frase son:");
        for(int i = palabras.length-1; i >=0;i--){
            System.out.print(palabras[i]);
            System.out.print(" ");
        }
    }
    
}
