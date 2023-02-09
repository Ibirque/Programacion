
package proyectos.ibirque;

import java.util.Scanner;


public class Uf_019BisIbir {

 
    public static void main(String[] args) {
        /*Leer 10 numeros por teclado, guardarlos en array
        calcular y mostrar media de los numeros en posiciones pares*/
        
        //variables
        int TAM = 9;
        int array[] = new int[TAM];
        int i = 0;
        int j = 0;
        int buffer=0;
        
        //banderas
        boolean salir = false;
        boolean salir2 = true;
   
        Scanner entrada = new Scanner(System.in);
        do{
            if(entrada.hasNextInt()){
                array[i] = entrada.nextInt();
                i++;
                entrada.nextLine();
                if(i >= (TAM-1)){
                    salir = true;
                    salir2 = false;
                }
            }else{
                System.out.println("Por favor, solo numeros enteros");
                entrada.nextLine();
            }
            
        }while(!salir);
        
        do{
            buffer = buffer+array[j];
            j = j+2;
            if(j>TAM){
                salir2 = true;
            }
            
        }while(!salir2);
        
        System.out.println("La media es: " + buffer/(TAM/2));
    
    
    }}
