package proyectos.ibirque;

import java.util.Scanner;

public class PardoIbirque_Spencer {

    public static void main(String[] args) {
        PardoIbirque_Spencer progr = new PardoIbirque_Spencer();
        progr.inicio();
    }

    /*
    -Fichero .java con el ejercicio resuelto que se llame 
    ApellidoNombre.java
    -Fichero .pdf con el diagrama o esquema del ejercicio desglodsado
    una explicación del planteamiento y que se llame ApellidoNombre.pdf
    -Si hay mejoras se tendran que explicar en el comentario de entrega */
 /*QUE QUEREMOS HACER?*/
 /*Queremos un programa que calcule los 20 primeros numeros Spencer
    -Queremos una clase que determine el tamaño del numero a leer
    -Dependiendo de la cantidad de numeros tendremos que elevar el numero
    -Queremos hacer la suma de los numeros
    -Finalmente comparamos el numero original con la suma realizada
     */
    public void inicio() {
        //System.out.println(3%10);
        tamaNum("1236");
    }

    /*DETERMINAR TAMAÑO*/
    public int tamaNum(String num) {
        //Convertir el string a numero
        int x = Integer.parseInt(num);
        int numBuffer = x % 10;
        for (int i = 0; i < num.length() - 1; i++) {
            //intento dividir entre 10
            numBuffer = numBuffer % 10;
            System.out.println(numBuffer);
        }

        

        System.out.println("El tamaño del numero " + num + " es de " + (num.length()));
        return 1;
    }

}
