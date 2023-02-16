package Uf3;

import java.io.File;
import java.util.Scanner;

public class E008borrarCarpeta {

    public static void main(String[] args) {
        E008borrarCarpeta prog = new E008borrarCarpeta();
        prog.inicio();
    }

    //Queremos:
    /*Crea un programa que lea desde el teclado el texto asociado a la 
        ruta de una carpeta existente en el ordenador. 
        Borrar todos los elementos que tenga
        Para borrar una carpeta, antes hay que vaciarla
        Solución recursiva?*/
    public void inicio() {
        //Ruta es --> C:/temp
        String ruta = Devolver();
        
        listar(ruta);
    }

    public void listar(String A) {
        File contenido = new File(A);
        File[] verCont = contenido.listFiles(); 
        
        //Usamos un bucle para recorrer todos los elementos de nuestra carpeta
        System.out.println("El contenido de "+contenido.getAbsolutePath() + " es: ");
        for(int i =0; i<verCont.length; i++){
            File f = verCont[i];
            if(f.isDirectory()){System.out.println("[DIR]");}
            else{System.out.println("[FILE]");}
            System.out.println(f.getName());
        }
        
        System.out.println("¿Estas seguro de que quieres destruir todo el contenido de esta carpeta? [Y/N]");
        Scanner ent = new Scanner(System.in);
        String respuesta = ent.nextLine();
        respuesta = respuesta.toLowerCase();
        
        
        boolean glag = false;
        do{
        if(respuesta.charAt(0) == 'y'){
            Destruir(A);
            glag = true;
        }else{
            System.out.println("Cerrando el programa");
            glag = true;
        }
        }while(!glag);
    }

    public void Destruir(String A) {
        File contenido = new File(A);
        File[] verCont = contenido.listFiles();

        //Usamos un bucle para recorrer todos los elementos de nuestra carpeta
        for (int i = 0; i < verCont.length; i++) {
            //Almacenamos las files en "f"
            File f = verCont[i];
            if (f.isDirectory()) {
                System.out.println("[DIRECTORIO ELIMINADO]");
            } else {
                System.out.println("[ARCHIVO ELIMINADO]");
            }

            File destino = new File(f.getAbsolutePath());
            boolean borrar = destino.delete();
        }

        boolean borrarTod = contenido.delete();
        System.out.println("Destrucción completa");
    }

    public String Devolver() {
        String hold;
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce la ruta: ");
        hold = ent.nextLine();
        
        
        return hold;
        
        //comprobar si es file o directory
        
        
    }

}
