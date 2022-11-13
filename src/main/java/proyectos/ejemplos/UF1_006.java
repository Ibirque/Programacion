package proyectos.ejemplos;

import java.util.Scanner;

public class UF1_006 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int num = entrada.nextInt();

        if (num == 0) {
            System.out.println("Esto es un cero");
        } else {
            System.out.println(num + (num > 0 ? " es positivo" : " es negativo"));
            System.out.println(num + (num % 2 == 0 ? " es par " : " es impar "));
            System.out.println(num + (num % 5 == 0 ? " es múltiplo de 5 " : " no es múltiplo de 5 "));
            System.out.println(num + (num % 10 == 0 ? " es múltiplo de 10 " : " no es múltiplo de 10 "));
            System.out.println(num + (num > 100 ? " es mayor que 100 " : " es menor que 100 "));
        }

    }

}
