
package Uf3;

import java.io.File;


public class E001Files {

  
    public static void main(String[] args) {
        E001Files prog = new E001Files();
        prog.inicio();
    }
    
    public void inicio(){
        //Inicializamos dos rutas absolutas diferentes
        File carpetaAbs = new File("C:/Carpeta");
        File ficheroAbs = new File("C:/Carpeta/documento.txt");
        
        //inicializamos rutas relativas
        File carpetaRel = new File("Carpeta");
        File ficheroRel = new File("Carpeta/texto.txt");
        
        //mostrar los datos de cada uno
        mostrarRutas(carpetaAbs);
        mostrarRutas(ficheroAbs);
        mostrarRutas(carpetaRel);
        mostrarRutas(ficheroRel);
    }
    
    public void mostrarRutas(File f){
        System.out.println("La ruta es "+f.getAbsolutePath());
        System.out.println("Voy a imprimir a tu padre "+ f.getParent());
        System.out.println("De nombre es "+f.getName());
        System.out.println("_____");
    }
    
    
}
