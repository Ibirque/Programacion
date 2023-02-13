package proyectos.Ouxi;

import java.util.Scanner;

public class Ahorcado {

    //Valores publicos que me sirven para mas de una clase, para el juego
    //el programador puede alterar la palabra secreta desde el valor secreto
    public String secreto = "javier";
    public int vida = 8;//Variable para determinar los intentos restantes del jugador
    public int contador = 0;//Variable para contar la cantidad de aciertos
    String[] palabraE = new String[8]; //Array donde guarda las letras acertadas (este tiene una funcion distinta a la de abajo)
    public String[] pista = new String[secreto.length()]; //Array para guardar letras acertadas
    public int contadorE = 0; //Variable que se suma si la letra coincide

    public static void main(String[] args) {
        Ahorcado programa = new Ahorcado();
        programa.inicio();
    }

    //Clase donde relleno el valor de los arrays con algo inutil o algo util para
    //usarlos más tarde
    public void inicio() {
        for (int i = 0; i < palabraE.length; i++) {
            palabraE[i] = ".";
        }
        for (int i = 0; i < pista.length; i++) {
            pista[i] = "_";
        }
        IntroducirP();
    }

    //Clase para introducir la palabra, validar que la palabra esté compuesto por letras y que solo pueda ser una letra
    //de letras que la palabra secreta
    public void IntroducirP() {
        Scanner entrada = new Scanner(System.in);
        boolean salida = false;
        System.out.println("Introduce una letra:");
        System.out.println("(La palabra tiene " + secreto.length() + " letras)");
        do {
            while (entrada.hasNextInt()) {
                System.out.println("Introduce una letra");
                entrada.next();
            }
            String palabra = entrada.nextLine();
            if (palabra.length() != 1) {
                System.out.println("Introduce una sala letra");
            } else {
                ComprobarE(palabra);
                salida = true;
            }
        } while (!salida);
    }

    //Clase que impide que el usuario introduzca una letra que ya introdujo anteriormente y que haya acertado
    public void ComprobarE(String palabra) {
        int i = -1;
        int contador = 0;
        do {
            if (palabra.charAt(0) == palabraE[contador].charAt(0)) {
                System.out.println("Esta letra ya se introdujo");
                IntroducirP();
            }
            i++;
            contador++;
        } while (i != contadorE);
        Pista(palabra);
    }

    //Clase para contar e imprimir la cantidad de intentos restantes del jugador.
    //Termina el programa en caso de que el usuario se quede sin vidas
    public void CantidadV() {
        vida--;
        if (vida == 0) {
            System.out.println("Te quedaste sin vidas, fin del juego");
        } else {
            System.out.println("Te quedan " + vida + " vidas");
            IntroducirP();
        }
    }

    //Clase que determina las letras que coinciden.
    //Finaliza el programa si todos los elementos de la palabra introducida coinciden con las de la palabra secreta.
    public void Pista(String palabra) {
        System.out.println("Pista:");
        for (int i = 0; i < secreto.length(); i++) {
            if (palabra.toLowerCase().charAt(0) == secreto.charAt(i)) {
                contador++;
                palabraE[contadorE] = palabra;
                contadorE++;
                pista[i] = palabra;
            }
        }
        imprimirP();
        System.out.println("\n");
        if (contadorE == secreto.length()) {
            System.out.println("Acertaste!");
        } else {
            CantidadV();
        }
    }

    //Imprime la pista
    public void imprimirP() {
        for (int i = 0; i < pista.length; i++) {
            System.out.print(pista[i].toLowerCase() + " ");
        }
    }
}
