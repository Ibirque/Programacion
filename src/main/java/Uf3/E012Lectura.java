
package Uf3;

import java.io.File;
import java.util.Scanner;


public class E012Lectura {

  
    public static void main(String[] args) {
        E012Lectura programa = new E012Lectura();
        programa.inicio();
    }

    public void inicio() {
        
        try{
            
            File f = new File("C:/Temp/ARGH.txt");
            Scanner lectura = new Scanner(f);
            //for(int i = 0; i < 10; i++){
            for(int i = 0; i < f.length(); i++){    
                int valor = lectura.nextInt();                
                System.out.println("El valor leido es: "+valor);
            }
            
            lectura.close();
        }catch(Exception e){
            System.out.println("Algo ha fallado: "+e);
        }
        
    }
    
}
