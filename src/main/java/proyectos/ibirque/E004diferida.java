package proyectos.ibirque;

import java.util.Scanner;

public class E004diferida {

    //variable global > array no inicializado
    private int[] lista = null;

    //Scanner global
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        E004diferida programa = new E004diferida();
        programa.inicio();
    }

    public void inicio() {
        leerLista();
        ordenarLista();
        imprimirLista();
    }

    //la lectura de datos se descompone en dos mÃ©todos
    public void leerLista() {
        System.out.println("Escribe una lista de enteros");
        System.out.println("El primer valor indica el tamaÃ±o de la secuencia");
        //invocaciÃ³n de nuevos mÃ©todos
        //...
        leerTam();
        leerValores();
    }

    //mÃ©todo que lee el primer valor
    public void leerTam() {
        int tam = 0;
        if (entrada.hasNextInt()) {
            tam = entrada.nextInt();
        } else {
            entrada.next();
        }

        //INICIALIZACIÃ“N DIFERIDA del array
        lista = new int[tam];
    }

    public void leerValores() {
        int indice = 0;
        while (indice < lista.length) {
            if (entrada.hasNextInt()) {
                lista[indice] = entrada.nextInt();
                indice++;
            } else {
                entrada.next();
            }
        }
        entrada.nextLine();
    }
    
    public void ordenarLista() {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                //si es mayor => intercambiar
                if (lista[i] > lista[j]) {
                    int cambio = lista[i];
                    lista[i] = lista[j];
                    lista[j] = cambio;
                }
            }
        }
    }

    public void imprimirLista() {
        System.out.print("El array ordenado es: [");
        for(int i = 0; i < lista.length; i++){
            System.out.print(lista[i] + " ");
        }
        System.out.println("]");
    }

}