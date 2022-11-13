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
public class UF1_025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAM = 10;
        int val1[] = new int[TAM];
        int val2[] = new int[TAM];
        int val3[] = new int[TAM * 2];
        for (int i = 0; i < TAM; i++) {
            System.out.println("Introduce numeros enteros");
           val1[i]= entrada.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            System.out.println("Introduce numeros enteros");
            val2[i]= entrada.nextInt();
        }
        int j =0;
        for(int i = 0; i < 10;i++){
            val3[j] = val1[i];
            j++;
            val3[j] = val2[i];
            j++;
        }
        System.out.println("");
    }

}
