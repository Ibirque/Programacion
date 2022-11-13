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
public class E033entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAM = 10;
        System.out.println("Introduce " + TAM + " valores enteros.");
        int c = 0;
        
        while(c < TAM){
            if(entrada.hasNextInt()){
                int valor = entrada.nextInt();
                System.out.println("Valor " + (c + 1) + " leido " + valor);
                c++;
            }else{
                entrada.next();
            }
            
        }
        
                
    }
    
}
