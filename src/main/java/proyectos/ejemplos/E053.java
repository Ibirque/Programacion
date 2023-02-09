/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

/**
 *
 * @author javie
 */
public class E053 {

    //calcular media de las notas
    
    public static void main(String[] args) {
        float[]notas ={2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9.7f};
        float suma = 0;
        //recorrer array
        for(int i = 0; i < notas.length; i++){
            suma = suma + notas[i];
        }
        float media = suma / notas.length;
        //imprimir el resultado
        System.out.print("La nota media es ");
        System.out.printf("%.2f", media);
        
    }
    
}