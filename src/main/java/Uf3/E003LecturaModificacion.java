
package Uf3;

import java.io.File;
import java.util.Date;

public class E003LecturaModificacion {

    public static void main(String[] args) {
        E003LecturaModificacion prog = new E003LecturaModificacion();
        prog.inicio();
    }

    public void inicio() {
        File documento = new File("C:/temp/texto.txt");
        //System.out.println(documento.getAbsolutePath());
        System.out.println(documento.getAbsoluteFile());
        System.out.println("\n A:"+documento.getAbsolutePath());
        //objeto date para transformar los ms en fecha
        Date fecha = new Date(documento.lastModified());
        System.out.println("\n"+fecha);
        System.out.println("Tamaño: "+documento.length());
    }
    
}
