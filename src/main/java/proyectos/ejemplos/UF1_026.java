/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

import java.util.Scanner;

/**
 * Leer por teclado una serie de 10 números enteros. La aplicación debe
 * indicarnos si los números están ordenados de forma creciente, decreciente, o
 * si están desordenados.
 *
 * @author javie
 */
public class UF1_026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAM = 10;
        int a[] = new int[TAM];
        int cre = 0, decre = 0;
        System.out.println("");
        for (int i = 0; i < TAM; i++) {
            while (!entrada.hasNextInt()) {
                System.out.println("No es un numero ");
                entrada.next();
            }
            a[i] = entrada.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (a[i] < a[i + 1]) {
                cre++;
            } else {
                decre++;
            }
        }
        if(cre==9){
            System.out.println("Los numeros son crecientes");
        }else if(decre==9){
            System.out.println("Los numeros son decrecientes");
        }else{
            System.out.println("Los numeros son desiguales");
        }
        System.out.println(cre);
        System.out.println(decre);
    }

}
