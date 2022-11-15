/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.javier;

import java.util.Scanner;

/**
 *
 * @author Ibir
 */
public class suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean flag = false;
        System.out.println("Introduce 2 numeros ");
        do {
            while (!entrada.hasNextInt()) {
                System.out.println("Introduce un numero: ");
                entrada.nextLine();

            }
            num1 = entrada.nextInt();
            while (!entrada.hasNextInt()) {
                System.out.println("Introduce un numero: ");
                entrada.nextLine();
            }
            num2 = entrada.nextInt();
            break;
        } while (!flag);
        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " + (num1 - num2));
        System.out.println("La multiplicación es: " + (num1 * num2));
        System.out.println("La división es: " + (num1 / num2));
        System.out.println("El resto es: " + (num1 % num2));
    }
}
