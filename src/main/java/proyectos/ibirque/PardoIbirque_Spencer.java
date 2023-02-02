package proyectos.ibirque;

import java.util.Arrays;
import java.util.Scanner;

public class PardoIbirque_Spencer {

     private int contador = 1;
     
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
    -Queremos una clase que genere el numero a leer
    -Queremos una clase principal que nos diga el tamaño del numero y
        llame a una funcion de comprobacion (checker)
    -Queremos una funcion para comprobar si el numero es Spencer o no
    -Comparamos el numero original con la suma realizada y devolvemos true/false
    -Incrementamos la variable global que controla cuantos numero llevamos
     */
    public void inicio() {
        //System.out.println(3%10);
        //principal("153");
        //principal("123456");
        generador();
        
    }

    /*FUNCION PRINCIPAL*/
    public void principal(String num) {
        //Convertir el string a numero
        int x = Integer.parseInt(num);
        //Crear una array de tamaño definido por nuestrostring
        int[] arr = new int[num.length()];
        //Gracias al string podemos ver la cantidad de cifras que tiene nuestro numero, usando .length()
        
        //llamamos al checker y le mandamos el numero y el tamaño
        checker(x,num.length());
        
        
        /*IRRELEVANTE*/
        //Queremos guardar cada numero en una posicion diferente del array
        /*
        for (int i = 0; i < num.length(); i++) {
            //Ahora hacemos un parseint llamamos al string extraemos el caracter en la posicion 'i'
            arr[i] = Integer.parseInt(num.valueOf(num.charAt(i)));
        }*/
        
    }

    /*COMPROBACIÓN*/
    public boolean checker(int a, int b) {

        //Guardamos el numero original, para evitar perderlo en futuras modificaciones
        int numOriginal = a;

        double suma = 0;

        //sacamos el modulo y lo usamos para elevar otro numero
        //ademas de dividir el original
        do {
            int x = a % 10;
            suma = suma + Math.pow(x, b);
            a = a / 10;

        } while (a > 0);

        if (suma == numOriginal) {
            System.out.println(numOriginal+" Es un numero Spencer");
            contador += 1;
            return true;
        } else {
            
            return false;
        }

    }

    /*GENERADOR DE NUMEROS*/
    public String generador(){
        //Creamos un conversor que nos transforma los numeros a string para mandarselos a la funcion principal
        int x=1;
        do{
        String s = String.valueOf(x);
        principal(s);
        x +=1;
        
        }while(contador<=20);
        
        
        return "";
    }
    
}
