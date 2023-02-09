package proyectos.ibirque;

import java.util.Scanner;

public class GRUPOpalabra {

    boolean banderaJuego = false;
    //string de 26 caracteres, saltamos Ñ
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public final static char CORRECTO = '0';
    public final static char INCORRECTO = '-';
    public final static char POS_INCORRECTA = 'X';

    //Queremos generar una palabra completamente aleatoria ("fsadl" por ejemplo, maximo 5 letras)
    //Queremos un input del usuario
    //Queremos recorrer la palabra y si el usuario ha acertado, donde coincida la letra del usuario con la de la palabra indicarlo
    //cuando la letra exista pero no en la posicion correcta pondremos "X", y si no existe _
    public static void main(String[] args) {
        GRUPOpalabra programa = new GRUPOpalabra();
        programa.inicio();
    }

    private void inicio() {

        //LLamamos a las funciones
        //Funcion de juego
        //Funcion de generacion de palabra
        String palabr0 = generarPalabraSecreta();
        System.out.println(palabr0);
        //Aqui inicia el juego  
        do{
        String preguntar = preguntaTentativa();

        String juego = generarPista(palabr0, preguntar);
        System.out.println(juego);
        //quiero atrapar al usuario en un bucle
        finDeJuego(palabr0, preguntar);
        }while (!banderaJuego);
    }

    //PRIMER NIVEL DE DESCOMPOSICION
    //-param entrada -> no
    //param saiida -> un string de 5 char
    public String generarPalabraSecreta() {
        String palabra = "";
        for (int i = 0; i < 5; i++) {
            palabra += generador();
        }
        return palabra;
    }

    //PREGUNTAR TENTATIVA
    //param entrada -> nope
    //param salida -> String, la tentativa
    public String preguntaTentativa() {
        Scanner entrada = new Scanner(System.in);
        //
        boolean lecturaOK = false;
        String tentativa = "";
        do {
            System.out.println("Escribe 5 letras");
            tentativa = entrada.next();
            tentativa = tentativa.toLowerCase();
            entrada.nextLine();
            lecturaOK = comprobarRespuesta(tentativa);
            if (!lecturaOK) {
                System.out.println("Esta respuesta no es correcta");
            }
        } while (!lecturaOK);
        return tentativa;
    }

    //COMPROBAR RESPUESTA
    //param entrada -->> tiene que tener un string que es tentativa de la funcion preguntaTentativa()
    //param salida -->> booleano
    public boolean comprobarRespuesta(String respuesta) {
        if (respuesta.length() != 5) {
            //entonces no es correcta
            //podemos acabar aqui
            return false;
        }
        for (int i = 0; i < respuesta.length(); i++) {
            //asignar una variable char en la posicion actual
            char c = respuesta.charAt(i);
            //buscar c en abc
            //si devuelve -1, no esta
            if (-1 == abc.indexOf(c)) {
                //no es correcta
                //salimos aqui
                return false;
            }
        }
        return true;
    }

    //SEGUNDO NIVEL DE DESCOMPOSICION
    //Parametros de entrada -> no hace falta a menos que tengamos un array anterior
    //Parametros de salida
    public char generador() {
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
        for (int i = 0; i < secreto.length(); i++) {
            //obtener los caracteres a comparar
            char charSecreto = secreto.charAt(i);
            char charRespuesta = respuesta.charAt(i);
            if (charSecreto == charRespuesta) {
                pista += CORRECTO;
            } else if (secreto.indexOf(charRespuesta) != -1) {
                //indexof busca si el caracter correcto existe en el String
                pista += POS_INCORRECTA;
            } else {
                pista += INCORRECTO;
            }
        }

        return pista;
    }

    public void finDeJuego(String secreto, String respuesta) {
        
        short solucion = 0;
        //si respuesta = secreto, fin del juego
        //respuesta =/= el juego continua
        for (int i = 0; i < secreto.length(); i++) {
            char charSecreto = secreto.charAt(i);
            char charRespuesta = respuesta.charAt(i);
            if (charSecreto == charRespuesta) {
                solucion++;
                if (solucion == 5) {
                    System.out.println("Has acertado!");
                    banderaJuego = true;
                }
            }
        }
        
    }

}
