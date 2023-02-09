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
public class E039busquedaCaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe texto");
        String texto = entrada.nextLine();
        
        System.out.println("¿que caracter quieres buscar?");
        String letra = entrada.next();
        entrada.nextLine();
        
        char caracter = letra.charAt(0);
        
        int incial = texto.indexOf(letra);
        int ultima = texto.lastIndexOf(letra);
        
        if(incial > -1){
            System.out.println("1º:" + incial);
            System.out.println("ultima:" + ultima);
        }else{
            System.out.println("No aparaece");
        }
    }
    
}
