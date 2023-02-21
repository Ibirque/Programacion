
package proyectos.Nacef;

import java.io.File;
import java.util.Scanner;

public class E010try {

 
    public static void main(String[] args) {
        E010try programa = new E010try();
        programa.inicio();
    }
    
    public void inicio(){
        try{
            //intentar abrir un fichero para leerlo
            File f = new File("C:/Temp/doc.txt");
            Scanner lectura = new Scanner(f);
            //si el fichero existe, ok
            System.out.println("Fichero abierto correctamente ");
        }catch(Exception e){
            //tratamiento de errores
            System.out.println("Error: " + e);
        }
        
        System.out.println("La vida sigue...");
    }
    
}
