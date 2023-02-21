
package Uf3;

import java.io.File;
import java.util.Scanner;

public class E010try {

    
    public static void main(String[] args) {
        E010try prog = new E010try();
        prog.inicio();
    }

    public void inicio() {
        try {
            //intentamos abrir un fichero para leerlo
            File f = new File("C:/Temp/doc.txt");
            Scanner lectura = new Scanner(f);
            //si el fichero existe, ok
            System.out.println("Fichero abierto correctamente");
        }catch(Exception e){
            //tratamiento de errores
            System.out.println("AAAA DOLOR AAAA "+ e);
        }
        
        System.out.println("La vida sigue...");
    }
    
}
