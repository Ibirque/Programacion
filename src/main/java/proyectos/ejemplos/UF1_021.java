/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

/**
 *Programa que crea un array de 20 elementos llamado Pares y guarde los 20
primeros números pares.
* 
Mostrar por pantalla el contenido del array creado
 * @author javie
 */
public class UF1_021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []pares = new int [20];
        // llenarlo con numero pares
        int cont = 2;
        for(int i = 0; i < pares.length; i++){
            pares[i] = cont ;
            cont += 2;
        }
        for( int i = 0; i<pares.length;i++){
            System.out.println(pares[i]);
        }
    }
    
}
