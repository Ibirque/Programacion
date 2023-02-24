
package Uf3;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class E014Escritura {

    public static void main(String[] args) {
       E014Escritura prog = new E014Escritura();
       prog.inicio();
    }

    public void inicio() {
        try{
            //intentar abrir un fichero
            File f = new File("C:/temp/Enteros.txt");
            //Scanner fich = new Scanner(f);
            PrintStream escribe = new PrintStream(f);
            
            //Escribir el primer valor
            int valor = 1;
            escribe.print(valor);
            for(int i = 1; i< 20; i++){
                //Escribir " "
                escribe.print(" ");
                //Calcular el siguiente numero
                valor = valor*2;
                //imprimir
                escribe.print(valor);
            }
            //cerrar el fichero
            escribe.close();
            System.out.println("Fichero correctamente escrito");
        }catch(Exception e){System.out.println("Error: "+e);}
    }

}
