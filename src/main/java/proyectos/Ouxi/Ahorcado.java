package proyectos.Ouxi;

import java.util.Scanner;

public class Ahorcado {

    //Valores publicos que me sirven para mas de una clase, para el juego
    //el programador puede alterar la palabra secreta desde el valor secreto
    public String secreto = "javier";
    public int vida = 5;//Variable para determinar los intentos restantes del jugador

    public static void main(String[] args) {
        Ahorcado programa = new Ahorcado();
        programa.inicio();
    }

    public void inicio() {
        IntroducirP();
    }

    //Clase para introducir la palabra, validar que la palabra esté compuessto por letras y que tenga la misma cantidad
    //de letras que la palabra secreta
    public void IntroducirP() {
        Scanner entrada = new Scanner(System.in);
        boolean salida = false;
        System.out.println("Adivina la palabra");
        System.out.println("(La palabra tiene " + secreto.length() + " letras)");
        do {
            while (entrada.hasNextInt()) {
                System.out.println("Introduce una palabra porfavor");
                entrada.next();
            }
            String palabra = entrada.nextLine();
            if (palabra.length() != secreto.length()) {
                System.out.println("Introduce la misma cantidad de letras");
            } else {
                Pista(palabra);
                salida = true;
            }
        } while (!salida);
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

    //Clase que imprime la pista de la palabra secreta, si hay alguna letra introducida que
    //coincide con la palabra secreta, se imprimera la dicha letra, de lo contrario, se imprime "_"
    //Finaliza el programa si todos los elementos de la palabra introducida coinciden con las de la palabra secreta.
    public void Pista(String palabra) {
        boolean salida = false;
        System.out.println("Pista:");
        for (int i = 0; i < secreto.length(); i++) {
            if (palabra.toLowerCase().charAt(i) == secreto.charAt(i)) {
                System.out.print(palabra.toLowerCase().charAt(i) + " ");
                salida = true;
            } else {
                System.out.print("_ ");
                salida = false;
            }
        }
        System.out.println("\n");
        if (salida) {
            System.out.println("Acertaste!");
        } else {
            CantidadV();
        }
    }
}
