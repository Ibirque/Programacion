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
public class E045 {

    /**
     * Programa que muestre por pantalla cada palabra individual de una frase.
     * (habra que buscar las posiciones con espacio en blanco para delimitar las palabras)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        String frase = entrada.nextLine();
        int inicio = frase.indexOf(' ');
        int fin = frase.lastIndexOf(' ');
        System.out.println(inicio);
        System.out.println(fin);
  
        for(int i = inicio; i<=fin;i++){
            String nueva = frase.substring(0, inicio);
            System.out.println(nueva);
            frase = frase.substring(inicio+1,frase.length());
        }
        
    }
    
}
