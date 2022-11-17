package proyectos.practicas;

import java.util.Scanner;

public class IbirquePardoDNI {

    public static void main(String[] args) {
        //Declaracion de variables
        int numeroDNI = 0;
        int resto;
        String DNIentero;
        String numDNI;
        char letra;
        char letraMayus;

        //Declarar el array que contiene nuestras letras
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        //flags
        boolean numFlag = false;
        boolean letraFlag = false;

        do {
            //Almacenamiento de variables y atrapar al usuario hasta que nos de el numero
            Scanner entrada = new Scanner(System.in);

            while (!numFlag) {
                System.out.println("Introduce el numero solo");
                if (entrada.hasNextInt()) {
                    numeroDNI = entrada.nextInt();
                    if ((numeroDNI <= 99999999) && (numeroDNI > 0)) {
                        //numero correcto, tenemos nuestro primer checker
                        numFlag = true;
                    } else {
                        System.out.println("Numero invalido, introduce valores entre 0 y 99.999.999");
                    }
                } else {
                    System.out.println("Por favor, introduce solo el numero ahora");
                }
                entrada.nextLine();
            }
            
            //Este while se encarga de pedir la letra y solo se activa si ha terminado con el numero
            while (numFlag) {

                System.out.println("Introduce la letra");
                letra = entrada.next().charAt(0);
                entrada.nextLine();

                //Convertimos a mayusculas la letra
                if (Character.toString(letra).matches("[a-z?]")) {
                    letraMayus = Character.toUpperCase(letra);

                    //Calculo del resto
                    resto = numeroDNI % 23;

                    //comparacion del resto y la letra
                    if (letraMayus == letras[resto]) {
                        System.out.println("Los valores son correctos, el numero coincide con la letra");
                        break;
                    } else {
                        System.out.println("Incorrecto, las letras no coinciden");
                    }

                } else {
                    System.out.println("Introduce una letra no otro valor");

                }
            }
        } while (!numFlag && (!letraFlag));
    }
}
