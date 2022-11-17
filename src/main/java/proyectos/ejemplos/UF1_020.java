/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

import java.util.Scanner;

/**
 *Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
 * 
También muestra los alumnos con notas superiores a la media.
* 
El número de alumnos se lee por teclado.
* 
Este programa utiliza un array de elementos de tipo double que contendrá las notas de los alumnos.
* 
El tamaño del array será el número de alumnos de la clase, por lo tanto primero se pedirá por teclado el
número de alumnos y a continuación se creará el array.
* 
Se realizan 3 recorridos sobre el array, el primero para asignar a cada elemento las notas introducidas por
teclado, el segundo para sumarlas y calcular la media y el tercero para mostrar los alumnos con notas
superiores a la media.
 * @author javier
 */
public class UF1_020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = 0;
        boolean salir = false;
        
        do{
            System.out.println("¿Cuantos alumnos hay en la clase?");
            if(entrada.hasNextInt()){
                tam = entrada.nextInt();
                salir = true;
                
            }
            entrada.nextLine();
        }while(!salir);
        double valor [] = new double [tam];
        for(int i = 0; i < valor.length;i++ ){
            System.out.println("Notas del "+(i+1)+"º");
            valor[i] = entrada.nextDouble();
        }
        double suma = 0;
        for(int j = 0; j<valor.length;j++){
            suma += valor[j];
        }
        double media = suma/valor.length;
        System.out.println("La media de la clase es " + suma/media);
        int supe = 0;
        for(int i = 0;i<valor.length; i++){
            if(valor[i] >= media){
                supe++;
            }
        }
        System.out.println("Los alumnos por encima de la media son " + supe);
    }
    
}
