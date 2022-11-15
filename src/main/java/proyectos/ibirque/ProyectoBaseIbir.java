package proyectos.ibirque;

import java.util.Scanner;

public class ProyectoBaseIbir {

    public static void main(String[] args) {

        //variabls
        final int tam = 3;
        int matriz[][] = new int[tam][tam];
        int TAM = tam * tam;
        int buffer[] = new int[TAM];
        int i = 0;
        int j = 0;
        int k = 0;

        //banderas
        boolean salir = false;

        //inputs        
        System.out.println("Por favor introduce los numeros para rellenar la matriz");
        Scanner entrada = new Scanner(System.in);

        do {
            if (entrada.hasNextInt()) {
                buffer[k] = entrada.nextInt();
                System.out.println("Introduce el valor " + (j + 1) + " de la fila " + (i + 1));
                j++;
                k++;
                if((k) == (TAM)){
                    salir = true;
                }else if(j==3){
                    i++;
                    j = 0;
                }
            } else {
                System.out.println("Introduce solo numeros enteros");
                entrada.nextLine();
            }

        } while (!salir);

        k = 0;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = buffer[k];
                k++;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        

    }
}
