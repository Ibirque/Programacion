package proyectos.ejemplos;

import java.util.Scanner;

public class E016precioFinal {
    //con una compra mínima de 30€, el transporte es gratis
    //el transporte cuesta 5€
    //con una compra mínima de 100€, 15%dto

    public static void main(String[] args) {
        final float TRANSPORTE = 5;
        final float DESCUENTO = 0.15F;
        final float COMPRA_MINIMA = 30;
        final float COMPRA_DTO = 100;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuál es el precio final de tu compra?");
        float precio = entrada.nextFloat();
        entrada.nextLine();
        
        //Estructura de selección simple
        if(precio < COMPRA_MINIMA){
            precio += TRANSPORTE;
        }
        if(precio >= COMPRA_DTO){
            precio = precio - (precio * DESCUENTO);
        }
        System.out.println("El precio final es de " + precio + " euros.");
        
    }

}
