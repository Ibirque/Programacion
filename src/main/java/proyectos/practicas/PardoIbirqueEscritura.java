package proyectos.practicas;

import java.io.File;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class PardoIbirqueEscritura {

    /*Escribir un fichero con 20 valores enteros. 

    El primer valor será 1 y los demás sumarán 3 al anterior.
    Cada línea tendrá 4 valores, por lo tanto habrá 5 líneas.
    A continuación lee el contenido del archivo 
    Código comentado explicando lo más exhaustivamente posible 
    lo que se está haciendo
    Nombre del fichero: ApellidoNombreEscritura.java */
    public static void main(String[] args) {
        PardoIbirqueEscritura prog = new PardoIbirqueEscritura();
        prog.inicio();
    }

    public void inicio() {
        //Crear un fichero
        //definimos la ruta de nustro file
        File f = new File("numeros.txt");
        //llamamos a nuestra clase
        Escritura(f);
        Lectura(f);

    }

    public void Escritura(File f) {
        try {
            //llamamos a RAF
            PrintStream x = new PrintStream(f);
            //valor a incrementar
            int valor = 1;
            int alturas = 0;
            //Escribimos nuestros numeros dentro del .txt
            for (int i = 0; i < 20; i++) {
                valor = valor + 3;
                x.print(valor + " ");
                
                //Esto gestiona la altura, o mas bien cantidad de elementos por linea
                alturas++;                
                if (alturas == 4) {
                    alturas = 0;
                    x.print("\n");
                }
            }
            x.close();

        } catch (Exception e) {
            System.out.println("Error en: " + e);
        }
    }

    //A continuación lee el contenido del archivo
    public void Lectura(File f) {
        try {
            //Llamamos a scanner para leer nuestro archivo
            Scanner leer = new Scanner(f);

            //Mientras que no llegemos al final del dcumento, es decir 
            //no dejemos de encontrarnos ints seguiomos
            while (leer.hasNextInt()) {
                //printamos el contenido de nuestro .txt
                System.out.println(leer.nextInt());
            }
            leer.close();            

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
