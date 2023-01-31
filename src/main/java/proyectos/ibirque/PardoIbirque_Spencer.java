package proyectos.ibirque;

import java.util.Arrays;
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
    -Queremos una clase que guarde numero a leer
    -Dependiendo de la cantidad de numeros tendremos que elevar el numero
    -Queremos hacer la suma de los numeros
    -Finalmente comparamos el numero original con la suma realizada
     */
    public void inicio() {
        //System.out.println(3%10);
        guardarEnArray("1236");
    }

    /*GUARDAR EN ARRAY TAMAÑO*/
    public int guardarEnArray(String num) {
        //Convertir el string a numero
        int x = Integer.parseInt(num);
        //Crear una array de tamaño definido por nuestrostring
        int[] arr = new int[num.length()];

        //Queremos guardar cada numero en una posicion diferente del array
        for (int i = 0; i < num.length(); i++) {
            /*Ahora hacemos un parseint llamamos al string
            extraemos el caracter en la posicion 'i'*/
            arr[i] = Integer.parseInt(num.valueOf(num.charAt(i)));       
        }
        System.out.println(""+num.length());
        return 1;
    }
    
    

}
