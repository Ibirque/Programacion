package proyectos.ejemplos;

import java.util.Scanner;
import javax.xml.transform.sax.SAXSource;

public class E020menu {

    //generar un menú de selección
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecciona una opción: \n1: Opción 1\n2: Opción 2\n3: Opción 3\n4: Opción 4");
        int seleccion;
        if (entrada.hasNextInt()) {
            seleccion = entrada.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("Seleccionaste 1");
                    break;
                case 2:
                    System.out.println("Seleccionaste 2");
                    break;
                case 3:
                    System.out.println("Seleccionaste 3");
                    break;
                case 4:
                    System.out.println("Seleccionaste 4");
                    break;
                default:
                    System.out.println("Tu opción no existe");
            }
        } else {
            System.out.println("Debes elegir una de las opciones");
        }
    }

}
