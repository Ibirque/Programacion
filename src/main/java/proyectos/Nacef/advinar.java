package proyectos.Nacef;

import java.util.Scanner;

public class advinar {
    
    public final static String abc = "abcdefghijklmnñopqrstuvwxyz";
    public final static char CORRECTO = '0';
    public final static char IMCORRECTO = '-';
    public final static char POS_INCORRECT = 'X';

    public static void main(String[] args) {
        advinar programa = new advinar();
        programa.inicio();
    }
    
    public void inicio(){
        
    }
    
    //Metodo generar letra aleatoria
    //parametros entrada --> strings para compara
    //parametros de salida --> string pista - pista
    
    
    //generar pista
    
    
    public String generarPalabraSecreta(){
        String palabra = "";
        for(int i = 0; i < 5; i++){
            palabra += generarLetraAleatoria();
        }
        return palabra;
    }
    
    public String preguntaTentativa(){
        Scanner entrada = new Scanner(System.in);
        boolean lecturaOK = false;
        String tentativa = "";
        
        do{
            System.out.println("Escribe 5 letras");
            tentativa = entrada.next();
            tentativa = tentativa.toLowerCase();
            entrada.nextLine();
            lecturaOK = comprobarRespuesta(tentativa);
            if(!lecturaOK){
                System.out.println("Esta respuesta no es correcta");
            }
        }while(!lecturaOK);
        return tentativa;
    }
    
    public char generarLetraAleatoria() {
        //nanotime() devuelve el valor tiempo en nanosegundos
        long nano = System.nanoTime(); 
        //queremos pasarlo a entero
        int index = (int) (nano % abc.length());
        //encontrar la letra equivalente
        return abc.charAt(index);
    }
    
    
    
    //GENERAR PISTA
    //param entrada --> string para comparar
    //param salida --> string - pista
    public String generarPista(String secreto, String respuesta) {
        String pista = "";
        //comparacion de cada caracter
        for (int i = 0; i < secreto.length(); i++){
            //obtener los caracteres a compara
            char charSecreto = secreto.charAt(i);
            char charRespuesta = respuesta.charAt(i);
            if(charSecreto == charRespuesta) {
                pista += CORRECTO;
            } else if(secreto.indexOf(charRespuesta) != -1){
                //indexof busca si el caracter correcto existe en el String
                pista += POS_INCORRECT;
            } else {
                pista += IMCORRECTO;
            }
        }
         return pista;
    }
    
    
    //COMPROBAR RESPUESTA 
    //param entrada --> tiene que tener un string que es tentativa de la funcion preguntaTentativa
    //param salida --> booleano
    public boolean comprobarRespuesta(String respuesta){
        if(respuesta.length() != 5){
            //entonces no es correcta
            //podemos acabar aqui
            return false;
        }
        for (int i = 0; i < respuesta.length(); i++){
            //asignar una variable char en la posicion actual
            char c = respuesta.charAt(i);
            //buscar c en abc
            //si devuelve -1, no esta
            if (-1 == abc.indexOf(c)){
                //no es correcta
                //salimos aqui
                return false;
            }
        }
        return true;
    }
    
}
