package proyectos.Nacef;

import java.io.File;
import java.util.Scanner;


public class E012lectura {

   
    public static void main(String[] args) {
        E012lectura programa = new E012lectura();
        programa.inicio();
    }
    
    public void inicio(){
        try{
            //intentar abrir un fichero
            File f = new File("C:/Temp/Enteros.txt");
            Scanner lectura = new Scanner(f);
            for(int i = 0; i < 10; i++){
                int valor = lectura.nextInt();
                System.out.println("El valor leido es: " + valor);
            }
            //cerrar el fichero
            lectura.close();
        }catch(Exception e){
            System.out.println("Algo ha fallado: " + e);
        }
    }
    
}
