/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

import java.util.Arrays;
import java.util.Scanner;


/**
 *Calcular la media de una serie de números que se leen por teclado.
Programa Java que lea por teclado 10 números enteros y los guarde en un array.
A continuación calcula y muestra por separado la media de los valores positivos y
la de los valores negativos.
 * @author javie
 */
public class UF1_018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       final int TAM = 10;
       double valor [] = new double [TAM];
       int con = 0;
       boolean flag = false;
       
       do{
           System.out.println("Introduce un valor " + (con + 1));
           System.out.println("S para salir");
           if(entrada.hasNextDouble()){
               valor[con] = entrada.nextDouble();
               con++;
           }else{
               char salir = entrada.next().charAt(0);
               if(salir=='s'||salir=='S'){
                   flag = true;
               }else{
                   System.out.println("Valor no valido");
               }
           }
           entrada.nextLine();
           if(con==TAM){
               System.out.println("No introducir mas datos ");
               flag = true;
           }
       }while(!flag);
       double sumPos = 0, sumNeg = 0;
       for(int i = 0;i<valor.length;i++){
           if(valor[i]<0){
               sumPos += valor[i];
           }else{
               sumNeg += valor[i];
           }
       }
        System.out.println("La suma positiba es " + sumPos);
        System.out.println("La suma positiba es " + sumNeg);
        
        
        

   /*Primero hacer un bucle desde 0 hasta "TAMAÑODEARRAY", despues comprobar si es positivo o nega,
        y mandar cada valor a su respectivo array donde se almacenara el array*/
    
    }
}
        

    

