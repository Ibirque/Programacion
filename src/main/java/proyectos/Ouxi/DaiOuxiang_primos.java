package proyectos.Ouxi;

import java.util.Scanner;

public class DaiOuxiang_primos {

    public boolean salida = false;

    public static void main(String[] args) {
        DaiOuxiang_primos tortilla = new DaiOuxiang_primos();
        tortilla.inicio();
    }

    //Inicio para invocar todos los metodos constantemente hasta que el programa
    //llegue a la clase "finalizar" y cambie el valor del booleano a true.
    public void inicio() {
        do {
            IntroducirN();
        } while (!salida);
    }

    //Clase para validar el numero introducido e introducir el numero.
    public void IntroducirN() {
        Scanner entrada = new Scanner(System.in);
        boolean salida = false;

        System.out.println("Introduce un numero:\n(Introduce un numero menor a 2 para salir del programa)");
        while (!entrada.hasNextInt()) {
            System.out.println("No introdujo un numero\nIntroduce de nuevo");
            entrada.next();
        }
        int numero = entrada.nextInt();
        //Condicion para finalizar el programa o invocar todas las clases
        if (numero < 2) {
            finalizar();
        } else {
            ValidacionP(numero);
        }

    }

    //Clase para validar si el numero introducido es primo o no, y si no es primo invoca la última clase.
    public void ValidacionP(int numero) {
        boolean salidas = true;
        //0, 1 y 4 no son primos, pero si los metemos en la operación que usaremos (bucle for) para calcular
        //si es primo o no, nos saldrá que sí es primo, asi que hay que especificar con el siguiente if que los 
        //Siguientes numeros no son primos.
        if (numero == 0 || numero == 1 || numero == 4) {
            salidas = false;
        }
        //Bucle for para ir comprobando si el numero es divisible entre de 2 a (numero-1), si se puede con algún numero
        //entontes no es primo, porque un numero primo solo se tiene que poder dividirse entre sí mismo y con el 1
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                salidas = false;
            }
        }

        if (salidas) {
            System.out.println("--------");
            System.out.println("Es primo");
            System.out.println("--------");
        } else {
            System.out.println("-----------------------------");
            System.out.println("No es primo");
            MostrarFactorial(numero);
        }
    }

    //La última clase muestra los factores primos.
    public void MostrarFactorial(int numero) {
        int cantidad = 0;
        System.out.print("El factorial de " + numero + " es: ");
        //Es el mismo for de antes, pero esta vez muestra los numeros con los que se puede dividir
        for (int x = 2; x < numero; x++) {
            if (numero % x == 0) {
                System.out.print("[" + x + "]" + " ");
                cantidad++;

                //Una condicion para que solo me imprima las dos primeras letras con las que se puedan
                //dividir, que serian los factores primos.
                if (cantidad == 2) {
                    break;
                }
            }
        }
        System.out.println("\n-----------------------------");
    }

    //Clase para finalizar el programa, cambia el valor del booleano público
    public void finalizar() {
        salida = true;
        System.out.println("Programa finalizada");
    }

    //La mejora que apliqué para esta práctica es la de poder introducir todos los números que el 
    //usuario quiera para que se hagan las comprobaciones de primo/factorial primo, 
    //hasta que introduzca un numero menor a 2 (niguno de esos numeros puedens ser primos).
}
