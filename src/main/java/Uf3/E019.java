package Uf3;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class E019 {

    public static void main(String[] args) {
        E019 prog = new E019();
        prog.inicio();
    }

    public void inicio() {
        //inicio necesita un metodo para leer datos
        //inicio necesita otro para escribir datos
        
        //lectura de valores
        int[] valores = LeerDatos("Enteros.txt");
        if(valores != null){
            //obtenemos los datos correctamente
            //ordenamos los datos
            Arrays.sort(valores);
            //escribir los valores en un nuevo fichero
            EscribirArray("nuevo.txt", valores);
        }else{
            System.out.println("Error leyendo datos");
        }
    }

    //metodo para leer valores y cargarlos en un array
    //param entrada -> nombre del ficher
    //param salida -> array de entero
    public int[] LeerDatos(String nombre) {
        try {
            File f = new File(nombre);
            Scanner lectura = new Scanner(f);
            //Queremos saber el tamaño de nuestro array
            int medida = lectura.nextInt();
            int[] datos = new int[medida];
            //recorremos
            for(int i = 0; i< medida; i++){
                datos[i] = lectura.nextInt();
            }
            return datos;

        } catch (Exception e) {
            //Si no se pueden leer los datos
            System.out.println("Error: " + e);
            return null;
        }
        
    }

    //metodo para escribir un array de enteros en un fichero
    //param de entrada -> ruta del nuevo fichero + array
    public void EscribirArray(String nombre, int[] datos) {
        try{
            File f = new File(nombre);
            PrintStream escribe = new PrintStream(f);
            //primero escribimos el numero de valores
            escribe.print(datos.length);
            //escribimos los valores en un array con separador de espacio
            for(int i = 0; i <datos.length; i++){
                escribe.print(" "+datos[i]);
            }
            System.out.println("Fichero creado!");
            //cerrar
            escribe.close();
        }catch(Exception e){System.out.println("Error escribiendo datos: "+e);}
    }

}
