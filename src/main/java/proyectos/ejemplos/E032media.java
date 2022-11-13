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
public class E032media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Introducimos 5 numeros reales
        //Calcular suma acumulada
        //Calcular la media
        Scanner entrada = new Scanner(System.in);
        final int TAM = 10;
        double valores[] = new double[TAM];
        //inicializamos
        for(int i =0;i < valores.length;i++){
            System.out.println("Introduce el valor "+ (i+1));
            //validar
            while(!entrada.hasNextDouble()){
                System.out.println("Valor incorrecto");
                entrada.nextLine();
            }
            valores[i] = entrada.nextDouble();
            
        }
        double acumulado = 0;
            for(int i =0;i < valores.length;i++){
                System.out.println("EL elemento " +(i+1) + " vale " + valores[i]);
                acumulado += valores[i];
            }
            System.out.println("La suma aculada es " + acumulado);
            System.out.println("La media es " + (acumulado/valores.length));
    }
    
}
