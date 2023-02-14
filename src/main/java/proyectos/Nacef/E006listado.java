package proyectos.Nacef;

import java.io.File;


public class E006listado {

   
    public static void main(String[] args) {
        E006listado prog = new E006listado();
        prog.inicio();
    }
    
    public void inicio(){
        File carpeta = new File("C:/temporal");
        File[] elementos = carpeta.listFiles();
        System.out.println("El contenido de " + carpeta.getAbsolutePath() + " es : ");
        for (int i = 0; i < elementos.length; i++){
            File f = elementos[i];
            if (f.isDirectory()){
                System.out.println("[DIR]");
            } else {
                System.out.println("[FIN]");
            }
            System.out.println(f.getName());
        }
    }
    
}
