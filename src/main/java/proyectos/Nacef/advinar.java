package proyectos.Nacef;

import java.util.Scanner;

public class advinar {

    //declaración de variables
    public final static String abc = "abcdefghijklmnñopqrstuvwxyz";
    public final static char CORRECTO = '0';
    public final static char INCORRECTO = '-';
    public final static char POS_INCORRECTA = 'X';

    public static void main(String[] args) {
        advinar programa = new advinar();
        programa.inicio();
    }

    public void inicio() {
        comprobar();

    }
    //PRIMER NIVEL DE DESCOMPOSIÓN

    //GENERAR PALABRA SECRETA
    //param entrada -> nope
    //param salida -> String (compuesta por 5 char)
    public String generarPalabraSecreta() {
        String palabra = "";
        for (int i = 0; i < 5; i++) {
            palabra += generarLetraAleatoria();
        }
        return palabra;
    }

    //PREGUNTAR TENTATIVA
    //param entrada -> nope
    //param salida -> String, la tentativa
    public String preguntarTentativa() {
        Scanner entrada = new Scanner(System.in);
        //variable donde se recoge la llamada a comprobar scanner
        boolean lecturaOK = false;
        String tentativa = "";
        do {
            System.out.println("Escribe 5 letras");
            tentativa = entrada.next();
            tentativa = tentativa.toLowerCase();
            entrada.nextLine();
            lecturaOK = comprobarRespuesta(tentativa);
            if (!lecturaOK) {
                System.out.println("Esta respuesta o es correcta");
            }
        } while (!lecturaOK);
        return tentativa;
    }

    //COMPROBAR RESPUESTA 
    //param entrada -> String, tentativa de la función preguntarTentativa()
    //param salida -> boleano
    public boolean comprobarRespuesta(String respuesta) {
        if (respuesta.length() != 5) {
            //entonces no es correcto
            //podemos acabar aquí
            return false;
        }
        for (int i = 0; i < respuesta.length(); i++) {
            //asignar una variable char en la posiciÃ³n actual
            char c = respuesta.charAt(i);
            //buscar c en abc
            //si devuelve -1, no está¡
            if (-1 == abc.indexOf(c)) {
                //no es correcta
                //salimos aquí
                return false;
            }
        }
        return true;
    }

    //SEGUNDO NIVEL DE DESCOMPOSICIÓN
    //GENERAR LETRA ALEATORIA
    //param entrada -> nope
    //param salida -> char, la letra aleatoria
    public char generarLetraAleatoria() {
        //nanotime() devuelve el valor tiempo en nanosegundos
        long nano = System.nanoTime();
        //pasarlo a entero
        //encajarlo en 1-27 a base de mod
        int index = (int) (nano % abc.length());
        //encontrar la letra equivalente
        return abc.charAt(index);
    }

    //GENERAR PISTA
    //param entrada -> strings para comparar
    //param salida -> string - pista
    public String generarPista(String secreto, String respuesta) {
        String pista = "";
        //comparacion de cada caracter
        for (int i = 0; i < secreto.length(); i++) {
            //obtener los caracteres a comparar
            char charSecreto = secreto.charAt(i);
            char charRespuesta = respuesta.charAt(i);
            if (charSecreto == charRespuesta) {
                pista += CORRECTO;
            } else if (secreto.indexOf(charRespuesta) != -1) {
                //indexOf busca si el carácter concreto existe en el String
                pista += POS_INCORRECTA;
            } else {
                pista += INCORRECTO;
            }
        }
        return pista;

    }

    public String comprobar() {
        String secreto = generarPalabraSecreta();
        System.out.println(secreto);
        boolean salir = false;
        while (!salir) {
            String palabra = preguntarTentativa();
            String pista = generarPista(secreto, palabra);
            if (palabra.equals(secreto)) {
                System.out.println("Felicidades");
                salir = true;
            } else {
                System.out.println(pista);
            }
        }
        
        return secreto;
    }

}
