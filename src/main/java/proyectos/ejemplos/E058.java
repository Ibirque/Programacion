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
public class E058 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variable para almacenar FILAS
        int filas = 0;
        //lectura de filas
        while (filas <= 0) {
            System.out.println("Â¿CuÃ¡ntas filas?");
            if (entrada.hasNextInt()) {
                filas = entrada.nextInt();
            } else {
                entrada.next();
                System.out.println("Valor incorrecto");
            }
        }
        entrada.nextLine();
        
        //lectura de columnas
        int columnas = 0;
        //lectura de columnas
        while (columnas <= 0) {
            System.out.println("Â¿CuÃ¡ntas columnas?");
            if (entrada.hasNextInt()) {
                columnas = entrada.nextInt();
            } else {
                entrada.next();
                System.out.println("Valor incorrecto");
            }
        }
        entrada.nextLine();
       
        //inicializaciÃ³n del array
        int [][] bidi = new int[filas][columnas];
        //mostrar los rangos
        System.out.println("Hay " + bidi.length + " filas.");
        System.out.println("Hay " + bidi[8].length + " columnas.");
        
        //recorrer cada fila con i
        for(int i = 0; i < filas; i++){
            //inicio de la tabla
            System.out.print("Fila " + i + " { ");
            //recorrer la columna
            for(int j = 0; j < columnas; j++){
                System.out.print(bidi[i][j]+ " ");
            }
            //al final de cada fila se cierra la llave
            System.out.println("}");
        }
    }

}