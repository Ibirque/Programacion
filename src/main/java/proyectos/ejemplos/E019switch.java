package proyectos.ejemplos;

import java.util.Scanner;

public class E019switch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.println("Introduce el número correspondiente al día de la semana:");
        //validar si en el buffer hay un entero, si  no lo hay ni siquiera lo guardo en dia
        if (entrada.hasNextInt()) {
            //si evalúa true, seguimos con el programa
            //inicializando la variable dia
            dia = entrada.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                   System.out.println("Tiene que ser un número del 1 al 7");
            }
        } else {
            System.out.println("Debes introducir un número entero");
        }

    }

}
