/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class SernaHuertasJavierFRASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String invertida = "";
        String fraseProcesada = "";
        boolean flag = false;
        do {
            System.out.println("Introduce un palindromo: ");
            
            String frase = entrada.nextLine().toLowerCase();
            /*Localizamos los posibles acentos y los sustituimos por letras sin 
            acento*/
            frase = frase.replace('á','a');
            frase = frase.replace('é','e');
            frase = frase.replace('í','i');
            frase = frase.replace('ó','o');
            frase = frase.replace('ú','u');
            frase = frase.replace('ü','u');
            /*Recorremos la string en busca de espacios y los descartamos*/
            for (int i = 0; i < frase.length(); i++) {
                /* si usamos el metodo deAccent() podriamos despreciar todos
                los acentos*/
                //char val = deAccent(frase.charAt(i))
                char val = frase.charAt(i);

                if (val != ' ') {
                    fraseProcesada += frase.charAt(i);
                }

            }
            // Recorremos la fraseProcesada del final al inicio
            for (int j = fraseProcesada.length() - 1; j >= 0; j--) {
                // Y vamos concatenando cada carácter a la nueva cadena
                invertida += fraseProcesada.charAt(j);
            }

            /*Comprobamos si fraseProcesada y invertida son identicas*/
            int orden = fraseProcesada.compareTo(invertida);
            if (orden == 0) {
                System.out.println("La frase es un palindromo");
                flag = true;

            } else {
                System.out.println("La frase no es un palindromo");
            }

        } while (!flag);

    }

}
