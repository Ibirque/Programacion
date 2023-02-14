package proyectos.Nacef;

import java.io.File;
import java.util.Date;

public class E003LecturaModificacion {

    
    public static void main(String[] args) {
        Uf3.E003LecturaModificacion prog = new Uf3.E003LecturaModificacion();
        prog.inicio();
    }
    
    public void inicio() {
        File documento = new File("C:/temporal/temp.txt");
        //System.out.println(documento.getAbsolutePath());
        System.out.println(documento.getAbsoluteFile());
        //objeto date para transformar los ms en fecha
        Date fecha = new Date(documento.lastModified());
        System.out.println("\n"+fecha);
        System.out.println("Tamaño: "+documento.length());
    }
}
