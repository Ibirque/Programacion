
package Uf3;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class E016Marca {

    public static final int MARCA = -1;
    public static void main(String[] args) {
        E016Marca prog = new E016Marca();
        prog.incio();
    }

    public void incio() {
        PrintStream x = null;
        try{
            File f = new File("C:/temp/Enteros.txt");
            Scanner lectura = new Scanner(f);     
            //bandera
            boolean leer = true;
            while(leer){
                int valor = lectura.nextInt();
                if(valor == MARCA){
                    leer = false;
                }else{
                    System.out.println("El valor leido es: "+valor);
                }
            }
            lectura.close();
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
}
