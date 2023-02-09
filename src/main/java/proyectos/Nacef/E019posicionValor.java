package proyectos.Nacef;

import java.util.Scanner;

//buscar la posicion de un valor concreto en un array
//el usuario intorduce el valor que quiere buscar via teclado
//imprimir numero de repeticiones del valor en el array
public class E019posicionValor {

    public static final int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        E019posicionValor programa = new E019posicionValor();
        programa.inicio();
    }

    public void inicio() {
       int resultado = intro();
        System.out.println(resultado);
        int posicion = buscada(num, resultado);
        if(posicion == -1){
            System.out.println("este numero no existe en el array");
        } else {
            System.out.println("el numero " + resultado + " aparece en al array en la posicion " + posicion);
        }
        
    }

    public int intro() {
        Scanner entrada = new Scanner(System.in);
        int numIntro = 0;
        boolean salir = false;
        while (!salir) {
            System.out.println("Introduce un numero entero");
            if (entrada.hasNextInt()) {
                numIntro = entrada.nextInt();
                salir = true;
            } else {
                System.out.println("Eso no es un numero valido");
                entrada.nextLine();
            }
        }
        return numIntro;
    }
    
    public int buscada(int[]tabla, int result){
        int posicion = 0;
        boolean salir = false;
        while(posicion < tabla.length && !salir){
            if(tabla[posicion] == result) {
                salir = true;
            } 
            posicion++;
        }
        
        if(!salir) {
            posicion = -1;
        }
        return posicion;
    }

}
