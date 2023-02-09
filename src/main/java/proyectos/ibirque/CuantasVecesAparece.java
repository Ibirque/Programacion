
package proyectos.ibirque;

import java.util.Scanner;


public class CuantasVecesAparece {

    public static void main(String[] args) {
        CuantasVecesAparece programa = new CuantasVecesAparece();
        programa.inicio();
    }

public void inicio(){
    
        int[] valores ={3,20,3,40,3,60,3,80,3};
        int aux = inputUsuario();
        
        
        int resultado = buscarValor(valores, aux);
        System.out.println("Lo he encontrado "+resultado+" veces");
    }
    
    //param. de entrada -> el array de enteros + un entero que quiero buscar
    //param. salida -> queremos sacar el indice/posicion del array, es decir un entero
    
    public int buscarValor(int[]array, int valor){
        //array contiene los valores que voy a tratar
        int posicion = 0;
        int encontrado = 0;
        //boolean encontrado = false;
        
        while((posicion < array.length)){
            if (array[posicion] == valor){                
                //encontrado = true;
                encontrado++;
            }
            posicion++;             
    }        
        //cuantas veces lo he encontrado
        return encontrado;
    }
    
    public int inputUsuario(){
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un entero para buscarlo en el array!");
        int elInput = 0;
        
        if (entrada.hasNextInt()){
            elInput = entrada.nextInt();
        }else{
            System.out.println("Introduce un entero por favor, no otra cosa");
            entrada.nextLine();
        }
    
        return elInput;
    }
    
}
