package proyectos.practicas;

import java.text.Normalizer;
import java.util.Scanner;

public class PardoIbirqueFRASE {

    public static void main(String[] args) {
        /*Objetivo*/
        /*Crear un programa que pida un entero y compruebe si el numero
        se puede leer de derecha a izquierda que de izq. a der.*/
        /*EJ: 121, 3003, 33*/

        //Declaracion de variables
        String Frase = null;
        String Frase2 = "";
        int i = 0;
        int j = 0;

        //Banderas
        boolean salir1 = false;
        boolean salir2 = true;

        //Pedimos al usuario el input
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame una frase");

        //input del usuario
        Frase = entrada.nextLine();
        j = Frase.length() - 1;

        /*Podriamos hacer la comprobacion de los caracteres letra por letra
        en busca de acentos con un metodo similar a: 
        if((string[i] == 'a'  string[i]=="á")   (string[j] == 'a' || string[j]=="á"))
        o bien
        Frase.replace(Frase2, Frase2)*/
        //pero vamos a usar un normalizer 
        Frase = Normalizer.normalize(Frase, Normalizer.Form.NFD);
        Frase = Frase.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        //replaceAll("\s", ""); Con esto podriamos sustituir los espacios facilmente
        //Recorremos todos los valores de nuestro string y comparamos caracteres
        do {

            if (Frase.charAt(i) == Frase.charAt(j)) {
                Frase2 = Frase2 + Frase.charAt(i);
                i++;
                j--;
                if (i > j && j < i) {
                    System.out.println("Se puede leer en ambas direcciones! \n" + Frase2);
                    salir1 = true;
                }
            } else if (Frase.charAt(i) == ' ') {
                i++;
            } else if (Frase.charAt(j) == ' ') {
                j--;
            } else {
                System.out.println("No es legible en ambas direcciones\n");
                salir1 = true;
            }

        } while (!salir1);

    }
}
