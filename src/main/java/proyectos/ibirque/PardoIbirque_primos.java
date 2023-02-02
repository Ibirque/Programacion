package proyectos.ibirque;

import java.util.Scanner;

public class PardoIbirque_primos {

    /*QUE QUEREMOS HACER?*/
 /*Queremos un programa que sea capaz de encontrar numeros primos
    -Los numeros primos solo se pueden dividir entre 1 y ellos mismos
    -Queremos una clase principal que lea por teclado un numero
        
    -Descomponemos el numero y mostramos por pantalla los primos que lo forman
    -Si el numero es primo, debemos mostrarlo por pantalla
     */
    public static void main(String[] args) {
        PardoIbirque_primos progr = new PardoIbirque_primos();
        progr.inicio();
    }

    public void inicio() {
        int x;
        x = captura();
        comprobar(x);
    }

    public int captura() {

        int x = 0;
        //Boolean para atrapar al usuario
        boolean bandera = false;
        //Recogemos el input del usuario  
        Scanner en = new Scanner(System.in);
        System.out.println("Introduce un numero positivo, mayor a 2");

        do {
            if (en.hasNextInt()) {
                x = en.nextInt();
                if (x > 2) {
                    bandera = true;
                } else {
                    System.out.println("Mayor a 2 y positivo");
                }
            } else {
                System.out.println("Introduce un numero positivo mayor a 2, no otra cosa");
                en.nextLine();
            }
        } while (!bandera);

//Devolvemos el numero
        return x;
    }

    public boolean comprobar(int x) {
        //Nuestro iterador, lo inicializamos a 2 porque se
        //sobreentiende que todos los numeros son divisibles por "1"
        //Usaremos este iterador para dividir los numeros
        int i = 2;
        boolean bandera = false;
        
        //Iniciamos a true el boolean, y en caso de detectar lo contrario
        //mas adelante, nos cargamos la bandera
        boolean primo = true;
        
        //Creamos un bucle que no va a parar hasta que "i" tenga el mismo
        //tamaño que "x"
        do {
            //En caso de que el bucle pueda dividir y obtener un modulo "0"
            if (x % i == 0) {
                
                //Este if muestra por pantalla una sola vez el mensaje
                if(!bandera){
                    System.out.println("Los factores primos son: ");
                    bandera = true;
                    primo = false;
                }
                System.out.print(i+" ");
                
            }
            i++;
            //System.out.println("Prueba numero " + (i - 1) + " - " + (x % i));
            //Probamos 19x7 = 133 para ver las iteraciones
        } while (i != x);

        if(primo){
            System.out.println(x+" Es primo!");
        }
        return false;
    }

}
