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
public class E034preguntarTAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = 0;
        boolean salir = false;
        do{
            System.out.println("¿que tamaño tendra el array");
            if(entrada.hasNextInt()){
                tam = entrada.nextInt();
                salir = true;
                
            }
            entrada.nextLine();
        }while(!salir);
        double valores[] = new double[tam];
        for(int i = 0; i< valores.length;i++){
            System.out.println("introduce el valor " + (i+1));
            if(entrada.hasNextDouble()){
                valores[i] = entrada.nextDouble();  
            }else{
                i--;
                System.out.println("Elemento no valido ");
            }
            entrada.nextLine();
           
        }
        double acumulado = 0;
        for(int i = 0; i < valores.length; i++){
            acumulado += valores[i];
        }
        System.out.println("La suma acumulada es " + acumulado);
        System.out.println("La media es " + (acumulado/valores.length));
    } 
    
}
