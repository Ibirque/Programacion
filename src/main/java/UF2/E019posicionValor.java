
package UF2;

public class E019posicionValor {

    public static void main(String[] args) {
        E019posicionValor programa = new E019posicionValor();
        programa.inicio();
    }
    
    public void inicio(){
        int[] valores ={1,2,3,4,5,6,7,8,9};
        int resultado = buscarValor(valores, 45);
        System.out.println(resultado);
    }
    
    //param. de entrada -> el array de enteros + un entero que quiero buscar
    //param. salida -> queremos sacar el indice/posicion del array, es decir un entero
    
    public int buscarValor(int[]array, int valor){
        //array contiene los valores que voy a tratar
        int posicion = 0;
        boolean encontrado = false;
        
        while((posicion < array.length)&&(!encontrado)){
            if (array[posicion] == valor){                
                encontrado = true;
            }
            posicion++;
             
    }
        //lo he encontrado?
        if(!encontrado){
            posicion = -1;
        }
        
        //posicion tiene resultado
        return posicion;
    }
    
}
