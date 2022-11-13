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
public class UF1_022 {

    /**
Programa Java para leer la altura de N personas y calcular la altura media.
* 
Calcular cuántas personas tienen una altura superior a la media y cuántas tienen
una altura inferior a la media.
* 
El valor de N se pide por teclado y debe ser entero positivo.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = 0, cont = 0;
        boolean salir = false;
        do{
            System.out.println("¿Cuantas personas hay en clase?");
            if(!entrada.hasNextInt()){
                tam = entrada.nextInt();
                entrada.nextLine();
            }
            tam = entrada.nextInt();
        }while(tam<=0);
        double valor [] = new double [tam];
        
        do{
            System.out.println("Introduce la altura de los chicos");
            if(entrada.hasNextDouble()){
                for(int i = 0; i<valor.length;i++){
                    System.out.println("Altura del " + (i+1) + " chico es " + valor);
                    valor[i] = entrada.nextDouble();
                    cont++;
                }
                //cont++;
            }else{
                System.out.println("NO es un nuemro");
                cont--;
            }
        }while(cont <= tam);
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
