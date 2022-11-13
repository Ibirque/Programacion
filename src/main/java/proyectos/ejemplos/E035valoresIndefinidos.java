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
public class E035valoresIndefinidos {

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
     double acumulado = 0;
     for(int i = 0; i < valor.length; i++){
         acumulado += valor[i];
    }
        System.out.println("La suma acumulada es " + acumulado);
        System.out.println("La media es " + (acumulado/valor.length));
    }
    
}
