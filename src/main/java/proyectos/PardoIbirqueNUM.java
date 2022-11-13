package proyectos;

import java.util.Scanner;

public class PardoIbirqueNUM {

    public static void main(String[] args) {
        /*Objetivo*/
        /*Crear un programa que pida un entero y compruebe si el numero
        se puede leer de derecha a izquierda que de izq. a der.*/
        /*EJ: 121, 3003, 33*/
        
        //Declaracion de variables
        int inputNum;
        String NumSt = null;
        int i = 0;
        int j = 0;

        //Banderas
        boolean salir1 = false;
        boolean salir2 = true;

        //Pedimos al usuario el input
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero mayor a 10");

        //Comprobamos que el input del usuario este entre los requisitos
        do {
            if (entrada.hasNextInt()) {
                inputNum = entrada.nextInt();
                if (inputNum >= 10) {
                    //Añadimos los valores del input dentro de nuestro string
                    //NumSt = inputNum + "";
                    NumSt = Integer.toString(inputNum);
                    //definimos j con el tamaño del string, pero ponemos -1 para empezar en la ultima letra, sino el programa hace out of bounds
                    j = NumSt.length() - 1;
                    //desactivamos este bucle y activamos el siguiente
                    salir1 = true;
                    salir2 = false;
                } else {
                    System.out.println("Introduce un numero mayor a 10");
                }
            } else {
                System.out.println("Por favor, intruduce un numero, no otro caracter");
                entrada.nextLine();
            }

        } while (!salir1);

        //Recorremos todos los valores de nuestro string y comparamos caracteres
        do {
            if (NumSt.charAt(i) == NumSt.charAt(j)) {

                i++;
                j--;
                if (i > j && j < i) {
                    System.out.println("El numero " + NumSt + " es legible en ambas direcciones!");
                    salir2 = true;
                }
            } else {
                System.out.println("El numero " + NumSt + " no es legible en ambas direcciones");
                salir2 = true;
            }

        } while (!salir2);

        /*Como mejora a la practica me propuesto hacer esto con un string en lugar de ir dividiendo el numero y almacenandolo
        adicionalmente y aunque creo que no forma parte de la UF1, estoy intentado hacer que mi codigo se convierta en escalable,
        sease que en el futuro si queremos que el programa tenga mas funciones lo podamos modificar facilmente*/
        
    }}
