/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.Ouxi;

import java.util.Scanner;

/**
 *
 * @author 11938
 */
public class ExamenLetra {

    //Variables que necesito para trabajar en mas de una clase
    public String letra = null;
    public String texto = null;

    public static void main(String[] args) {
        ExamenLetra programa = new ExamenLetra();
        programa.inicio();
    }

    //Clase para invocar las otras clases
    public void inicio() {
        IntroducirT();
        PedirLetra();
        ContarCantidad();
    }

    //Clase para introducir el texto y valido que no sea numeros
    public String IntroducirT() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un texto");
        while (entrada.hasNextInt()) {
            System.out.println("No se permite numero\nIntroduce una cadena de textos:");
            entrada.next();
        }
        texto = entrada.nextLine();
        return texto;
    }

    //Clase para introducir la letra que el usuario quiera buscar y valido que
    //sólo pueda ser una letra y que no sea un numero
    public void PedirLetra() {
        Scanner entrada = new Scanner(System.in);
        boolean salida = false;
        System.out.println("Que letra desea buscar en la cadena de textos?");
        do {
            while (entrada.hasNextInt()) {
                System.out.println("No se permite numero\nIntroduce una cadena de textos:");
                entrada.next();
            }
            letra = entrada.next();
            if (letra.length() > 1) {
                System.out.println("Solo se permite una letra");
                continue;
            } else {
                salida = true;
            }
        } while (!salida);
    }

    //Clase para contar la cantidad de veces que aparece la letra en la cadena de texto.
    public void ContarCantidad() {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (letra.toLowerCase().charAt(0) == texto.toLowerCase().charAt(i)) {
                contador++;
            }

        }
        System.out.println("La frase introducida contiene "  + contador + " veces la letra " + letra);
    }
}
//EN ESTE EJERCICIO NO TUVE NINGUN PROBLEMA, ES MUY PARECIDO AL EJERCICIO DE PALINDROMO E INCLUSO DIRIA QUE ES AUN MAS FACIL
//YA QUE TARDE MUCHO MENOS EN HACERLO Y VALIDARLO.