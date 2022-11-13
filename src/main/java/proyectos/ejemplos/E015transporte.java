
package proyectos.ejemplos;

import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class E015transporte {
//con una compra mínima de 30€, el transporte es gratis
    //el transporte cuesta 5€
    //calcular el precio total de la compra
   
    public static void main(String[] args) {
        // Declaro como constante el precio del transporte
        final float TRANSPORTE = 5;
        // Declaro como constante la compra mínima
        final float COMPRA_MINIMA = 30;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cuál es el valor de tu compra?");
        float precio = entrada.nextFloat();
        entrada.nextLine();
        
        //Estructura de selección simple
        //Si evalúa true, se ejecuta el bloque de código,
        //en caso contrario, lo ignora
        if(precio < COMPRA_MINIMA){
            precio = precio + TRANSPORTE;
        }
        System.out.println("El precio final es " + precio + " euros.");
    }
    
}
