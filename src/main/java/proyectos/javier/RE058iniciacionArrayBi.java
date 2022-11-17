/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.javier;

import java.util.Scanner;

/**
 *Asignar a cada posición valores que son fruto de un cálculo
 * 
Pedir número de filas
* 
Pedir número de columnas
* 
Asignar a cada posición la suma de sus índices
 * @author javie
 */
public class RE058iniciacionArrayBi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F = 0,C = 0, N = 0;
        
        
        System.out.println("Introduce filas");
        F = sc.nextInt();
        System.out.println("Intrudece columnas");
        C = sc.nextInt();
        
        int a [][] = new int [F][C];
        
        for(int i = 0; i < a.length; i++){
            N = sc.nextInt();
            for(int j = 0; j < a[0].length;j++){
                 System.out.println(a[i][j]+ " ");
            }
        }
    }
    
}
