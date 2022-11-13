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
public class E042compareto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String secreto = "julio";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivina el mes");
        boolean aciento =false;
        while(!aciento){
            System.out.println("¿que mes crees que es?");
            String intento = entrada.next();
            entrada.nextLine();
            int orden = intento.compareTo(secreto);
            System.out.println(orden);
            if(orden<0){
                System.out.println("Has fallado, el mes que buscas va despues alfabeticamente ");
                
            }else if(orden > 0){
                System.out.println("Has fallado, el mes que buscas va despues alfabeticamente ");
                
            }else{
                aciento = true;
            }
            
        }
    }
    
}
