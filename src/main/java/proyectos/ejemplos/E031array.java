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
public class E031array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAM = 5;
        int valores[] = new int[TAM];

        
        for(int i = 0;i<valores.length;i++){
            System.out.println("Introduce un numero entero");
            while (!entrada.hasNextInt()) {
            System.out.println("Valor incorrecto");
            entrada.nextLine();
            }
            valores[i] = entrada.nextInt();
        }
        
        for(int i = 0; i<valores.length;i++){
            System.out.println("El elemento " + (i +1) + " es " + valores[i]);
        }
    }
    
}
