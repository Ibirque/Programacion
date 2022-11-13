/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

import java.util.Scanner;

/**
 *Programa Java que lea 10 números enteros por teclado y los guarde en un array.
Calcula y muestra la media de los números que estén en las posiciones pares del
array.
Considera la primera posición del array (posición 0) como par.
 * @author javie
 */
public class UF1_019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              final int TAM = 10;
       Scanner entrada = new Scanner(System.in);
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
       double suma = 0;
       for(int i = 0;i <valor.length;i+=2){
           suma += valor[i];
       }
       System.out.println("La suma acumulada es " + suma);
       System.out.println("La media es " + (suma/valor.length));
    }
    
}
