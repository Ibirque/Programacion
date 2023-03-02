package proyectos.Nacef;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;


public class E019 {

    
    public static void main(String[] args) {
        E019 programa = new E019();
        programa.inicio();
    }
    
    public void inicio(){
        //inicio necesita un método para leer datos
        //inicio necesita otro para escribir datos
        
        //lectura de valores
        int[] valores = leerDatos("Enteros.txt");
        if(valores != null){
            //obtenemos los datos correctamente
            //ordenamos los datos
            Arrays.sort(valores);
            //escribir los valores en un nuevo fichero
            escribirArray("nuevo.txt", valores);
        }else {
            System.out.println("Error leyendo datos");
        }
    }
    
    //método para leer valores y cargarlos en un array
    //param entrada --> nombre del fichero
    //param salida --> array de enteros
    public int[] leerDatos(String nombre){
        try{
            File f = new File(nombre);
            Scanner lectura = new Scanner(f);
            int medida = lectura.nextInt();
            int[]datos = new int [medida];
            for(int i = 0; i < medida; i++){
                datos[i]= lectura.nextInt();
            }
            return datos;
        }catch(Exception e){
            //si no se pueden leer los datos
            return null;
        }
    }
    
    //metodo para escribir un array de enteros en un fichero
    //param de entrada --> ruta del nuevo fichero + array
    //param de salida --> nope
    public void escribirArray(String nombre, int[]datos){
        try{
            File f = new File(nombre);
            PrintStream escribe = new PrintStream(f);
            //primero escribimos el número de valores
            escribe.print(datos.length);
            //esctibimos los valores en un array con separadpr de espacio
            for(int i = 0; i < datos.length; i++){
                escribe.print(" " + datos[i]);
            }
            System.out.println("Fichero creado!");
            //cerrar
            escribe.close();
        }catch(Exception e){
            
        }
    }
    
}
