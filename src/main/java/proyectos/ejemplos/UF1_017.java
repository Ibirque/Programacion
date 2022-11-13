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
public class UF1_017 {

    /**
     * Programa que pida que se introduzcan dos números enteros por teclado y
muestre los números pares que hay entre ambos.A debe ser menor que B. Si no
es así se mostrará un mensaje indicándolo y se volverán a introducir.
     * @param args
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n1,n2,i;
        do {

            //pido el primer nÃºmero
            System.out.println("Introduce un nÃºmero entero");
            //lo valido
            while (!entrada.hasNextInt()) {
                System.out.println("Valor incorrecto, intÃ©ntalo de nuevo");
                entrada.next();
            }
            //lo guardo
            n1 = entrada.nextInt();
            //pido el segundo nÃºmero
            System.out.println("Introduce otro nÃºmero entero");
            //lo valido
            while (!entrada.hasNextInt()) {
                System.out.println("Valor incorrecto, intÃ©ntalo otro nÃºmero");
                entrada.next();
            }
            //lo guardo
            n2 = entrada.nextInt();
        } while (n1 == n2);
       for(i=n1;i<n2;i++){
               if((i%2)==0){
                   System.out.println(i);  
               }
           }
}}   

       /*if(n1<n2){
           for(i=n1;i<n2;i++){
               if((i%2)==0){
                   System.out.println(i);  
               }
           }
       }else{
           System.out.println("El numro n1 debes ser menos que n2");
       }
    }
*/

