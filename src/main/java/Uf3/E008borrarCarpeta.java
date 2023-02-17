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
        /*MI METODO*/
        //Ruta es --> C:/temp
        String ruta = Devolver();
        listar(ruta);

        /*METODO CORREGIDO POR MARIA*/
        File Nuevo = leerRutaCarpeta();
        borrar(Nuevo);

    }

    public void listar(String A) {
        File contenido = new File(A);
        File[] verCont = contenido.listFiles();

        //Usamos un bucle para recorrer todos los elementos de nuestra carpeta
        System.out.println("El contenido de " + contenido.getAbsolutePath() + " es: ");
        for (int i = 0; i < verCont.length; i++) {
            File f = verCont[i];
            if (f.isDirectory()) {
                System.out.println("[DIR]");
            } else {
                System.out.println("[FILE]");
            }
            System.out.println(f.getName());
        }

        System.out.println("¿Estas seguro de que quieres destruir todo el contenido de esta carpeta? [Y/N]");
        Scanner ent = new Scanner(System.in);
        String respuesta = ent.nextLine();
        respuesta = respuesta.toLowerCase();

        boolean glag = false;
        do {
            if (respuesta.charAt(0) == 'y') {
                Destruir(A);
                glag = true;
            } else {
                System.out.println("Cerrando el programa");
                glag = true;
            }
        } while (!glag);
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

    
    /*METODO CORREGIDO POR MARIA */
     //preguntar al usuario el nombre de la carpeta
    //param de entrada => nope
    //param de salida => la ruta asociada al File
    public File leerRutaCarpeta() {
        File f = null;
        //inicializar a null un tipo File (tipo compuesto)
        boolean preguntar = true;
        Scanner entrada = new Scanner(System.in);
        while (preguntar) {
            System.out.println("Escribe la ruta a la carpeta");
            String nombreCarpeta = entrada.nextLine();
            f = new File(nombreCarpeta);
            if (f.isDirectory()) {
                preguntar = false;
            } else {
                System.out.println("Esa carpeta no existe");
            }
        }
        return f;
    }

    //borrar el contenido
    //param entrada => lo que devuelve la funciÃ³n anterior, la ruta
    //param salida => nope
    public void borrar(File ruta) {
        File[] elementos = ruta.listFiles();
        //recorrer el array
        for(int i = 0; i < elementos.length; i++){
            if(elementos[i].isFile()){
                //si valida true, lo borramos
                elementos[i].delete();
            }
            else if(elementos[i].isDirectory()){
                //si valida true, hay que vaciarla primero
                //llamar a esta misma funciÃ³n
                borrar(elementos[i]);
                //cuando estÃ¡ vacÃ­a, se puede borrar
                elementos[i].delete();
            }
        }
    }

}
