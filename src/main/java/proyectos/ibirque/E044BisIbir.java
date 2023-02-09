
package proyectos.ibirque;

import java.util.Scanner;


public class E044BisIbir {


    public static void main(String[] args) {
       
        //variables
        String texto;
        int contador=0;
        
        //inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        texto = sc.nextLine();
        
        System.out.println("escoge una letra ara buscar en el texto");
        String letra = sc.next();
        sc.nextLine();
        
        char caracter = letra.charAt(0);
        
        int inicial = texto.indexOf(letra);
        int ultima = texto.lastIndexOf(letra);
        
        if(inicial > -1){
            System.out.println("Primera aparicion: "+inicial+"\nUltima aparicion: "+ultima);
        }else{
            System.out.println("No aparece.");
        }
        
        //ahora contaremos cuantos aparecen por pantalla
        for(int i = 0; i <= texto.length()-1; i++){
            char c = texto.charAt(i);
            if(c==caracter){
                contador++;
            }
        }
        System.out.println("El caracter seleccionado se repite "+contador+" veces");
        
        String sda = Character.toString(caracter); 
        //split crea un array con elementos de la cadena de texto
        String[] palabras = texto.split(sda);
        for(int j = 0; j < palabras.length; j++){
            System.out.print(palabras[j]+"");
        }
        
    }}
