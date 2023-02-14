package proyectos.Nacef;

import java.io.File;
import java.util.Scanner;

public class EjercicioCambiar {

    public static void main(String[] args) {
        EjercicioCambiar programa = new EjercicioCambiar();
        programa.inicio();
    }
    
    public void inicio(){
        String path = Int();
        //File document = new File("C:/temporal/temp.txt");
        File document = new File(path);
        File newDocument = new File("C:/temporal/hola");
        boolean resultado = document.renameTo(newDocument);
        System.out.println("Se ha movido y renombrado la carpeta: " + resultado);
    }
    
    public String Int(){
        String pathInt;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la ruta : ");
        pathInt = entrada.nextLine();
        return pathInt;
    }
    
    
    
}
