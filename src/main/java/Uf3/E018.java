package Uf3;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class E018 {

    public static final String MARCA = "fin";

    public static void main(String[] args) {
        E018 prog = new E018();
        prog.inicio();
    }

    public void inicio() {
        try {
            File f = new File("e018.txt");            
            Scanner lectura = new Scanner(f);
            //datos que queremos recoger
            int palabras = 0;
            int vocales = 0;
            //marca de finalizacion
            boolean leer = true;
            while (leer) {
                String palabra = lectura.next();
                if(MARCA.equals(palabra)){
                    //marca final
                    leer = false;
                }else{
                    palabras++;
                    vocales = vocales + contarVocales(palabra);
                }
            }
            System.out.println("Hay "+palabras + " palabras");
            System.out.println("Hay "+vocales+" vocales");
            lectura.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    //contar vocales en una palabra
    //param entrada -> string (una palabra)
    //param salida -> int
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
    //param entrada -> char
    //para salida -> bool
    public boolean esVocal(char c) {
        switch (c) {
            case 'a': return true;
            case 'e': return true;
            case 'i': return true;
            case 'o': return true; 
            case 'u': return true;
            default: return false;
           

        }        
    }

}
