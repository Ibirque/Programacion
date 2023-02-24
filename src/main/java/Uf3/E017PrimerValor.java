
package Uf3;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class E017PrimerValor {

    public static final int MARCA = -1;
    public static void main(String[] args) {
        E017PrimerValor prog = new E017PrimerValor();
        prog.inicio();
    }

    public void inicio() {
        try{
            File f = new File("C:/temp/Enteros.txt");                     
            Scanner lectura = new Scanner(f);     
            //lectura del primer dato
            int media = lectura.nextInt();
            System.out.println("Lectura de "+ media + " datos");
            for(int i=0; i <media; i++){
                int valor = lectura.nextInt();
                System.out.println("Valor "+(i+1)+": "+valor);
            }
            lectura.close();
        }catch(Exception e){System.out.println("Error: "+e);}
    }
    
}
