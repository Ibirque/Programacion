package proyectos.Nacef;

import java.io.File;
import java.util.Scanner;


public class E018 {

    public static final String MARCA = "fin";
    
    
    public static void main(String[] args) {
        E018 programa = new E018();
        programa.inicio();
    }
    
    
    //buscar vocales
    
    public void inicio(){
        try{
            File f = new File("C:/temp/Texto.txt");
            Scanner lectura = new Scanner(f);
            //datos que queremos recoger
            int palabras = 0;
            int vocales = 0;
            //marca de finalización
            boolean leer = true;
            while(leer){
                String palabra = lectura.next();
                if(MARCA.equals(palabra)){
                    //marca final
                    leer = false;
                }else{
                    //tratar el dato
                    palabras++;
                    vocales = vocales + contarVocales(palabra);
                }
            }
            System.out.println("Hay " + palabras + " palabras");
            System.out.println("Hay " + vocales + " vocales");
            lectura.close();
        }catch(Exception e){
            System.out.println("Error " + e);
        }
    }
    
    //contar vocales en una palabra
    //param etrada --> string (una palabra)
    //param salida --> int
    public int contarVocales(String palabra){
        int res = 0;
        palabra = palabra.toLowerCase();
        for(int i = 0; i < palabra.length(); i++){
            if(esVocal(palabra.charAt(i))){
                res++;
            }
        }
        return res;
    }
    
    //saber si una letra es vocal
    //paran entrada --> char
    //param salida --> boolean
    public boolean esVocal(char c){
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;
            default: return false;    
        }
    }
}
