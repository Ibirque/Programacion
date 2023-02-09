/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

/**
 *
 * @author javie
 */
public class E052potencias2 {

    //iniciaciÃ³n procedural potencia 2
    public static void main(String[] args) {
        // programa que inicializa proceduralmente un array
        //con valores relacionados entre sÃ­
        
        //almacenar 20 enteros
        int[]valores = new int[20];
        //el Ã­ndice 0 se introduce manualmente
        valores[0] = 1;
        //el resto de Ã­ndices se llena secuencialmente
        for(int i = 1; i < valores.length; i++){
            valores[i] = 2 * valores[i-1];
        }
        System.out.print("Se ha generado el array: [ ");
        for(int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + " ");
        }
        System.out.println("]");
    }

}