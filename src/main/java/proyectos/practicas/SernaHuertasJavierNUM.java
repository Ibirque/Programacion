/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.practicas;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class SernaHuertasJavierNUM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, num2 = 0, mun = 0, resto;
        boolean flag = false;
        do {
            System.out.println("Introduce un numero: ");
            /*Validamos si es un numero*/
            if (!entrada.hasNextInt()) {
                System.out.println("Eso no es un numero.");
                entrada.nextLine();
                continue;
            }
            num = entrada.nextInt();
            /*Validamos si es un numero mayor de 10*/
            if(num<=10){
                System.out.println("El numero tiene que ser mayor a 10");
                entrada.nextLine();
                continue;
            }

            num2 = num;
            /*Invertimos el numero*/
            while (num > 0) {
                resto = num % 10;
                mun = mun * 10 + resto;
                num /= 10;
            }

            if (num2 == mun) {
                System.out.println("El numero es capicua");
                flag = true;
            } else {
                System.out.println("El numero no es capicua");
            }
            
        } while (!flag);
    }

}
