package proyectos.Nacef;

import java.io.File;
import java.util.Scanner;


public class E017primerValor {

    
    public static void main(String[] args) {
        E017primerValor programa = new E017primerValor();
        programa.inicio();
    }
    
    public void inicio(){
        try{
            File f = new File("Enteros.txt");
            Scanner lectura = new Scanner(f);
            //lectura del primer dato
            int medida = lectura.nextInt(); 
            System.out.println("Lectura de " + medida + " datos");
            for(int i=0; i < medida; i++){
                int valor = lectura.nextInt();
                System.out.println("Valor " + (i+1) + ": " + valor);
            }
            lectura.close();
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
    
}
