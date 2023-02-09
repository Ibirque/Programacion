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
public class E057 {

    /**
     * Buscar una letra en concreto entre un array de caracteres
     */
    public static void main(String[] args) {
        char[]caracteres = {'a', 'f', 'g', 'b', 'c', 'd', 'e', 'f', 'g'};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Â¿QuÃ© letra quieres buscar?");
        char buscar = entrada.next().charAt(0);
        //bandera
        boolean encontrado = false;
        //bucle que recorremos mientras encontrado sea falso
        int i = 0;
        while((i < caracteres.length) && (!encontrado)){
            if(caracteres[i] == buscar){
                encontrado = true;
            }
            i = i + 1;
        }
        //encontrado?
        if(encontrado){
            System.out.println("Se ha encontrado");
        } else System.out.println("No estÃ¡");
    }
    
}
