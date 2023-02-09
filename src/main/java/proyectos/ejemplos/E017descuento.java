
package proyectos.ejemplos;

import java.util.Scanner;


public class E017descuento {

    //precio transporte 5
    //compra mínima para transporte gratis 30
    //compra mínima para descuento del 15%, 100
    
    public static void main(String[] args) {
        //declaración de constantes
        final float TRANSPORTE = 5;
        final float DESCUENTO = 0.15f;
        final float COMPRA_MIN_TRANSPORTE = 30;
        final float COMPRA_MIN_DTO = 100;
        
        //declaración de variables
        //float precio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuál es el precio final de la compra?");
        float precio = entrada.nextFloat();
        entrada.nextLine();
        
        //Estructura de selección
        if (precio < COMPRA_MIN_TRANSPORTE){
            precio += TRANSPORTE;
            //precio = precio + TRANSPORTE
        } else if(precio >= COMPRA_MIN_DTO) {
           precio = precio - (precio * DESCUENTO);
        }
        
        System.out.println("El precio final es de " + precio + " euros.");
    }
    
}
