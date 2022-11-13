/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.practicas;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class SernaHuertasJavierDNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        boolean flag = true;

        do {
            System.out.println("Introduce tu DNI completo incluido la letra.");
            String DNI = entrada.next();
            //Validamos el tamaño de la String
            if ((DNI.length() > 9) || (DNI.length() == 1)) {
                System.out.println("El DNI es incorrecto");
                //Limpiamos el bufer
                entrada.nextLine();
                //Volvemos a ejecutar el do while
                continue;
            }
            //Extraemos la letra del string y la combertimos en mayusculas 
            char LetraDNI = DNI.toUpperCase().charAt(DNI.length() - 1);
            //Extraemos el substring de numeros
            String SNumDNI = DNI.substring(0, DNI.length() - 1);
            boolean flag2 = false;
            //Recorremos la substring para validar si son numeros
            for (int i = 0; i < SNumDNI.length(); i++) {
                char c = SNumDNI.charAt(i);
                //if (c <= '0' && c >= '9')// alternativa 
                if (!Character.isDigit(c)) {
                    System.out.println("El DNI es incorrecto");
                    entrada.nextLine();
                    flag2 = true;
                    //Salir del for
                    break;
                }
            }
            
            //Si se cumple la condición de flag2 reinicia el Do while.
            if (flag2) {
                continue;
            }
            //Combertimos la substring a numero
            int NumDNI = Integer.parseInt(SNumDNI);
            //Validamos la letra del DNI
            if (LetraDNI != letras[NumDNI % 23]) {
                System.out.println("El DNI es incorrecto");
                entrada.nextLine();
                continue;
            }
            //Al excluir todos los posibles errores damos por correcto el DNI.
            System.out.println("El DNI es correcto");
            System.out.println("DNI: " + NumDNI + LetraDNI);
            flag = false;

        } while (flag);
    }
}
